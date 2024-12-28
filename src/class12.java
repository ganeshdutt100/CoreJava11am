public class class12 {
    public static void main(String[] args) {
//        int a[] = {10,43,67,98,34,65,34};
//        for(int x  : a){
//            System.out.print(a[x]);
//        }
//        for (int i = 0; i <= a.length;  i++ ){
//            System.out.println(a[i]);
//        }
        int arr[][] =  {
                {1,2,3,4},
                {45,78,23},
                {98,97,96}
        };

        for(int i = 0;  i <arr.length;  i++) {
            for(int j = 0;  j < arr[i].length;  j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }


    }
}
