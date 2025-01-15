package oops;

class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println(" the dog is barking....");
    }
}
public class class2 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.bark();
        myDog.eat();
    }
}
