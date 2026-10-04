import java.util.*;
import java.text.*; //for decimal format only doesnt really matter

public class testngquiz {
    public static void main(String[] args) {
        Scanner bayag = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        // tol pampa etuc lang to namaoy lang ako ksi may .0 sa kung ilang kape at pastry dont mind it haha kaw bahala kung gusto mo

        double tanginakape = (80.00);
        double pastrytolputangina = (50.00);
        double taxparanggago = (0.05);

        double ganokadamiyungkape;
        double ganokadamiyungpastry;
        double bigay;

        System.out.print("tol ilang kape..: ");
        ganokadamiyungkape = bayag.nextDouble() ;

        System.out.print("tol ilang pastry..: ");
        ganokadamiyungpastry = bayag.nextDouble();

        double sumngkape = tanginakape * ganokadamiyungkape;
        double sumngpastry = pastrytolputangina * ganokadamiyungpastry;
        double bayad = sumngkape + sumngpastry;
        double taxnatintangina = bayad * taxparanggago;
        double totoongpresyo = bayad + taxnatintangina;

        System.out.println("ok so " + df.format(ganokadamiyungkape) + " na kape at " + df.format(ganokadamiyungpastry) + " na pastry..");
        System.out.println("tol mga " + sumngkape +" sa kape " + "tas " + sumngpastry + " sa pastry.. so bale ");
        System.out.println("mga " + bayad + " ibabayad mo. ");
        System.out.println("magkano bigay mo saken???");
        bigay = bayag.nextDouble();
        System.out.println("oki so mga " + bigay + " ang bigay..");
        double baliknapera = bigay - bayad;

        if (bigay < bayad) {
            System.out.println("gago kulang ka tanga ");
            System.out.println("namo wag ka na bumalik balik ka pag hndi na kulang");
        } else {
            System.out.println("oki so mga " + baliknapera + " ang sukle natin bossing..");
            System.out.println("may 5% tax yah.. eto mga " + taxnatintangina + " petot");
            System.out.println("sensya na boss may tax kasi tayo. eto talaga yung kung magkano haha,, " + totoongpresyo);
            double totoongbalik = bigay - totoongpresyo;
            System.out.println("ok ang balik is.. " + totoongbalik);
            System.out.println("sana masaya ka na");
            System.out.println("salamat kingina mo ka ");
        }
    }
}
