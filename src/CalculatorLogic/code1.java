package CalculatorLogic;

public class code1 {
    public static void main(String[] args) {
//        s
//        System.out.println(Sum(12,67,78));
//        System.out.println(Mul(12,12));
        System.out.println(Div(12,1));
    }
//    public  static int Sum(int x, int y) {
//    return x + y;
//    }public  static int Sum(int x, int y,int c) {
//    return x + y +c;
//    }

    public static int Sum(int... numbers) {
        int sum = 0;
        for(int x : numbers){
            sum += x;
        }
        return sum;
    }
    public static int Mul(int... numbers) {
        int sum = 1;
        for(int x : numbers){
            sum *= x;
        }
        return sum;
    }
    public static int Div(int... numbers) {
        int sum = 1;
        for(int x : numbers){
            sum /= x;
        }
        return sum;
    }
}
