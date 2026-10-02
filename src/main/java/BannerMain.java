import java.util.Scanner;

public class BannerMain {
    public static void main(String[] args) {

        System.out.println("Enter first name: ");
        Scanner sc = new Scanner(System.in);
        String firstname = sc.nextLine();

        System.out.println("Enter last name: ");
        String lastname = sc.nextLine();

        System.out.println("Enter your age: ");
        String age = sc.nextLine();

        System.out.println("Enter your institute: ");
        String institute = sc.nextLine();

        // what if the user didnt want to add its editor
        System.out.println("Enter your text editor/IDE: (press enter to skip)");
        String editor = sc.nextLine().trim();
        if (editor.isEmpty()) {
            editor = "N/A";
        }

        System.out.println("How many programming languages did you learn: (answer with number)");
        int ans = Integer.parseInt(sc.nextLine().trim());
        // bad code : int ans = sc.nextInt();
        String[] tab = new String[ans];
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Enter language " + (i + 1) + ": ");
            tab[i] = sc.nextLine();
        }
        String languages = String.join(", ", tab);

        System.out.println("How many Computer languages do you know: (answer with number)");
        int ans2 = Integer.parseInt(sc.nextLine().trim());
        String[] tab2 = new String[ans2];
        for (int i = 0; i < tab2.length; i++) {
            System.out.println("Enter Computer language " + (i + 1) + ": ");
            tab2[i] = sc.nextLine();
        }
        String clanguages = String.join(", ", tab2);

        System.out.println("How many Real languages do you speak: (answer with number)");
        int ans3 = Integer.parseInt(sc.nextLine().trim());
        String[] tab3 = new String[ans3];
        for (int i = 0; i < tab3.length; i++) {
            System.out.println("Enter Real language " + (i + 1) + ": ");
            tab3[i] = sc.nextLine();
        }
        String rlanguages = String.join(", ", tab3);

        System.out.println("Enter your first email: ");
        String email1 = sc.nextLine().trim();

        System.out.println("Enter your second email (if you don't have it, skip by clicking enter): ");
        String email2 = sc.nextLine().trim();

        System.out.println("Enter your LinkedIn(press enter to skip): ");
        String linkedin = sc.nextLine().trim();

        System.out.println("Enter your X account(press enter to skip): ");
        String x = sc.nextLine().trim();

        System.out.println("Enter your GitHub username (press enter to skip): ");
        String github = sc.nextLine().trim();

        String ghRepos = "N/A", ghFollowers = "N/A", ghFollowing = "N/A", ghStars = "N/A";
        if (!github.isEmpty()) {
            GithubStats stats = GithubStats.fetch(github);
            if (stats != null) {
                ghRepos = String.valueOf(stats.publicRepos);
                ghFollowers = String.valueOf(stats.followers);
                ghFollowing = String.valueOf(stats.following);
                ghStars = String.valueOf(stats.totalStars);
            }
        }
//        int i = 0;
//        String[] tab = new String[ans];
//        while (i < tab.length){
//            System.out.println("Enter the language: ");
//            tab[i] = sc.nextLine();
//            System.out.println(tab[i]);
//            i++;
//        }
//        System.out.println(tab[0] + " " + tab[1]);


