import javax.swing.*;

public class vendingmachineinjoption {
    public static void main(String[] args) {

        double credit = 0.00;
        do {
            String input = JOptionPane.showInputDialog(null, "Welcome to the Vending Machine. Please choose between these options to get started."
                    + "\n 1 - Insert Money"
                    + "\n 2 - Buy Item"
                    + "\n 3 - Check Credits"
                    + "\n 4 - Exit", "Vending Machine", JOptionPane.PLAIN_MESSAGE);
            int choice = Integer.parseInt(input);

            if (choice == 1) {
                JOptionPane.showMessageDialog(null, "Please insert the amount of cash you would like to insert.", "INSERT MONEY", JOptionPane.QUESTION_MESSAGE);
                String inputofamount = JOptionPane.showInputDialog("");
                double amountofmoney = Double.parseDouble(inputofamount);
                if (amountofmoney <= 0) {
                    JOptionPane.showMessageDialog(null, "Invalid amount!", "", JOptionPane.ERROR_MESSAGE);
                } else {
                    credit += amountofmoney;
                    JOptionPane.showMessageDialog(null, "Your new balance is " + credit + ".", "", JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (choice == 2) {
                String snacks = JOptionPane.showInputDialog(null, "Please choose between these snacks."
                                + "\n Soda (1.50)"
                                + "\n Chips (2.00)"
                                + "\n Candy (1.25)"
                        , "Vending Machine", JOptionPane.PLAIN_MESSAGE);
                double price = 0.00;
                if (snacks.equalsIgnoreCase("Soda")) {
                    price = 1.50;
                } else if (snacks.equalsIgnoreCase("Chips")) {
                    price = 2.00;
                } else if (snacks.equalsIgnoreCase("Candy")) {
                    price = 1.25;
                }
                if (price == 0) {
                    JOptionPane.showMessageDialog(null, "Invalid option!" + credit + ".", "", JOptionPane.ERROR_MESSAGE);
                } else if (credit >= price) {
                    credit -= price;
                    JOptionPane.showMessageDialog(null, "Your new balance is " + credit + ". Thank you for shopping with us!", "", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid. You need a total of " + (price - credit) + " to buy this item.", "", JOptionPane.ERROR_MESSAGE);
                }
                } else if (choice == 3) {
                JOptionPane.showMessageDialog(null, "You have a total of " + credit + " credits.", "", JOptionPane.ERROR_MESSAGE);
                } else if (choice == 4) {
                JOptionPane.showMessageDialog(null, "You have a total of " + credit + " change. Thank you for using the Vending Machine! <3", "", JOptionPane.ERROR_MESSAGE);
            }

            } while (true);
        }
    }
