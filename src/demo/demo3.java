package demo;

public class demo3 {
    public static void main(String[] args) {
//        System.out.println("Hello world ");

//        myMethod();
//        myMethod();
//        myMethod();
//        myMethod();

        int a = 10;
        int b = 45;
        int c  = a + b;
        System.out.println(c);

        int a1 = 10;
        int b2 = 45;
        int c3  = a1 + b2;
        System.out.println(c3);

        System.out.println(Sum(12,56));
        System.out.println(Sum(67,34));
        System.out.println(Sum(1,3));



    }
  public static int Sum(int a, int b){
         return a + b;
  }


     public static void myMethod(){
         System.out.println("This is my method");
     }
}
