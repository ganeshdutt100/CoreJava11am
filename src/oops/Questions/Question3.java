package oops.Questions;

//5. 2D Array and Diagonal Sum
//Create a 2D array of integers (square matrix).
//
//Write a program to calculate the sum of both diagonals using nested loops.
//Display the sums.
public class Question3 {
    public static void main(String[] args) {
        int [][]Matrix= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for(int i=0; i<Matrix.length; i++){
            System.out.print("Diagonal " + (i+1) +" : ");
            int sum=0;
            for(int j=0; j<Matrix.length; j++){
                if(i==j){
                    sum+=Matrix[i][j];
//                    sum =  sum + Matrix[i][j]
                }
            }
            System.out.println(sum);
        }

    }
}
