package Light_Yagami_Project.BufferedReader_Guide;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Practice_br {

    public static void main(String[] args) {



        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){ ///this is must better instead of using throw IO blah blah blah



        }catch (Exception e){
            System.out.println("THE VALUE THAT YOU PUT IS ERROR " + e);
        }
        
        
    }
}
