import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        String name = "Amad";
        System.out.println(name);
        second.printer(name);
    }

    public static void printer(String x) {
        System.out.println(second.inputTaker());
    }

    public static String inputTaker() {
        Scanner scn = new Scanner(System.in);
        String name = scn.next();
        scn.close(); 
        return name;
    }
}
