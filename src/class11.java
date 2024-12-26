public class class11 {
    public static void main(String[] args) {
//        String str1 = "Ayush";
//        String str2 = "Vardan";

//        String []arr = {"Ayush","Vardan"};
//        System.out.println(arr[0]+ " "+arr[1]);

        int number[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
//        System.out.println(number[2]  );
        int sum = 0;

        for(int x : number) {
            sum  = sum + x;
//            System.out.println(x);
        }
        System.out.println(sum);

    }
}
