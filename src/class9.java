public class class9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print( " " );
            }
            for(int k  = 1; k <= (2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        for (int i = 5; i >= 1; i--) {
//            for (int j = 1; j <= 5-i; j++) {
//                System.out.print( " " );
//            }
//            for(int k  = 1; k <= (2*i-1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//  int number = 1;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print( number+" " );
//                number++;
//            }
//            System.out.println();
//        }
//    *
//   **
//  ***
// ****
//*****

//        for(int i = 5; i >= 1; i--){
//            for(int k = 1; k <= i; k++){
//                System.out.print(" ");
//            }
//            for(int j = i; j <= 5; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

    }
}
//Program to Print Hourglass Pattern in Java
//1)
//         1
//        2 3
//       4 5 6
//      7 8 9 10
//    11 12 13 14 15

//         1
//        3 5
//       7 9 11
//     13 15 17 19

//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *

//        *****
//        ****
//        ***
//        **
//        *
//        *
//        **
//        ***
//        ****
//        *****