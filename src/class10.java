public class class10 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5-i; j++){
                System.out.print(" ");
            }
            int number = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(number + " ");
                number = number*(i - j)/(j + 1);
            }
            System.out.println();
        }
//        for(int i =5-1; i >=1; i--){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
//             1
//           1   1
//           1   2   1
//           1   3   3    1
//           1   4   6   4   1
//           1   5   10   10  5   1

