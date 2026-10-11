package Light_Yagami_Project.TRAINING_LAB;
import java.util.*;
import javax.swing.*;
public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\u001B[34m" + "DATABASE IS RUNNING......");

        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"ENTER A VALUE ONLY 1-5"));
        switch (a) {
            case 1:
                msg1(a);
                break;
            case 2:
                msg2(a);
                break;
            case 3:
                msg3(a);
                break;
            case 4:
                msg4(a);
                break;
            case 5:
                msg5(a);
                break;

            default:
                msge(a);
                break;
          }
    }
    public static void msg1(int num){
        JOptionPane.showMessageDialog(null,"YOUR GAY");

    }
    public static void msg2(int num){
        JOptionPane.showMessageDialog(null,"YOUR LESBIAN");

    }
    public static void msg3(int num){
        JOptionPane.showMessageDialog(null,"YOUR NIGGA");

    }
    public static void msg4(int num){
        JOptionPane.showMessageDialog(null,"YOUR POOR");

    }
    public static void msg5(int num){
        JOptionPane.showMessageDialog(null,"YOUR HAMOOD");

    }
    public static void msge(int num){
        JOptionPane.showMessageDialog(null,"YOU GOT NOTHING!");

    }
}
