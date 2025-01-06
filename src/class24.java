
  class constMethod{
    int age ;
    String name;
   public constMethod(String name ,int age ){
        this.age = age;
        this.name = name;
    }

    public void printMethod(){
        System.out.println("N ame : " + name );
        System.out.println(" Age : " + age);// Accessing the instance variable directly
    }
  }
public class class24 {
    public static void main(String[] args) {
     constMethod obj1 = new constMethod("Vardan" , 21);
     obj1.printMethod();
    }

}
