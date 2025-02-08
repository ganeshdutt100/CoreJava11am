package games;

import java.util.Random;
import java.util.Scanner;

public class GuessTheVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        Random random = new Random();
        char vowelToGuess = vowels[random.nextInt(vowels.length)]; // Random vowel
        int attempts = 0;
        int maxAttempts = 3;
        char guess;

        System.out.println("Welcome to Guess the Vowel!");
        System.out.println("I have selected a vowel (A, E, I, O, U). You have 3 chances to guess it!");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess (A, E, I, O, U): ");
            guess = Character.toUpperCase(scanner.next().charAt(0));
            attempts++;

            if (guess == vowelToGuess) {
                System.out.println("Congratulations! You guessed the vowel in " + attempts + " attempts.");
                break;
            } else {
                System.out.println("Wrong guess! Try again.");
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've used all your chances! The correct vowel was: " + vowelToGuess);
            }
        }

        scanner.close();
    }
}

