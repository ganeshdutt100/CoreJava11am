package demo;

import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();

        System.out.println("Rock paper Scissors game : ");
        System.out.println("Enter your choice (rock, paper, or scissors): ");
        String[] options = {"rock", "paper", "scissors"};

        while (true) {
            System.out.println("Your choice : ");
            String userChoice = sc.nextLine().toLowerCase();
            String computerChoice = options[rm.nextInt(3)];

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");

            }
           else if (userChoice.equals("rock") && computerChoice.equals("scissors") ||
                    userChoice.equals("scissors") && computerChoice.equals("paper") ||
                    userChoice.equals("paper") && computerChoice.equals("rock")
            ) {
                System.out.println("You win!" + userChoice);
            } else {
                System.out.println("Computer wins!" + computerChoice);
            }
            System.out.println("Do you want to play again? (yes/no): ");
            String playAgain = sc.nextLine().toLowerCase();
            if(!playAgain.equals("yes")){
                System.out.println("thanks for playing! Goodbye! ");
                break;
            }
        }
    }
}