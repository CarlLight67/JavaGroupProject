package Light_Yagami_Project.BufferedReader_Guide;
import java.io.*;

public class MARKET {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                double bread = 80.00;
                double coffee = 50.00;
                double service = 0.05;

                System.out.print("HOW MANY BREAD?: ");
                String breadOrder = in.readLine();
                System.out.print("HOW MANY COFFEE?: ");
                String coffeeOrder = in.readLine();

                // Check for empty BEFORE parsing
                if (breadOrder.isEmpty() || coffeeOrder.isEmpty()) {
                    System.out.println("You must enter a number.");
                    continue;
                }

                double breadOrderF = Double.parseDouble(breadOrder);
                double coffeeOrderF = Double.parseDouble(coffeeOrder);

                // Calculations
                double totalBread = breadOrderF * bread;
                double totalCoffee = coffeeOrderF * coffee;
                double sumOrder = totalBread + totalCoffee;
                double additional = sumOrder * service;
                double paymentWService = sumOrder + additional;

                System.out.println("THIS IS THE TOTAL: " + sumOrder);
                System.out.println("WITH SERVICE: " + paymentWService);

                System.out.print("GIVE ME YOUR PAYMENT: ");
                String pay = in.readLine();
                double payment = Double.parseDouble(pay);

                if (payment <= 0) {
                    System.out.println("you must pay me");
                    continue;
                } else if (payment >= paymentWService) {
                    double sukli = payment - paymentWService;
                    System.out.println("-----------ORDER---------");
                    System.out.println("Order in bread: " + breadOrder);
                    System.out.println("Order in coffee: " + coffeeOrder);
                    System.out.println("-----------TOTAL---------");
                    System.out.println("service fee (5%): " + additional);
                    System.out.println("TOTAL AMOUNT: " + sumOrder);
                    System.out.println("TOTAL WITH SERVICE: " + paymentWService);
                    System.out.println("change: " + sukli);
                    break;
                } else {

                    System.out.println("Not enough payment. Need: " + paymentWService);
                }

            } catch (Exception e) {
                System.out.println("ERROR: invalid input, try again.");
            }
        }
    }
}