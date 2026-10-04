package Light_Yagami_Project.TRAINING_LAB;
import java.io.*;
public class Calculate_Area_method3 {
   public static void main(String[] args) {

       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
while(true){

       try{

           System.out.print("enter the value of width: ");
           double width = Double.parseDouble(input.readLine().trim());

           System.out.print("enter the value of height: ");
           double height = Double.parseDouble(input.readLine().trim());

           System.out.print("THIS IS TOTAL AREA: "+ calcualte(width,height));
           break;

       }catch(NumberFormatException e){
           System.out.println("ERROR " + e.getMessage());

       }
       catch(Exception i){
           System.out.println("ERROR " + i.getMessage());

       }
}


    }
    public static double calcualte(double width,double height){
       double compute = width * height;
       return compute;
    }
}
