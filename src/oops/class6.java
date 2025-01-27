package oops;
//extends - X
//abstract class Animal12 {
//    abstract void sound();
//}
//abstract class Animal123 {
//    abstract void eat();
//}
interface Animal12 {
    void sound();
}
interface Animal123 {
    void eat();
}

class Cat implements Animal12, Animal123 {
    public void sound() {
        System.out.println("The cat meows");
    }
    public void eat() {
        System.out.println("The cat eats");
    }
}
public class class6 {
    public static void main(String[] args) {
    Cat cat = new Cat();
    cat.sound();
    cat.eat();
    }
}
