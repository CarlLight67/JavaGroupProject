package Light_Yagami_Project.TRAINING_LAB;
import java.util.*;
import java.io.*;
public class String_methods {

    public static void clean(){
        try {
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
            } else {
                new ProcessBuilder("clear").inheritIO().start();
            }
        } catch (Exception e) {
            // ignore
        }
    }



    public static void main(String[] args) {


        //THIS IS JUST SIMPLE  ATTENDANCE

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        clean();

        try {
            int numberOfStaffs = 0;
            while(true){

                System.out.println("this is not must be greater or equal that 50");
                System.out.print("ENTER THE VALUE THAT CAN ENTER IN THE ROOM: ");

                String rawStuff = input.readLine().trim();

                if(rawStuff.isEmpty()){
                    System.out.println("this not be empty");
                    rawStuff = input.readLine();
                    continue;
                }

                int getStaffNumber = Integer.parseInt(rawStuff);

                if(getStaffNumber <= 0){
                    System.out.println("THIS MUST NOT BE NEGATIVE OR 0");
                }
                else if(getStaffNumber >  50){
                    continue;
                }

                else {
                    String[] student = new String[getStaffNumber];
                    System.out.print("This is the total number availability of staff that can enter: " + student.length);
                    break;
                }

            }

        }catch(Exception e){
            System.out.println("this is error " + e.getMessage());
        }


    }
}