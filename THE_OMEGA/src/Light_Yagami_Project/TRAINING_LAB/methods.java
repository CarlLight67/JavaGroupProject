package Light_Yagami_Project.TRAINING_LAB;
import java.io.*;

public class methods {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.print("Enter your age: ");
                String rawAge = input.readLine().trim();

                if (rawAge.isEmpty()) {
                    System.out.println("Age cannot be empty!\n");
                    continue;
                }

                int ageNum = Integer.parseInt(rawAge);

                checkAge(ageNum);


            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter numbers only.\n");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + "\n");
            }
        }
    }

    // SPECIALIST METHOD: Takes age and prints the result
    public static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are young.");
        }
    }
}