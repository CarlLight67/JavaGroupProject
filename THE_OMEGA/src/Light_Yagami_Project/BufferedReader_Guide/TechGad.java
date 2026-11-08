package Light_Yagami_Project.BufferedReader_Guide;

import java.util.*;
public class TechGad {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("""

                       ==================== Light Tech Shop ====================
                       """);
    System.out.print("what is the total gadget purchase amount: ");
    double totalGadget = input.nextDouble();

    System.out.printf("""

                       YOUR TOTAL AMOUNT IS: ₱ %.2f
                       """,totalGadget);

    System.out.print("DO YOU HAVE AN VIP MEMBERSHIP ?(YES/NO): ");
    String vipMemberShip = input.next().strip();
    System.out.println("");
    System.out.print("ENTER YOUR PAYMENT: ");
    double payment = input.nextDouble();


    //====================================

    //====================================

    if("yes".equalsIgnoreCase(vipMemberShip)){
        System.out.print("==================== EXTRA VIP DISCOUNT ADDED ====================");

    }
    if("no".equalsIgnoreCase(vipMemberShip)){
        System.out.println("==================== NO EXTRA VIP DISCOUNT ADDED ====================");
        if(totalGadget < 2000){
            System.out.print("THANK YOU THIS IS YOUR CHANGE: " + (payment - totalGadget));
        }
        else if(totalGadget >= 10000){
            System.out.print("YOU HAVE 15% DISCOUNT.\n THANK YOU THIS IS YOUR CHANGE:$ " + ((totalGadget * 0.15 + totalGadget)- payment));
        }
        else if(totalGadget < 10000){
            System.out.print("YOU HAVE 10% DISCOUNT.\n THANK YOU THIS IS YOUR CHANGE:$ " + ((totalGadget * 0.10 + totalGadget)- payment));
        }
    }
    input.close();
}
}
