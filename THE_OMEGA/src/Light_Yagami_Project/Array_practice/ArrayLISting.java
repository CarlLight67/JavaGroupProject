package Light_Yagami_Project.Array_practice;
import java.util.*;
import javax.swing.*;

    
public class ArrayListing {
    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Input how many people you want to put: "));
        ArrayList<String> names = new ArrayList<>(a);
            
        
        for(int i = 0;i < a ;i++){
            String get = JOptionPane.showInputDialog((i+1) + ".) " +"NAME");
            names.add(get);
        JOptionPane.showConfirmDialog(null,"This is the List of peoples: "+ names);

        String remove = JOptionPane.showInputDialog("Input how many people you want to put: ");
        if (names.remove(remove)) {
            JOptionPane.showConfirmDialog(null,"UPDATED "+ names);
        } else {
            JOptionPane.showConfirmDialog(null,remove + " was not in the list.");
        }
    }

    }
}

