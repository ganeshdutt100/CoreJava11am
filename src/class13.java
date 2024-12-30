public class class13{
    public static void main(String[] args) {

        int arr[] = {3,6,8,4,2};
        int min = arr[0];
        int max = arr[0];
      for(int i=0; i<arr.length; i++) {
          if(arr[i] < min){
              min = arr[i]; //  min value
          }
          if(arr [i] >  max){
              max = arr[i]; //  max value
          }
      }
        System.out.println("min: " + min + " max: " + max);
    }
}
