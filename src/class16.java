import java.util.Scanner;

public class class16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your table number :  ");
        int tableNumber  = scanner.nextInt();
        Table(tableNumber);
    }
    public static void Table(int tableName){

        for(int i=1; i<=10; i++){

            System.out.println( tableName +  " *  " + i + " = "+  (tableName * i));

        }
    }
}
