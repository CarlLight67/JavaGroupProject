package Light_Yagami_Project.TRAINING_LAB;
import java.util.*;
public class String_ATM {

   public static void main(String[] args) {

       Scanner in = new Scanner(System.in);

       System.out.println("""
               ==ATM===
               1.) BALANCE
               2.) DEPOSIT
               3.) WITHDRAW
               99.) EXIT
               """);

       double balance = 1000;
       String show =  "THIS IS YOUR CURRENT BALANCE : $";
       String ask =  "ENTER THE AMOUNT: $";

       while(true){
       System.out.print("Choose option: ");
       String getInput = in.nextLine().strip();

       if(getInput.isEmpty()) {
           System.out.println("YOU DIDN'T ENTER ANYTHING ");
           continue;
       }
       else if (getInput.equalsIgnoreCase("1")) { //show balance
           System.out.println(show + balance);
       }
       else if (getInput.equalsIgnoreCase("2")) { // user deposit

           while(true){
           System.out.print(ask);
           double add = in.nextDouble();

           if(add <= 0){
               System.out.println("THIS NOT BE 0 OR NEGATIVE NUMBER");
           } else{
               balance += add;
               System.out.println(show + add);
               break;
           }

           }
       }
       else if (getInput.equalsIgnoreCase("3")) { // user withdraw

           while(true){

           System.out.print(ask);
           double withdraw  = in.nextDouble();

           if(withdraw > balance){
               System.out.println("you cannot withdraw this amount");
               System.out.println(show + balance);

           } else {
               balance -= withdraw;
               System.out.println(show + balance);
           }

           }

       }
       else if (getInput.equalsIgnoreCase("99")) { // user exit
           System.out.println("Thank you!! BYE :)");
           break;
       }
       else{
           System.out.println("INVALID INPUT!TRY AGAIN ");
       }

       }// end of the loop
    }
}
