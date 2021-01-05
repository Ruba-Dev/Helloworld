import java.util.Scanner;
public class ArrayForGit {
    public static void main (String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Let's play a Game! \t You chose Even or Odd ..");
        String in = reader.nextLine();
        System.out.println("You give me a number and the computer gives a number. \tif you choose even and the sum of numbers is even you win!");
        String[] num = {"Even", "Odd"};
        System.out.println("Enter a number, please.");
        int userInput = reader.nextInt();
        int random = (int)(Math.random()*101);
        System.out.println(random);
        int sum = userInput + random;
        System.out.println("The sum is" + sum);
        int bo = sum % 2;
        if( bo=0 ){
        System.out.println("You win");
        }else{

        }




    }
}
