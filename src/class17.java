public class class17 {
    public static void main(String[] args) {
        class18 obj1 = new class18();  // Object
      obj1.printNumber(12);

      int sumMethod = obj1.Mul(0,67);
        System.out.println(sumMethod);

        class17 cls17 = new class17();
        System.out.println(cls17.Sum(3,5));  // call method by object
        System.out.println(cls17.Sum(3,5,9));  // call method by object
        System.out.println(cls17.Sum(3,5,9,1));  // call method by object
    }
//create method by User

    public int Sum(int a , int b){
        return a+b;
    }
    public int Sum(int a , int b , int c){
        return a;
    }
    public int Sum(int a , int b , int c,int d){
        return a+b + c + d;
    }
}
