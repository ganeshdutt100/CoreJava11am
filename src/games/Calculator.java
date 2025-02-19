package games;

import java.util.Scanner;

public class Calculator {

    // Method to perform calculation
    public static double calculate(String expression) {
        // Split expression into tokens (numbers & operators)
        String[] tokens = expression.split(" ");
        double result = Double.parseDouble(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            char operator = tokens[i].charAt(0);
            double num = Double.parseDouble(tokens[i + 1]);

            result = performOperation(result, operator, num);
        }
        return result;
    }

    // Method to perform individual operations
    public static double performOperation(double a, char operator, double b) {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) {
                    System.out.println("Error! Division by zero.");
                    return Double.NaN;
                }
                return a / b;
            default:
                System.out.println("Invalid operator: " + operator);
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter your expression (e.g., 1 + 5 + 4 + 3 + 7 - 5): ");
        String expression = scanner.nextLine();

        // Calling calculate method
        double result = calculate(expression);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
