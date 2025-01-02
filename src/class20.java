public class class20 {
    public static void main(String[] args) {
        System.out.println("Add a + b : "+ sum(12,45));
        System.out.println("Add a + b + c : "+ sum(12,45 ,89));
    }
    public static int sum(int... numbers){
        int result =  0;
        for(int x : numbers){
            result += x;
        }
        return result;
    }
}
