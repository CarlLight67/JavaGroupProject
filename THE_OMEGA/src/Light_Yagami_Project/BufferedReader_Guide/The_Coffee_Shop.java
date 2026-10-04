package Light_Yagami_Project.BufferedReader_Guide;

import java.io.*;

public class The_Coffee_Shop {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                double Espresso = 3.50;
                double Latte = 4.50;
                double Addons = 2.50;
                double senior = 0.15;

                System.out.println("""
                    =====================MENU=======================
                    Espresso = 3.50; Latte = 4.50; Addons = 2.50;
                    ===============================================
                    """);

                System.out.print("Quantity of Espresso: ");
                String getOrderE = input.readLine().trim();
                System.out.print("Quantity of Latte: ");
                String getOrderL = input.readLine().trim();
                System.out.print("Quantity of Pastry: ");
                String getOrderP = input.readLine().trim();
                System.out.print("Senior Citizen status (yes or no): ");
                String getValid = input.readLine().trim();

                // Validate empty inputs BEFORE parsing
                if (getOrderE.isEmpty() && getOrderL.isEmpty() && getOrderP.isEmpty()) {
                    System.out.println("Quantities cannot all be empty!");
                    continue;
                }

                double EspressoG = Double.parseDouble(getOrderE);
                double LatteG = Double.parseDouble(getOrderL);
                double PastryG = Double.parseDouble(getOrderP);

                if (EspressoG < 0 || LatteG < 0 || PastryG < 0) {
                    System.out.println("Quantities cannot be negative!\n");
                    continue;
                }

                if (getValid.equalsIgnoreCase("yes")) {
                    System.out.println("\nYou Get Senior Discount: 15% off");
                } else if (getValid.equalsIgnoreCase("no") || getValid.isEmpty()) {
                    System.out.println("\nYou don't get discount");
                } else {
                    System.out.println("SORRY WHAT?! TRY AGAIN!");
                    continue;
                }

                double all = (Espresso * EspressoG) + (LatteG * Latte) + (PastryG * Addons);
                System.out.println("");
                System.out.println("BILL: " + all);
                double tax = all * 0.07;
                System.out.println("VAT: " + tax);

                double total;
                if (getValid.equalsIgnoreCase("yes")) {
                    double discountedBill = all * (1 - senior); // 15% off
                    total = discountedBill + tax;
                    System.out.println("TOTAL WITH DISCOUNT: " + total);
                } else {
                    total = all + tax;
                    System.out.println("TOTAL WITH VAT: " + total);
                }


                System.out.print("Payment: ");
                String Rpayment = input.readLine().trim();
                double payment = Double.parseDouble(Rpayment);

                if (payment < total) {
                    System.out.println("INSUFFICIENT! You need to pay: " + total);
                } else {
                    System.out.println("CHANGE: " + (payment - total));
                }

                System.out.println("==========================================");

            } catch (NumberFormatException e) {
                System.out.println("THIS MUST BE NUMBERS ONLY: " + e);
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }
}