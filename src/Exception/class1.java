package Exception;

public class class1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
//        int c  = a / b;
//        System.out.println(c);
//        System.out.println("Hello Ayush");


        try {
            int c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
        finally {
            System.out.println("This will always execute.");
        }
    }
}
