import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Fetches basic GitHub stats for a user with the public REST API.
 * Requires Java 11+. No external libraries.
 *
 * Unauthenticated requests are limited to 60/hour. For more, set an env var
 * GITHUB_TOKEN with a personal access token (no scopes needed for public data).
 */
public class GithubStats {

    private static final HttpClient CLIENT = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(5))
            .build();

    public final String username;
    public final int publicRepos;
    public final int followers;
    public final int following;
    public final int totalStars;

    private GithubStats(String username, int publicRepos, int followers, int following, int totalStars) {
        this.username = username;
        this.publicRepos = publicRepos;
        this.followers = followers;
        this.following = following;
        this.totalStars = totalStars;
    }

    /** Returns stats, or null if the user doesn't exist / the request fails. */
    public static GithubStats fetch(String username) {
        try {
            String user = get("https://api.github.com/users/" + username);
            if (user == null) return null;

            int repos = intField(user, "public_repos");
            int followers = intField(user, "followers");
            int following = intField(user, "following");

            // Sum stars across repos (first 100 repos is enough for most people)
            String reposJson = get("https://api.github.com/users/" + username + "/repos?per_page=100");
            int stars = 0;
            if (reposJson != null) {
                Matcher m = Pattern.compile("\"stargazers_count\"\\s*:\\s*(\\d+)").matcher(reposJson);
                while (m.find()) stars += Integer.parseInt(m.group(1));
            }

            return new GithubStats(username, repos, followers, following, stars);
        } catch (Exception e) {
            return null;
        }
    }

    private static String get(String url) throws Exception {
        HttpRequest.Builder req = HttpRequest.newBuilder(URI.create(url))
                .timeout(Duration.ofSeconds(10))
                .header("Accept", "application/vnd.github+json")
                .header("User-Agent", "banner-app");

        String token = System.getenv("GITHUB_TOKEN");
        if (token != null && !token.isBlank()) {
            req.header("Authorization", "Bearer " + token);
        }

        HttpResponse<String> res = CLIENT.send(req.build(), HttpResponse.BodyHandlers.ofString());
        return res.statusCode() == 200 ? res.body() : null;
    }

    private static int intField(String json, String field) {
        Matcher m = Pattern.compile("\"" + field + "\"\\s*:\\s*(\\d+)").matcher(json);
        return m.find() ? Integer.parseInt(m.group(1)) : 0;
    }

    /** Lines ready to drop into the banner. */
    public String toBannerText() {
        return "Repos: " + publicRepos + "\n"
                + "Followers: " + followers + "\n"
                + "Following: " + following + "\n"
                + "Stars: " + totalStars;
    }
}