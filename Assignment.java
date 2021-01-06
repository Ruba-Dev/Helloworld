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
    public static int greatest(int nu, int no, int mo) {
        if (nu > no && nu > mo) {
            return nu;
        } else if (no > nu && no > mo) {
            return no;
        } else if (mo > no && mo > nu) {
            return mo;
        }else{
            return nu;
        }

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Input three numbers, please..");
        int RT = reader.nextInt();
        int TR = reader.nextInt();
        int TRT = reader.nextInt();
        int answer =  greatest(RT, TR, TRT);
        System.out.println("Greatest: " + answer);
    }
}

