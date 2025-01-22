
//2. Array and Sorting
//Write a program to create an array of integers.
//
//Use a loop to sort the array in ascending order (implement the sorting logic manually).
//Display the sorted array.
package oops.Questions;

import java.util.Arrays;

public class SecondQuestion {
    public static void main(String[] args) {
        int [] numbers = {5,4,9,2,8};
        System.out.println("Original Array: " + Arrays.toString(numbers));

        for(int i = 0; i < numbers.length-1; i++) {
            for(int j = 0; j < numbers.length-1-i; j++) {
                if(numbers[j] > numbers[j+1]) {

                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
