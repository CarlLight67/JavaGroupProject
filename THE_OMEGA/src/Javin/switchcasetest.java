import java.util.*;

public class switchcasetest {
    public static void main(String[] args) {
        Scanner mgaaso = new Scanner(System.in);
        System.out.println("pards anong klaseng tunog ginagawa ng aso");
        String aso = mgaaso.nextLine();

        switch (aso) {
            case "arf" -> System.out.println("oo par tumatahol sila");
            case "woof" -> System.out.println("oo par talagang tumatahol sila");
            case "meow" -> {
                System.out.println("tanga kaba");
                String answer = mgaaso.nextLine();
                if (answer.equals("tangina mo")) {
                    System.out.println("kingina mo ka tanga");
                } else if (answer.equals("sensya")) {
                    System.out.println("ok sige pag bibigyan.");
                } else if (answer.equals("hindi")) {
                    System.out.println("sa susunod ah...");
                } else {
                    System.out.println("bahala ka na dian par");
                }
            }
            default -> System.out.println("ano yan tanga kaba");

        }
    }
}