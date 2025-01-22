

//1. Inheritance and Method Overriding
//Create a class Vehicle with a method start().
//
//Create subclasses Car, Bike, and Truck that override the start() method.
//Use a for loop to iterate over an array of Vehicle objects and call start().
package oops.Questions;
 class Vehicle{
     void start(){
         System.out.println("Vehicle is starting....");
     } void stop(){
         System.out.println("Vehicle is stop!");
     }
 }
 class Car extends Vehicle{
  @Override
    void start() {
        System.out.println("Car starts");
    }
    void stop() {
        System.out.println("Car stop");
    }
}
class Bike extends Vehicle{
  @Override
    void start() {
        System.out.println("Bike starts");
    }
    void stop() {
        System.out.println("Bike stop");
    }
}
class Truck extends Vehicle{
  @Override
    void start() {
        System.out.println("Truck starts");
    }
    void stop() {
        System.out.println("Truck stop");
    }
}
public class FirstQuestion {
    public static void main(String[] args) {
//        Car obj1 = new Car();
        // Create an array of vehicles and assign objects of Car, Bike, and Truck to it.
        Vehicle[] vehicles = {new Car(), new Bike(), new Truck()};
       for(Vehicle v : vehicles){
           v.start();
           v.stop();
       }
    }
}
