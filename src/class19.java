public class class19 {
    public static void main(String[] args) {
        System.out.println("Sum a and b :  "+ sum(12,56));
        System.out.println("Sum a , b and c :  "+ sum(12,56 , 67));
    }
    public static int sum(int a , int b){
        return a + b;
    }
    public static int sum(int a , int b, int c){
        return a + b +c;
    }
}
