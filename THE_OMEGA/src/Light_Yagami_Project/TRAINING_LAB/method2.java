package Light_Yagami_Project.TRAINING_LAB;

import java.io.*;

public class method2 {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            int subject = 5;
            double total = 0;
            System.out.print("ENTER YOUR NAME: ");
            String name = input.readLine().trim();
            System.out.print("ENTER YOUR SECTION : ");
            String section = input.readLine().trim();
            System.out.println("=====================================");
            System.out.println("THIS IS 5 SUBJECTS. KINDLY FILL IT UP");
            System.out.println("=====================================");
            for (int i = 1; i <= subject; i++) {
                System.out.print("SUBJECT " + i + ": ");
                double get = Double.parseDouble(input.readLine().trim());
                total += get;
            }
            data(name, section, total);
        } catch (Exception e) {
            System.out.println("error " + e);
        }
    }

    static double data(String name, String section, double grade) {
        int subject = 5;
        System.out.println("STUDENT NAME : " + name.toUpperCase().substring(0, 1) + name.substring(1));
        System.out.println("STUDENT SECTION : " + section.toUpperCase());
        double sum = grade / subject;
        System.out.println(sum);
        return sum;
    }
}