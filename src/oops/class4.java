package oops;
 abstract class Vehicle{
    abstract void start();
}
class Car extends Vehicle {
    void start() {
        System.out.println("car starts");
    }
}

class Ship extends Vehicle{
    void start(){
        System.out.println("ship starts");
    }
}

    public class class4 {
        public static void main(String[] args) {
            Vehicle myCar = new Car();
            Vehicle myShip = new Ship();
            myCar.start();
            myShip.start();
        }
    }

