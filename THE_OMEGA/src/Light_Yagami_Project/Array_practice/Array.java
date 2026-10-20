package Light_Yagami_Project.Array_practice;
import java.util.*;

public class Array {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] people = {
                "Yana my BABY",
                "Carl Pogi",
                "Vincent Me",
                "Hamood"
        }; // this is the starting point of array must put [] and the {} must have ;


        System.out.println("THIS IS THE PEOPLE: \n");
            for(int num = 0; num < people.length; num++){
                System.out.println((num + 1) + ".)" +people[num]);
            } // THIS IS JUST LISTING ALL THE PEOPLE ON THE ARRAY
        System.out.println("\n");

// calling all the names of people MANUALLY
        System.out.println("1.) " +people[0]);
        System.out.println("2.) " +people[1]);
        System.out.println("3.) " +people[2]);
        System.out.println("4.) " +people[3]);

        int [] grade = new int[5];

        grade[0] = 90;
        grade[1] = 100;
        grade[2] = 43;
        grade[3] = 534;
        grade[4] = 233;
        System.out.println("");
        for(int l = 0;l < grade.length; l++){
            System.out.println((l+1)+" .) "   + grade[l]);
        }

        System.out.print("ENTER HOW MANY STUDENT CAN ENTER: ");

        int numStudent = in.nextInt();
        int[] Students = new int[numStudent];
            String[] nameStudents = new String[numStudent];

        for (int f = 0; f < Students.length;f++){

            nameStudents[f] = in.nextLine().strip();
            System.out.print(Students[f]+ (f+1) +  ".) ");

        }

        for (String name : nameStudents) {
            System.out.println(name);
        }



    }

}
