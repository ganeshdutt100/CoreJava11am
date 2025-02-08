package games;

import java.util.Random;
import java.util.Scanner;



public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(5) + 1; // Random number between 1 and 5
        int attempts = 0;
        int maxAttempts = 3;
        int guess = 0;

        System.out.println("Welcome to Guess the Number!");
        System.out.println("I have selected a number between 1 and 5. You have 3 chances to guess it!");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've used all your chances! The correct number was: " + numberToGuess);
            }
        }

        scanner.close();
    }
}