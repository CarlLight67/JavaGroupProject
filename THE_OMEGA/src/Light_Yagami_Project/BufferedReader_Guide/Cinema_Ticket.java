package Light_Yagami_Project.BufferedReader_Guide;

import java.io.*;

public class Cinema_Ticket {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in)
        );

        double rTicketPrice = 12.00;
        double vTicketPrice = 20.00;
        double popcornPrice = 5.00;

        while (true) {
            try {
                System.out.print("How many Regular tickets?: ");
                String rawTicket = input.readLine();

                System.out.print("How many VIP tickets?: ");
                String rawVipTicket = input.readLine();

                System.out.print("How many Popcorn orders?: ");
                String rawCorn = input.readLine();

                System.out.print("Are you a Student? (yes/no): ");
                String studentAsk = input.readLine();

                System.out.print("Payment: ");
                String rpayment = input.readLine();

                if (
                        rawTicket.trim().isEmpty() ||
                                rawVipTicket.trim().isEmpty() ||
                                rawCorn.trim().isEmpty() ||
                                rpayment.trim().isEmpty()
                ) {
                    System.out.println("Inputs cannot be empty! Please try again.\n");
                    continue;
                }

                double regularQty = Double.parseDouble(rawTicket.trim());
                double vipQty = Double.parseDouble(rawVipTicket.trim());
                double popcornQty = Double.parseDouble(rawCorn.trim());
                double payment = Double.parseDouble(rpayment.trim());

                if (regularQty < 0 || vipQty < 0 || popcornQty < 0) {
                    System.out.println("Quantities cannot be negative!\n");
                    continue;
                }

                double totalRticket = regularQty * rTicketPrice;
                double totalVticket = vipQty * vTicketPrice;
                double totalPopCorn = popcornQty * popcornPrice;

                double subtotal = totalRticket + totalVticket + totalPopCorn;

                boolean isStudent = studentAsk.trim().equalsIgnoreCase("yes");
                double discountAmount = isStudent ? (subtotal * 0.10) : 0.0;
                double discountedSubtotal = subtotal - discountAmount;

                double taxAmount = discountedSubtotal * 0.08;
                double finalTotal = discountedSubtotal + taxAmount;

                if (payment < finalTotal) {
                    System.out.println(
                            "Insufficient payment! You need at least $" + finalTotal + "\n"
                    );
                    continue;
                }

                double change = payment - finalTotal;

                System.out.println("\n================ RECEIPT ================");
                System.out.println("Subtotal: $" + subtotal);
                if (isStudent) {
                    System.out.println("Student Discount (10%): -$" + discountAmount);
                }
                System.out.println("Tax Amount (8%): $" + taxAmount);
                System.out.println("Final Total Due: $" + finalTotal);
                System.out.println("Payment Given: $" + payment);
                System.out.println("Change: $" + change);
                System.out.println("=========================================");

                break;
            } catch (NumberFormatException e) {
                System.out.println(
                        "Invalid input! Please enter numbers for quantities and payment.\n"
                );
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }
}