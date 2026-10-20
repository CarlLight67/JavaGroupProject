import java.util.Scanner;
import java.text.DecimalFormat;
public class vendingmachine {
    public static void main(String[] args) {
        Scanner vending = new Scanner(System.in);
        DecimalFormat money = new DecimalFormat("0.00");
        double credit;
        credit = 0.00;
        int thechoice;
        do {
            System.out.println("1 - Insert Money");
            System.out.println("2 - Buy Item");
            System.out.println("3 - Check Credit");
            System.out.println("4 - Exit");
            System.out.print("Choose an option: ");

            thechoice = vending.nextInt();

            if (thechoice == 1) {
                System.out.println("Enter the amount of money you want to insert.");
                double insertedmoney = vending.nextDouble();
                if (insertedmoney <= 0) {
                    System.out.println("You have entered an invalid amount.");
                } else {
                    credit += insertedmoney;
                    System.out.println("Your new balance is " + money.format(credit) + ".");
                }

            } else if (thechoice == 2) {
                System.out.println("Soda (1.50)");
                System.out.println("Chips (2.00)");
                System.out.println("Candy (1.25)");
                System.out.println("Please choose to which one you would like to buy.");
                String item = vending.next();
                double price = 0.00;

                if (item.equalsIgnoreCase("Soda")) {
                    price = 1.50;
                } else if (item.equalsIgnoreCase("Chips")) {
                    price = 2.00;
                } else if (item.equalsIgnoreCase("Candy")) {
                    price = 1.25;
                }
                if (price == 0) {
                    System.out.println("Invalid item!");
                } else if (credit >= price) {
                    credit -= price;
                    System.out.println("Your new balance is " + credit + ". Thank you for shopping with us!");
                } else {
                    System.out.println("Insufficient credits. You need a total of " + money.format(price - credit) + " to buy this item.");
                }

                } else if (thechoice == 3) {
                System.out.println("Your total credits amount to " + money.format(credit) + ".");
                } else if (thechoice == 4) {
                 System.out.println("Your leftover credits/change amount to " + money.format(credit) + ".");


            }

        } while (thechoice != 4);
    }
}