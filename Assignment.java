import java.util.Scanner;
public class Assignment {
    public static int sum(int number1, int number2, int number3, int number4) {
        int sum = number1 + number2 + number3 + number4;
        return sum;
    }

    public static int sm(int number1, int number2, int number3, int number4) {
        int sum = number1 * number2 * number3 * number4;
        return sum;
    }

    public static int least(int num, int no) {
        if (num < no) {
            return num;
        }else{
            return no;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Input two numbers, please..");
        int RT = reader.nextInt();
        int TR = reader.nextInt();
        int answer = least(RT,TR);
        System.out.println("Least: " + answer);
    }
}