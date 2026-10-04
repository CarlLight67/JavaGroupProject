import java.util.*;

public class testngquiz {
    public static void main(String[] args) {
        Scanner bayag = new Scanner(System.in);

        double tanginakape = (80.00);
        double pastrytolputangina = (50.00);
        double taxparanggago = (0.05);

        double ganokadamiyungkape;
        double ganokadamiyungpastry;
        double bigay;

        System.out.println("tol ilang kape..");
        ganokadamiyungkape = bayag.nextDouble() ;

        System.out.println("tol ilang pastry..");
        ganokadamiyungpastry = bayag.nextDouble();

        double sumngkape = tanginakape * ganokadamiyungkape;
        double sumngpastry = pastrytolputangina * ganokadamiyungpastry;
        double bayad = sumngkape + sumngpastry;
        double taxnatintangina = bayad * taxparanggago;
        double totoongpresyo = bayad + taxnatintangina;

        System.out.println("ok so " + ganokadamiyungkape + " na kape at " + ganokadamiyungpastry + " na pastry..");
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
