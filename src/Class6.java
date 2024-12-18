import java.util.Scanner;

public class Class6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your First Value :  ");
//        int a = sc.nextInt();
//        System.out.println("Enter your Second Value : ");
//        int b = sc.nextInt();
//                System.out.println(a+b);
//                sc.close();


//        int a = 1;
//        System.out.println(a);

//        for(int i = 0; i<= 10; i++){
//            if( i % 2 == 0){
//                System.out.println("Even " + i);
//            }
//            else{
//                System.out.println("Odd "+ i);
//            }
//        }
//        2*1 = 2
//        2*2 = 4
        System.out.println("Enter your table Number :  ");
        int tableNumber = sc.nextInt();
        for(int i = 1; i <=10; i++){
            System.out.println( tableNumber +" * "+ i +" = "+  i*tableNumber);
        }
    }
}
