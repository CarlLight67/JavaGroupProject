package Light_Yagami_Project.TRAINING_LAB;
import java.io.*;
public class method1 {
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter your Hours Worked: ");
        String rawPayWork = in.readLine().trim();
        double HW = Double.parseDouble(rawPayWork);

        System.out.println("enter your hour rate: ");
        String rawHOURwork = in.readLine().trim();
        double HR = Double.parseDouble(rawPayWork);

        System.out.println("this is you pay: " + calculatePay(HW,HR));
    }
    public static double calculatePay(double hoursWorked, double hourlyRate){
        if (hoursWorked > 40) {
            double regularPay = 40 * hourlyRate;
            double overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * (hourlyRate * 1.5);

            return regularPay + overtimePay;
        } else {
            return hoursWorked * hourlyRate; // Standard 40 hours or less
        }
    }
}
