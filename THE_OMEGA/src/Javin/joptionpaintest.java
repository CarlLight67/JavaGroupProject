import javax.swing.*;

public class joptionpaintest {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "hello po..", "title", JOptionPane.ERROR_MESSAGE);
        String pangalan =
        JOptionPane.showInputDialog("ok so lagay mo pangalan mo..");
        String pangalan2 =
        JOptionPane.showInputDialog("yan tlaga pangalan mo?..");
        JOptionPane.showMessageDialog(null, "k so.." + pangalan + " pangalan mo.. tas inulit mo pa.. tanga yarn", "title", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "tol sa totoo lang.. pang bisaya haha", "title", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showInputDialog("");
        JOptionPane.showMessageDialog(null, "wala akong pake sa sasabihin mo.. nak..", "title", JOptionPane.ERROR_MESSAGE);
        String pangalan3 = JOptionPane.showInputDialog("");
        JOptionPane.showMessageDialog(null, "sa tingens mo may pake ako sayo?.... ", "title", JOptionPane.ERROR_MESSAGE);
        String response1 = JOptionPane.showInputDialog("");
        if (pangalan3.equals("pakyu")) {
            JOptionPane.showInputDialog("edi wow gago");
        } else if (response1.equals("aketnam")) {
            JOptionPane.showInputDialog("wowers");
            JOptionPane.showMessageDialog(null, "bati na tayo:( ", "title", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "tangalogyarn", "title", JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null, "ok bye", "title", JOptionPane.ERROR_MESSAGE);

        }
    }
}
