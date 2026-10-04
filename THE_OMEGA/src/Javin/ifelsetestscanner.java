import java.util.Scanner;



public class ifelsetestscanner {

    public static void main(String[] args) {
        Scanner agename = new Scanner(System.in);

        System.out.println("Please enter your name.");
        String pangalan = agename.nextLine();

        if (pangalan.equals("xavier martinez")) {
            System.out.println("xavier martinez is a DORK... because he doesnt reply to MESSAGES... in our GROUP CHAT.");
        } else if (pangalan.equals("francheska erpelo")) {
            System.out.println("you are the love of my LIFE... my sugar plam plam.. honey bunch");
        } else if (pangalan.equals("mhar gelo gallardo")) {
            System.out.println("ang pogi mo tol tangina");
        } else if (pangalan.equals("crixan aisen delmendo")) {
            System.out.println("you are so NICHE.");
        } else if (pangalan.equals("joshua peralta")) {
            System.out.println("hoy joshua hello po");
        } else if (pangalan.equals("kenan bernardo")) {
            System.out.println("hello parker cannon");
        } else if (pangalan.equals("khervin cariaga")) {
            System.out.println("hati na yung bass mo boss");
        } else {
            System.out.println("Your name is.. " + pangalan +".");
        }
    }
}



