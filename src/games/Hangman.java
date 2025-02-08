package games;

import java.util.Scanner;

public class Hangman {
    private static final String WORD = "JAVA";
    private static char[] guessedWord = {'_', '_', '_', '_'};
    private static int attempts = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Hangman!");

        while (attempts > 0 && !isWordGuessed()) {
            System.out.println("Attempts left: " + attempts);
            printGuessedWord();
            System.out.print("Guess a letter: ");
            char guess = Character.toUpperCase(scanner.next().charAt(0));

            if (!processGuess(guess)) {
                attempts--;
            }
        }

        if (isWordGuessed()) {
            System.out.println("Congratulations! You guessed the word: " + WORD);
        } else {
            System.out.println("Game Over! The word was: " + WORD);
        }
        scanner.close();
    }

    private static void printGuessedWord() {
        for (char c : guessedWord) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    private static boolean processGuess(char guess) {
        boolean correct = false;
        for (int i = 0; i < WORD.length(); i++) {
            if (WORD.charAt(i) == guess) {
                guessedWord[i] = guess;
                correct = true;
            }
        }
        return correct;
    }

    private static boolean isWordGuessed() {
        return new String(guessedWord).equals(WORD);
    }
}
