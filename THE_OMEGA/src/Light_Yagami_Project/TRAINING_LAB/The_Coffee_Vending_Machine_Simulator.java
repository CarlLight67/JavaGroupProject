package Light_Yagami_Project.TRAINING_LAB;
import java.util.*;
public class The_Coffee_Vending_Machine_Simulator {
     public static void main(String[] args) {

         int getInput;
         double money = 0;

         double Espresso = 50;
         double Latte = 75;
         double Cappuccino = 90;
         double order;
         int  getCappuccino = 0 ;
         int getLatte = 0;
         int getEres = 0;
         Scanner in = new Scanner(System.in);
      do {


          System.out.println("""
                  ========== Machine Specs & Prices ==========
                  
                  1. Espresso: ₱50
                  
                  2. Latte: ₱75
                  
                  3. Cappuccino: ₱90
                  
                  5. Exit System
                  
                  """);
          System.out.print("Select an option: ");
          getInput = in.nextInt();

          if(getInput == 1){
              System.out.print("how many : ");
              getEres = in.nextInt();
          }
          else if(getInput == 2){
              System.out.print("how many? : ");
              getLatte = in.nextInt();
          }
          else if(getInput == 3){
              System.out.print("how many? : ");
              getCappuccino = in.nextInt();
          }


              else if (getInput == 4) {
              order = (getCappuccino * Cappuccino) + (getEres * Espresso) +(getLatte * Latte);
              System.out.printf("this is the sum : %.2f", order);
              }
          } while(getInput != 99);
         System.out.print("GOOD BYE!");
    }
}
