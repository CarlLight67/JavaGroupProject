import javax.swing.*;
import java.text.*; //for decimal format only doesnt really matter
public class quizbutjoptionPAIN {
    public static void main(String[] args) {
        DecimalFormat thisremovesthething = new DecimalFormat("#.##");

        double coffeeprice = (80.00);
        double pastriesprice = (50.00);
        double eviltax = (0.05);


        JOptionPane.showMessageDialog(null, "hello bradar.. how many coffees bradar", "", JOptionPane.PLAIN_MESSAGE);
        String coffeeinput = JOptionPane.showInputDialog("");
        double coffeesbradar = Double.parseDouble(coffeeinput);
        JOptionPane.showMessageDialog(null, "ok bradar.. how many pastries bradar", "", JOptionPane.PLAIN_MESSAGE);
        String pastriesinput = JOptionPane.showInputDialog("");
        double pastriesbradar = Double.parseDouble(pastriesinput);
        JOptionPane.showMessageDialog(null, "ok bradar.. so a total of " + thisremovesthething.format(coffeesbradar) + " and " + thisremovesthething.format(pastriesbradar) + " bradar..",
                "", JOptionPane.PLAIN_MESSAGE);

        double coffeehowmuchall = coffeesbradar * coffeeprice;
        double pastryhowmuchall = pastriesbradar * pastriesprice;
        double bill = coffeehowmuchall + pastryhowmuchall;
        double taxofthebill = bill * eviltax;
        double taxedbills = bill + taxofthebill;
        JOptionPane.showMessageDialog(null, "bradar you have a bill of over " + bill + "...",
                "", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "bradar im sorry but we have to tax you 5%.. your bill is now " + taxedbills + "...",
                "", JOptionPane.PLAIN_MESSAGE);
        String howmuchmoney =
                JOptionPane.showInputDialog("bradar how much is the bill you will give me..");
        double howmuch = Double.parseDouble(howmuchmoney);
        if (howmuch < taxedbills) {
            JOptionPane.showMessageDialog(null,
                    " bradar please do not joke me.. you gave me " + howmuch + " ... come back again bradar when you have enough money bradar..", "", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, " ok bradar you gave me " + howmuch + "...",
                    "", JOptionPane.PLAIN_MESSAGE);
            double realbillactually = howmuch - taxedbills;
            JOptionPane.showMessageDialog(null, " ok bradar your change is " + realbillactually + "...",
                    "", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
