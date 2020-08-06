import java.util.Scanner;

public class tryAndCatch {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Try to type a number..");
        String words = reader.nextLine();
        while (!words.equals("exit")) {
            try {
                System.out.println(words.matches("[0-9]+"));
            } catch (Exception e) {
                System.out.println("The input is alphanumeric number!");
            }
            System.out.println("The input is numeric number!");

            System.out.println("Try to type a number..");
            words = reader.nextLine();
        }
        System.out.println("OK.. The program has just stopped!");

    }
}

