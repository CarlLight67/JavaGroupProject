import javax.swing.*;

public class joption {
    public static void main(String[] args) {
      String pangalan = "";
      pangalan = JOptionPane.showInputDialog("lagay mo pangalan mo tanga");
      String pangalan2 = "";
       pangalan2 = JOptionPane.showInputDialog("kulet ampota ilagay mo nalang");
        String pangalaners = "ikaw ba tong tangang si " + pangalan + "." +
                " kulit nampotangina paulit ulit pa ksi ikaw pla tlaga si " + pangalan2 + "." + " para kang bisaya tangina mo" + "";
        String pangalan 3 = "";
        pangalan3  = JOptionPane.showInputDialog("lagay mo pangalan mo tanga");
        JOptionPane.showMessageDialog(null, pangalaners, "Title Bar", JOptionPane.ERROR_MESSAGE);

    }
}
