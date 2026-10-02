import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BannerMain {

    // ---------- Colors (set the NO_COLOR env var to disable) ----------
    private static final boolean COLOR = System.getenv("NO_COLOR") == null;
    private static final String RESET = COLOR ? "\u001B[0m" : "";
    private static final String DIM = COLOR ? "\u001B[2m" : "";
    private static final String ART_COLOR = COLOR ? "\u001B[36m" : "";       // cyan
    private static final String TITLE_COLOR = COLOR ? "\u001B[1;36m" : "";   // bold cyan
    private static final String HEAD_COLOR = COLOR ? "\u001B[1;32m" : "";    // bold green
    private static final String LABEL_COLOR = COLOR ? "\u001B[1;33m" : "";   // bold yellow

    private static final int LABEL_WIDTH = 12;
    private static final int GAP = 4; // spaces between art and info

    private static final Scanner sc = new Scanner(System.in);

    private static final String ART = """
kkkOOkkkkOO000000000KKXXXXXXXXXXXXXXXNNNNNNNNXXXXXXXXKKKKKKKKKK000000000OOOOOOOO
kkOOOOkkkkOO0O000000KKXXXXXXXXXXXXXXNNNNNNNNNNNXXXXXXXKKKKKKKKK0000000000OOOOOOO
kkkOOOOkkOOO0000KKKKKKXXXXXXXXXXXXXXNNNNNNNNNNNXXXXXXXXKKKKKKKKK0000000000OOOOOO
kkkOOkkkkkOO00XKXXKKKXXXXXXXXXXXXXXXNNNNNNNNNNNNNXXXXXXXXKKKKKKKK0000000000OOOOO
kkkkkkkkkkOOOKKKXXXXKXXXXXXXXXXXXXXNNNNNNNNNNNNNNNXXXXXXXXXKKKKKKKK000000000OOOO
kkxkkkkkkkOOO0KKNXXXXXXXXXXXXXXXXXXNNNNNNNWNNNNNNNNXXXXXXXXXKKKKKKKK0000000OOOOO
kxxkkOOOkkOOO0KKNXXXXXXXNNXXXNXX0xoloxk0NNWWWNNNNNNNXXXXXXXKKKKKKKK00000000OOOOO
kxxkkkkOkkOOO0KKXKXXXXXXNNNNXXo. ..  ....cKWWWNNNNNNXXXXXXKKKKK00000000OOOOOOOOO
kxxxkxkkOkOOO00KNKXXXKKXNNNNKloxdddollccc'.lNNNNNNNXXXXKKKKKKKK0000000OOOOOOOOOO
kkxxkkkkOOOOO00KXKXXXXXXNNNNd000kkxxolcclc..ONNNNNNXXXKKKKKKKK000000000OOOOOOOOO
kkxxxxxkkOOOO00KXKXXXXKXNNNNxOOkkkxdc,,;col.lNNNNXXXKKKKKKK000000000000OOOOOOOOO
kkxxkxxkkOOOOO0KNKKXXXKKNNNN0kl::dkc,.':;lo,:0XXXXKKK000000000000000000OOOOOOOOO
kkxxkxxkkOOOO00KXKKXXXXXXNNN0OxdxOxcc:;:clocccOXKKKK00OOOOOOOO0000000000OOOOOOOO
kkxkxxxxxkOOOO0KXKKXXXXXXXXN0O00Oko::::cloo:clKKK0000OOOkkkkkOOOOOOOO00OOOOOOOOO
xxxkkkkkkOOOOO0KXKKXXXKKXNNNXOOkkkoc,;;;cllc0KXK00OOOOkkkxxxxkkkOOOOOOOOOOOOOOOO
dxdxxxkkkOOOOOO0XKKXXXXXXNNNXXOdooo:,,;;::,dXXK00OOOkkkkkxxxxxxkOOOOO00OOOOOOOOO
ddddddxxkkOOOOO0NK0KXXXXXNNNXNXd;ldo:;;,'.,OXKK00OkkkxxkkkddxxxxkOOO0000OO0OOOOO
odoodddxkkkkkOO0K00KKKXXXNXXXX0ko'''..  .;lkKK00OkkkxxxxxxxxxkkkkOOOOOOOOO00OkOO
dddodddxkkkkkkkOOOO000OO0kxOkocdOkdc,.';:llldkkkkkxxddddxkOkkkkkkkOOOkxxxkkkkkOO
dxododxxkkkkxkkkOkxdoodl::cxdl'lOkxdc;;:cllc.clooooollllldxxxxxxxxkkkxdddddxxkkk
odooddxxkxxxxxkOkddxlc:d;'cddo:.cxdlclc:ccc'.c::;:ccc::::lddddddddxkkdolcloddxkk
ooooooodxxxxdk0xkllk:;:ox'.llol:,:lcld::cc::ll::::;cool:,;coooollloxxl:::clodxxx
lollolloodddkOkxol:k;,:lkc,:loxo:;;:clllodxxdd:,,;:ddodol;.'cocc::odxo:;:cloxxxx
llcccclllooxOxkxcc'o;,clkd:;oodxc;l:;:coxxol;,..,codoocold'..:;:c:odxdc;cclodxxx
llc:::clllo0Ooddx;'l,'odOxllclodd,od:;cl:'',,'.;:;lod;clooo...,::coxxxoccclodxxk
llc;,;:cllkOxx:old':'lxxkdllol:ld:doc;.',,,;;::;;cox,,llclo: ...;:odokx:'',;OKXX
ccc. .,::xOkxxo:l:::,kkxxoccodo;ccl:;,;:cllc,,;:loxo.:lcolco   ..:odlkOk. ..xkkk
ccl'.';cokkxkod::;,;oxOxodlccldo:cooc:odoc:;;;:codd,'coc:ccl' .;clodoxOOo::cd,;;
cco'.,:codolllc;,'.;oxxooooc:cloolclcl:;::::::codd:.locllclo: 'kOloooxkkOkkdd';,
ccl,.;cokOkkdc;'...lollllllllccccc::::ccc:;,,:odoc.:lddcdocc: .cOl';:dxk00xxk:..
;:l,.';okxdol:;;, .cooodddooolllcccllcc:::;:lodo;.'dxdloccccl...xol;:okxOOkkO...
,;l;.';ddoc:,'''. .codolooooollllllllllcllllooc,. .ollcc;;,,;'..dlcclOOxkkOko ..
,;c;..lolc;'....  .looddolloooooooooolol:::c:,...  cOOxoc:;;:,..x;:olx0xkxkd; ..
cccc::llcccccc::::;:,';:cc;,;;::c,::;,:c:;;,,:;::::cooolcc::::;:o:;lddodxddd;,,;
cccccccclllllcccco;::;;;;;,,;;;:::;,,,,;;:::;'.,::ccc:ccllloooooolllllollllcllll
::::::::ccccclolol;;;;:cccccclloodkxdoc:;;;;;:ccclccccclllllloolllllllllllllllll
;:::cldxc;;;;ccc:,'',dxkO000kkxdoddddolllcccccccc:cccclllllloolclllllolllllllllo
lllllooxo....''',,,,oOOOOkc:,..........',;;;:::::cclcccccllllllllllllllclcclccll
oooooooollclloooooooxxkkko'..........',;;:ccccll:cllcccllooocllllccclllllllcllll
oooolllloooodooooooooolllc:::ccccc::::ccccclllclloolcclooollcllclcllllllllclclll
""";

    // ---------- Input helpers ----------
    private static String ask(String prompt) {
        System.out.print(prompt + ": ");
        return sc.nextLine().trim();
    }

    private static String askOptional(String prompt) {
        return ask(prompt + " (enter to skip)");
    }

    private static int askCount(String prompt) {
        while (true) {
            try {
                int n = Integer.parseInt(ask(prompt + " (number)"));
                if (n >= 0) return n;
            } catch (NumberFormatException ignored) {
            }
            System.out.println("  Please enter a valid number (0 or more).");
        }
    }

    private static String askList(String question, String itemLabel) {
        int n = askCount(question);
        String[] items = new String[n];
        for (int i = 0; i < n; i++) {
            items[i] = ask("  " + itemLabel + " " + (i + 1));
        }
        return String.join(", ", items);
    }

    // ---------- Banner helpers ----------
    private static String paint(String color, String text) {
        return color + text + RESET;
    }

    /** Adds "Label       : value", skipped when the value is empty. */
    private static void row(List<String> out, String label, String value) {
        if (value == null || value.isEmpty()) return;
        out.add(paint(LABEL_COLOR, String.format("%-" + LABEL_WIDTH + "s", label))
                + paint(DIM, ": ") + value);
    }

    private static void section(List<String> out, String name) {
        out.add("");
        out.add(paint(HEAD_COLOR, "[ " + name + " ]"));
    }

    private static String paletteBar(String prefix) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) sb.append("\u001B[").append(prefix).append(i).append("m   ");
        return sb.append(RESET).toString();
    }

    public static void main(String[] args) {

        // ---------- Collect data ----------
        String firstname = ask("First name");
        String lastname = ask("Last name");
        String age = ask("Age");
        String institute = ask("Institute");
        String editor = askOptional("Text editor/IDE");

        String languages = askList("How many programming languages did you learn", "Language");
        String clanguages = askList("How many computer languages do you know", "Computer language");
        String rlanguages = askList("How many real languages do you speak", "Real language");

        String email1 = ask("First email");
        String email2 = askOptional("Second email");
        String linkedin = askOptional("LinkedIn");
        String x = askOptional("X account");
        String github = askOptional("GitHub username");

        GithubStats stats = null;
        if (!github.isEmpty()) {
            System.out.println("Fetching GitHub stats...");
            stats = GithubStats.fetch(github);
        }

        // ---------- Build the info column ----------
        List<String> info = new ArrayList<>();
        String title = firstname + "@" + lastname;
        info.add(paint(TITLE_COLOR, title));
        info.add(paint(DIM, "-".repeat(title.length())));

        row(info, "OS", System.getProperty("os.name"));
        row(info, "Host", institute);
        row(info, "Uptime", age.isEmpty() ? "" : age + " years");
        row(info, "Editor", editor);

        section(info, "Languages");
        row(info, "Programming", languages);
        row(info, "Computer", clanguages);
        row(info, "Real", rlanguages);

        section(info, "Contact");
        row(info, "Email", email1);
        row(info, "Email 2", email2);
        row(info, "LinkedIn", linkedin);
        row(info, "X", x);

        if (!github.isEmpty()) {
            section(info, "GitHub");
            row(info, "User", github);
            if (stats != null) {
                row(info, "Repos", String.valueOf(stats.publicRepos));
                row(info, "Followers", String.valueOf(stats.followers));
                row(info, "Following", String.valueOf(stats.following));
                row(info, "Stars", String.valueOf(stats.totalStars));
            } else {
                row(info, "Status", "stats unavailable");
            }
        }

        if (COLOR) {
            info.add("");
            info.add(paletteBar("4"));
            info.add(paletteBar("10"));
        }

        // ---------- Print art + info side by side ----------
        List<String> art = ART.lines().toList();
        int artWidth = art.stream().mapToInt(String::length).max().orElse(0);
        int rows = Math.max(art.size(), info.size());
        int infoOffset = Math.max(0, (art.size() - info.size()) / 2); // vertically centre the info

        System.out.println();
        for (int i = 0; i < rows; i++) {
            String artLine = i < art.size() ? art.get(i) : "";
            String padded = String.format("%-" + artWidth + "s", artLine);

            int infoIndex = i - infoOffset;
            String infoLine = (infoIndex >= 0 && infoIndex < info.size()) ? info.get(infoIndex) : "";

            System.out.println(paint(ART_COLOR, padded) + " ".repeat(GAP) + infoLine);
        }
        System.out.println();
    }
}