import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class testname {

    public static void main(String[] args) throws IOException {
        BufferedReader names = new BufferedReader(
                new InputStreamReader(System.in));


            System.out.println("Ikaw ba si.. ");
            String name = names.readLine();

            System.out.println("Okay. Ikaw pala si " + name + " :) ");


    }
}
