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
        System.out.println("Enter your text editor/IDE: ");
        String editor = sc.nextLine();

        System.out.println("How many programming languages did you learn: (answer with number)");
        int ans = sc.nextInt();
        int i = 0;
        int tab[]={};
        while (i < ans){
            System.out.println("Enter the language");
        }

        System.out.println("kkkOOkkkkOO000000000KKXXXXXXXXXXXXXXXNNNNNNNNXXXXXXXXKKKKKKKKKK000000000OOOOOOOO\n" +
                "kkOOOOkkkkOO0O000000KKXXXXXXXXXXXXXXNNNNNNNNNNNXXXXXXXKKKKKKKKK0000000000OOOOOOO" + "\t"+ firstname +"@" + lastname +"------------------------------------------------------------" + "\n" +
                "kkkOOOOkkOOO0000KKKKKKXXXXXXXXXXXXXXNNNNNNNNNNNXXXXXXXXKKKKKKKKK0000000000OOOOOO" + "\t" +"OS: " + System.getProperty("os.name") + "\n" +
                "kkkOOkkkkkOO00XKXXKKKXXXXXXXXXXXXXXXNNNNNNNNNNNNNXXXXXXXXKKKKKKKK0000000000OOOOO" + "\t" + "Uptime: " + age + "\n" +
                "kkkkkkkkkkOOOKKKXXXXKXXXXXXXXXXXXXXNNNNNNNNNNNNNNNXXXXXXXXXKKKKKKKK000000000OOOO" + "\t" + "Host: " + institute + "\n" +
                "kkxkkkkkkkOOO0KKNXXXXXXXXXXXXXXXXXXNNNNNNNWNNNNNNNNXXXXXXXXXKKKKKKKK0000000OOOOO" + "\t" + "Texte editor/IDE: " + editor + "\n" +
                "kxxkkOOOkkOOO0KKNXXXXXXXNNXXXNXX0xoloxk0NNWWWNNNNNNNXXXXXXXKKKKKKKK00000000OOOOO\t" + ".\n" +
                "kxxkkkkOkkOOO0KKXKXXXXXXNNNNXXo. ..  ....cKWWWNNNNNNXXXXXXKKKKK00000000OOOOOOOOO" + "\t" + "Languages.Programming: " + lprogramming
                "kxxxkxkkOkOOO00KNKXXXKKXNNNNKloxdddollccc'.lNNNNNNNXXXXKKKKKKKK0000000OOOOOOOOOO\n" +
                "kkxxkkkkOOOOO00KXKXXXXXXNNNNd000kkxxolcclc..ONNNNNNXXXKKKKKKKK000000000OOOOOOOOO\n" +
                "kkxxxxxkkOOOO00KXKXXXXKXNNNNxOOkkkxdc,,;col.lNNNNXXXKKKKKKK000000000000OOOOOOOOO\n" +
                "kkxxkxxkkOOOOO0KNKKXXXKKNNNN0kl::dkc,.':;lo,:0XXXXKKK000000000000000000OOOOOOOOO\n" +
                "kkxxkxxkkOOOO00KXKKXXXXXXNNN0OxdxOxcc:;:clocccOXKKKK00OOOOOOOO0000000000OOOOOOOO\n" +
                "kkxkxxxxxkOOOO0KXKKXXXXXXXXN0O00Oko::::cloo:clKKK0000OOOkkkkkOOOOOOOO00OOOOOOOOO\n" +
                "xxxkkkkkkOOOOO0KXKKXXXKKXNNNXOOkkkoc,;;;cllc0KXK00OOOOkkkxxxxkkkOOOOOOOOOOOOOOOO\n" +
                "dxdxxxkkkOOOOOO0XKKXXXXXXNNNXXOdooo:,,;;::,dXXK00OOOkkkkkxxxxxxkOOOOO00OOOOOOOOO\n" +
                "ddddddxxkkOOOOO0NK0KXXXXXNNNXNXd;ldo:;;,'.,OXKK00OkkkxxkkkddxxxxkOOO0000OO0OOOOO\n" +
                "odoodddxkkkkkOO0K00KKKXXXNXXXX0ko'''..  .;lkKK00OkkkxxxxxxxxxkkkkOOOOOOOOO00OkOO\n" +
                "dddodddxkkkkkkkOOOO000OO0kxOkocdOkdc,.';:llldkkkkkxxddddxkOkkkkkkkOOOkxxxkkkkkOO\n" +
                "dxododxxkkkkxkkkOkxdoodl::cxdl'lOkxdc;;:cllc.clooooollllldxxxxxxxxkkkxdddddxxkkk\n" +
                "odooddxxkxxxxxkOkddxlc:d;'cddo:.cxdlclc:ccc'.c::;:ccc::::lddddddddxkkdolcloddxkk\n" +
                "ooooooodxxxxdk0xkllk:;:ox'.llol:,:lcld::cc::ll::::;cool:,;coooollloxxl:::clodxxx\n" +
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
