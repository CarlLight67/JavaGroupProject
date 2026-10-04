import java.util.Scanner;



public class OCENAR_Act3 {
    public static void main(String[] args) {

        float num1 = 0;
        float num2 = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number.");
        num1 = input.nextFloat();

        System.out.println("Please enter the second number.");
        num2 = input.nextFloat();

        float sum = num1 + num2;
        float diff = num1 - num2;
        float prod = num1 * num2;
        float rem = num1 % num2;

        System.out.println("The sum is.. " + sum);

        System.out.println("The difference is.. " + diff);

        System.out.println("The product is.. " + prod);

        System.out.println("The remainder is.. " + rem);

        input.close();
    }
}