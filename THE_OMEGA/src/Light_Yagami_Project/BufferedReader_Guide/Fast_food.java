package Light_Yagami_Project.BufferedReader_Guide;

import java.io.*;

public class Fast_food {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                double priceBurger = 8.00;
                double priceFries = 3.00;
                double priceDrink = 2.00;

                System.out.println("""
                    =================MENU==================
                                Burger = $8.00
                                Fries  = $3.00
                                Drink  = $2.00
                    =======================================
                    """);

                System.out.print("HOW MANY BURGERS: ");
                String rawBurger = input.readLine();

                System.out.print("HOW MANY FRIES: ");
                String rawFries = input.readLine();

                System.out.print("HOW MANY DRINKS: ");
                String rawDrink = input.readLine();

                if (rawBurger == null || rawBurger.trim().isEmpty() ||
                        rawFries == null || rawFries.trim().isEmpty() ||
                        rawDrink == null || rawDrink.trim().isEmpty()) {
                    System.out.println("INPUT CANNOT BE EMPTY!\n");
                    continue;
                }

                double burger = Double.parseDouble(rawBurger.trim());
                double fries = Double.parseDouble(rawFries.trim());
                double drink = Double.parseDouble(rawDrink.trim());

                if (burger < 0 || fries < 0 || drink < 0) {
                    System.out.println("QUANTITIES CANNOT BE NEGATIVE!\n");
                    continue;
                }

                double totalBurger = burger * priceBurger;
                double totalFries = fries * priceFries;
                double totalDrinks = drink * priceDrink;

                double subtotal = totalBurger + totalFries + totalDrinks;

                double discount = 0.0;
                if (burger >= 2) {
                    discount = 2.00;
                    System.out.println("\nDISCOUNT APPLIED: $2.00 OFF");
                } else {
                    System.out.println("\nNO DISCOUNT APPLIED");
                }

                double discountedSubtotal = subtotal - discount;
                double tax = discountedSubtotal * 0.10;
                double finalTotal = discountedSubtotal + tax;

                System.out.println("SUBTOTAL: $" + subtotal);
                System.out.println("TAX (10%): $" + tax);
                System.out.println("TOTAL BILL: $" + finalTotal);

                System.out.print("\nPAYMENT: ");
                String rawPayment = input.readLine();

                if (rawPayment == null || rawPayment.trim().isEmpty()) {
                    System.out.println("PAYMENT CANNOT BE EMPTY!\n");
                    continue;
                }

                double payment = Double.parseDouble(rawPayment.trim());

                if (payment < finalTotal) {
                    System.out.println("INSUFFICIENT PAYMENT! YOU NEED AT LEAST $" + finalTotal + "\n");
                    continue;
                }

                double change = payment - finalTotal;
                System.out.println("CHANGE: $" + change);
                break;

            } catch (NumberFormatException e) {
                System.out.println("ERROR: NUMBERS ONLY!\n");
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage() + "\n");
            }
        }
    }
}