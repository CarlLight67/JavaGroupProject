package Light_Yagami_Project.TRAINING_LAB;
import java.util.*;
public class doWhilePractice {
    public static void main() {

        Scanner in = new Scanner(System.in);

        int target = 42;
        int get;
        do{
            System.out.print("guess the number: ");
            get = in.nextInt();
            if(get < target){
                System.out.println("Too low! Try a higher number.");
            }
            else if(get > target){
                System.out.println("Too high! Try a lower number.");
            }
            else if(get == target){
                System.out.println("YEY!!! YOU WON!!!");
            }
        }while(get != target);

    }
}
