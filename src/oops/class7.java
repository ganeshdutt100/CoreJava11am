package oops;

 class setAndGet{
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }



//    public void setName(String name , int Age   ) {
//        this.name = name;
//        this.Age = Age;
//    }
}
public class class7 {
    public static void main(String[] args) {
        setAndGet obj = new setAndGet();

        obj.setName("Vardan");
        obj.setAge(21);

        System.out.println(" Name : " + obj.getName());
        System.out.println( " Age : " + obj.getAge());

//        obj.setName("Vardan", 21);
//        System.out.println("Name : " + obj.name);
//        System.out.println("Age : " + obj.age);  // Accessing the instance variable directly using getter method.
    }
}