        System.out.println("kkkOOkkkkOO000000000KKXXXXXXXXXXXXXXXNNNNNNNNXXXXXXXXKKKKKKKKKK000000000OOOOOOOO\n" +
                "kkOOOOkkkkOO0O000000KKXXXXXXXXXXXXXXNNNNNNNNNNNXXXXXXXKKKKKKKKK0000000000OOOOOOO" + "\t"+ firstname +"@" + lastname +"------------------------------------------------------------" + "\n" +
                "kkkOOOOkkOOO0000KKKKKKXXXXXXXXXXXXXXNNNNNNNNNNNXXXXXXXXKKKKKKKKK0000000000OOOOOO" + "\t" +"OS: " + System.getProperty("os.name") + "\n" +
                "kkkOOkkkkkOO00XKXXKKKXXXXXXXXXXXXXXXNNNNNNNNNNNNNXXXXXXXXKKKKKKKK0000000000OOOOO" + "\t" + "Uptime: " + age + "\n" +
                "kkkkkkkkkkOOOKKKXXXXKXXXXXXXXXXXXXXNNNNNNNNNNNNNNNXXXXXXXXXKKKKKKKK000000000OOOO" + "\t" + "Host: " + institute + "\n" +
                "kkxkkkkkkkOOO0KKNXXXXXXXXXXXXXXXXXXNNNNNNNWNNNNNNNNXXXXXXXXXKKKKKKKK0000000OOOOO" + "\t" + "Texte editor/IDE: " + editor + "\n" +
                "kxxkkOOOkkOOO0KKNXXXXXXXNNXXXNXX0xoloxk0NNWWWNNNNNNNXXXXXXXKKKKKKKK00000000OOOOO\t" + ".\n" +
                "kxxkkkkOkkOOO0KKXKXXXXXXNNNNXXo. ..  ....cKWWWNNNNNNXXXXXXKKKKK00000000OOOOOOOOO" + "\t" + "Languages.Programming: " + languages + "\n" +
                "kxxxkxkkOkOOO00KNKXXXKKXNNNNKloxdddollccc'.lNNNNNNNXXXXKKKKKKKK0000000OOOOOOOOOO" + "\t" + "Languages.Computer: " + clanguages + "\n" +
                "kkxxkkkkOOOOO00KXKXXXXXXNNNNd000kkxxolcclc..ONNNNNNXXXKKKKKKKK000000000OOOOOOOOO" + "\t" + "Languages.Computer: " + rlanguages + "\n" +
                "kkxxxxxkkOOOO00KXKXXXXKXNNNNxOOkkkxdc,,;col.lNNNNXXXKKKKKKK000000000000OOOOOOOOO\t" + ".\n" +
                "kkxxkxxkkOOOOO0KNKKXXXKKNNNN0kl::dkc,.':;lo,:0XXXXKKK000000000000000000OOOOOOOOO\t" + "Contact\n" +
                "kkxxkxxkkOOOO00KXKKXXXXXXNNN0OxdxOxcc:;:clocccOXKKKK00OOOOOOOO0000000000OOOOOOOO\t" + "Email.Personal: " + email1 + "\n" +
                "kkxkxxxxxkOOOO0KXKKXXXXXXXXN0O00Oko::::cloo:clKKK0000OOOkkkkkOOOOOOOO00OOOOOOOOO\t" + "Email.Personal: " + email2 + "\n" +
                "xxxkkkkkkOOOOO0KXKKXXXKKXNNNXOOkkkoc,;;;cllc0KXK00OOOOkkkxxxxkkkOOOOOOOOOOOOOOOO\t" + "LinkedIn: " + linkedin + "\n" +
                "dxdxxxkkkOOOOOO0XKKXXXXXXNNNXXOdooo:,,;;::,dXXK00OOOkkkkkxxxxxxkOOOOO00OOOOOOOOO\t" + "X: " + x + "\n" +
                "ddddddxxkkOOOOO0NK0KXXXXXNNNXNXd;ldo:;;,'.,OXKK00OkkkxxkkkddxxxxkOOO0000OO0OOOOO\t" + ".\n" +
                "odoodddxkkkkkOO0K00KKKXXXNXXXX0ko'''..  .;lkKK00OkkkxxxxxxxxxkkkkOOOOOOOOO00OkOO\t" + "Githb stats\n" +
                "dddodddxkkkkkkkOOOO000OO0kxOkocdOkdc,.';:llldkkkkkxxddddxkOkkkkkkkOOOkxxxkkkkkOO\t" + "Repos: " + ghRepos + "\n" +
                "dxododxxkkkkxkkkOkxdoodl::cxdl'lOkxdc;;:cllc.clooooollllldxxxxxxxxkkkxdddddxxkkk\t" + "Followers: " + ghFollowers + "\n" +
                "odooddxxkxxxxxkOkddxlc:d;'cddo:.cxdlclc:ccc'.c::;:ccc::::lddddddddxkkdolcloddxkk\t" + "Following: " + ghFollowing + "\n" +
                "ooooooodxxxxdk0xkllk:;:ox'.llol:,:lcld::cc::ll::::;cool:,;coooollloxxl:::clodxxx\t" + "Stars: " + ghStars + "\n" +
                "lollolloodddkOkxol:k;,:lkc,:loxo:;;:clllodxxdd:,,;:ddodol;.'cocc::odxo:;:cloxxxx\n" +
                "llcccclllooxOxkxcc'o;,clkd:;oodxc;l:;:coxxol;,..,codoocold'..:;:c:odxdc;cclodxxx\n" +
                "llc:::clllo0Ooddx;'l,'odOxllclodd,od:;cl:'',,'.;:;lod;clooo...,::coxxxoccclodxxk\n" +
                "llc;,;:cllkOxx:old':'lxxkdllol:ld:doc;.',,,;;::;;cox,,llclo: ...;:odokx:'',;OKXX\n" +
                "ccc. .,::xOkxxo:l:::,kkxxoccodo;ccl:;,;:cllc,,;:loxo.:lcolco   ..:odlkOk. ..xkkk\n" +
                "ccl'.';cokkxkod::;,;oxOxodlccldo:cooc:odoc:;;;:codd,'coc:ccl' .;clodoxOOo::cd,;;\n" +
                "cco'.,:codolllc;,'.;oxxooooc:cloolclcl:;::::::codd:.locllclo: 'kOloooxkkOkkdd';,\n" +
                "ccl,.;cokOkkdc;'...lollllllllccccc::::ccc:;,,:odoc.:lddcdocc: .cOl';:dxk00xxk:..\n" +
                ";:l,.';okxdol:;;, .cooodddooolllcccllcc:::;:lodo;.'dxdloccccl...xol;:okxOOkkO...\n" +
                ",;l;.';ddoc:,'''. .codolooooollllllllllcllllooc,. .ollcc;;,,;'..dlcclOOxkkOko ..\n" +
                ",;c;..lolc;'....  .looddolloooooooooolol:::c:,...  cOOxoc:;;:,..x;:olx0xkxkd; ..\n" +
                "cccc::llcccccc::::;:,';:cc;,;;::c,::;,:c:;;,,:;::::cooolcc::::;:o:;lddodxddd;,,;\n" +
                "cccccccclllllcccco;::;;;;;,,;;;:::;,,,,;;:::;'.,::ccc:ccllloooooolllllollllcllll\n" +
                "::::::::ccccclolol;;;;:cccccclloodkxdoc:;;;;;:ccclccccclllllloolllllllllllllllll\n" +
                ";:::cldxc;;;;ccc:,'',dxkO000kkxdoddddolllcccccccc:cccclllllloolclllllolllllllllo\n" +
                "lllllooxo....''',,,,oOOOOkc:,..........',;;;:::::cclcccccllllllllllllllclcclccll\n" +
                "oooooooollclloooooooxxkkko'..........',;;:ccccll:cllcccllooocllllccclllllllcllll\n" +
                "oooolllloooodooooooooolllc:::ccccc::::ccccclllclloolcclooollcllclcllllllllclclll");


    }
}
