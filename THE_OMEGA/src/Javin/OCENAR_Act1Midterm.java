import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class OCENAR_Act1Midterm  {


    public static void main(String[] args) throws IOException {
        BufferedReader numbers = new BufferedReader(
                new InputStreamReader( System.in ) );
        try {
            System.out.println("Please enter the first number. ");
            int num1 = Integer.parseInt(numbers.readLine());

            System.out.println("Please enter the second number. ");
            int num2 = Integer.parseInt(numbers.readLine());

            int sum = num1 + num2;
            int diff = num1 - num2;
            int prod = num1 * num2;
            int rem = num1 % num2;

            System.out.println("The sum is.. " + sum);

            System.out.println("The difference is.. " + diff);

            System.out.println("The product is.. " + prod);

            System.out.println("The remainder is.. " + rem);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers only");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide or find remainders by zero");
        }
    }
}