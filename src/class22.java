import java.util.Random;
import java.util.Scanner;

public class class22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the rock , paper , scissors Game :   ");
        while (true) {
            String[] str = {"rock", "paper", "scissors"};

            String randomNumber = str[random.nextInt(3)];
//        System.out.println(randomNumber);

            String userNumber = scanner.nextLine().toLowerCase();
//        System.out.println(userNumber);
      if(!userNumber.equals("rock") && !userNumber.equals("paper") && !userNumber.equals("scissors") ){
          System.out.println("Invalid input! Please enter rock, paper or scissors.");
          continue;  // continue to next iteration if invalid input

      }
            if (userNumber.equals(randomNumber)) {
                System.out.println("tie this game ");
            } else if (
                    (userNumber.equals("rock") && randomNumber.equals("scissors")) ||
                            (userNumber.equals("scissors") && randomNumber.equals("paper")) ||
                            (userNumber.equals("paper") && randomNumber.equals("rock"))
            ) {
                System.out.println("user win :  " + "User choice : " + userNumber + " and computer choice : " + randomNumber);
            } else {
                System.out.println("computer win : " + "User choice : " + userNumber + " and computer choice : " + randomNumber);
            }

            System.out.println("Do you want to play again? (yes/no): ");
            String userChoice = scanner.nextLine();
            if (!userChoice.equals("yes")) {
                System.out.println("goodBye!");
                break;

            }
        }
    }
}
