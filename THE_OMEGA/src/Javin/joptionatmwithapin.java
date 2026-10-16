import javax.swing.*;

public class joptionatmwithapin {
    public static void main(String[] args) {

        String pinnumber = JOptionPane.showInputDialog(null,
                "Please create your pin number.", "WELCOME TO VINJAVINBANKS", JOptionPane.PLAIN_MESSAGE);
        if (pinnumber.matches("\\d{6}")) {
        } else {
            JOptionPane.showMessageDialog(null, "Wrong format!");
            return;
        }
        String inputPin = JOptionPane.showInputDialog(null, "Enter your 6 digit PIN: ", "Login", JOptionPane.QUESTION_MESSAGE);

        if (inputPin.equals(pinnumber)) {
        } else {
            JOptionPane.showMessageDialog(null, "Wrong pin!");
            return;
        }


        double mybalance = 1000.0;

        JOptionPane.showMessageDialog(null,
                "Welcome, User. Please choose between these options. " +
                        "\n 1 - Balance " +
                        "\n 2 - Deposit " +
                        "\n 3 - Withdraw", "== ATM ==", JOptionPane.PLAIN_MESSAGE);
        String choices = JOptionPane.showInputDialog(null, "", "Your choice is..", JOptionPane.QUESTION_MESSAGE);
        int choice = Integer.parseInt(choices);

        if (choice == 1) {
            JOptionPane.showMessageDialog(null, "Your balance is " + mybalance + "₱" + ".");
        } else if (choice == 2) {
            String deposet = JOptionPane.showInputDialog(null, "", "How much will you deposit?", JOptionPane.QUESTION_MESSAGE);
            int setdepos = Integer.parseInt(deposet);
            if (setdepos > 0) {
                mybalance += setdepos;
                JOptionPane.showMessageDialog(null, "You have deposited an amount of " + deposet + "₱" + ".");
                JOptionPane.showMessageDialog(null, "Your new balance is " + mybalance + "₱" + ".");
            } else {
                JOptionPane.showInputDialog(null, "", "Please input a valid amount.", JOptionPane.QUESTION_MESSAGE);
            }
        } else if (choice == 3) {
            String withdraw = JOptionPane.showInputDialog(null, "", "How much will you withdraw?", JOptionPane.QUESTION_MESSAGE);
            int withdrawers = Integer.parseInt(withdraw);
            if (withdrawers > 0) {
                mybalance -= withdrawers;
                JOptionPane.showMessageDialog(null, "Your have withdrawn an amount of" + withdraw + "₱" + ".");
                JOptionPane.showMessageDialog(null, "Your new balance is " + mybalance + "₱" + ".");
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient funds!");
            }

        } else if (choice == 4) {
            JOptionPane.showMessageDialog(null, "Please input between choices 1-3.");
        }
    }
}
