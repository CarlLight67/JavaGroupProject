package Light_Yagami_Project.BufferedReader_Guide;
import java.util.*;

public class MiniMarket {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER YOUR AGE: ");
        int age = input.nextInt();


        if (age < 18) {
            System.out.println("""

                               ========== THE MOVIE IS RESTRICTED FOR ADULTS ONLY ==========
                               ============ BYE ============
                               """);
            input.close();
            return;
        }

        System.out.println("""

                           =========== GOOD TO GO ============
                           """);

        System.out.print("ARE YOU A STUDENT (YES OR NO)?: ");
        String askStudent = input.next();
 
        System.out.print("HOW MANY TICKETS DO YOU WANT TO BUY?: ");
        int tickets = input.nextInt();


        int pricePerTicket = 350;
        boolean hasDiscount = "yes".equalsIgnoreCase(askStudent) || age >= 60;

        if (hasDiscount) {
            pricePerTicket -= 50;
            System.out.println("=========== YOU HAVE A DISCOUNT OF ₱50 FOR EACH TICKET ===========");
        }

        double total = pricePerTicket * tickets;


        if (tickets >= 3) {
            total *= 0.9;
            System.out.println("=========== YOU HAVE AN EXTRA 10% OFF FOR BUYING 3+ TICKETS ===========");
        }

        System.out.println("THIS IS THE TOTAL AMOUNT: ₱" + total);

        // Payment
        System.out.print("Enter the payment: ");
        double payment = input.nextDouble();

        if (payment < total) {
            System.out.println("INSUFFICIENT AMOUNT OF PAYMENT: ₱" + payment);
        } else {
            System.out.println("THANK YOU FOR PAYMENT");
            System.out.println("THIS IS YOUR CHANGE: ₱" + (payment - total));
        }

        input.close();
    }
}   
