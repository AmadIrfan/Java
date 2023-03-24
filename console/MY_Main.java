import java.util.*;

class MY_Main {
    public static void main(String[] args) {
        // List<InputData> inList = new ArrayList<InputData>();
        InputData[] arr = {};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your father name: ");
        String f_name = input.nextLine();
        System.out.println("Enter your id: ");
        int id = input.nextInt();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        InputData inp = new InputData(name, f_name, id, age);
        input.close();
        arr[0] = inp;
        InputData.printList(arr);
    }

}

class InputData {
    String name;
    String f_name;
    int id;
    int age;

    InputData(String name, String f_name, int id, int age) {
        this.name = name;
        this.f_name = f_name;
        this.id = id;
        this.age = age;
    }

    public static void printList(InputData[] arr) {
        for (InputData inpD : arr) {
            System.out.println(inpD);
        }
    }
}
