import java.util.Scanner;

public class class8 {
    public static void main(String[] args) {
        Scanner Vardan = new Scanner(System.in);
//        System.out.println("Enter your first value ");
//        int userValue  = Vardan.nextInt();
//
//        System.out.println("Enter your Second Value :  ");
//        int b = Vardan.nextInt();
//        for(int a = userValue;  a >= b; a--){
//            System.out.println(a);
//        }

        int userValue  = Vardan.nextInt();
        int fact = 1;
        for(int i = 1; i <= userValue; i++){
//            System.out.println(i);
            fact = fact * i;
//            System.out.println(fact);

        }
        System.out.println(fact);
    }
}
