public class class9 {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5-i; j++) {
//                System.out.print( " " );
//            }
//            for(int k  = 1; k <= (2*i-1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }   for (int i = 5; i >= 1; i--) {
//            for (int j = 1; j <= 5-i; j++) {
//                System.out.print( " " );
//            }
//            for(int k  = 1; k <= (2*i-1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

  int number = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( number+" " );
                number++;
            }

            System.out.println();
        }
    }
}
