import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ifelsebufferedreader {

    public static void main(String[] args) throws IOException {
        BufferedReader numbers = new BufferedReader(new InputStreamReader(System.in));
        String maybe = "";

        try {
            System.out.println("Please enter the first number. ");
            maybe = numbers.readLine();
            int num1 = Integer.parseInt(maybe);

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
            if (maybe.equals("javin ocenar")) {
                System.out.println("hoy yan yung may ari neto");
            } else if (maybe.equals("francheska erpelo")) {
                System.out.println("this is my girlfriend and i love her very much");
            } else {
                System.out.println("Error: Please enter valid integers only");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide or find remainders by zero");
        }
    }
}