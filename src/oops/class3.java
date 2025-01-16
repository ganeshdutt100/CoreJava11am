package oops;
 class Animal1{
    void makeSound(){
        System.out.println("Animal make a sound..");
    }
}

class  dog1 extends Animal1{
     @Override
     void makeSound(){
         System.out.println("Dog sound.........");
     }
}
public class class3 {
    public static void main(String[] args) {
     dog1 myDog = new dog1();
     myDog.makeSound();
    }
}
