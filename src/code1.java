class Car{
//    Attributes
    String make;
    String model;
    int year;

//   Constructor method
    Car(String make , String model , int year ){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo(){
        System.out.println( "Car Make  : " + make);
        System.out.println( "Car Model  : " + model);
        System.out.println( "Car Year  : " + year);
    }
}


public class code1 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota" , "Corolla" , 2025);
        myCar.displayInfo();
//        System.out.println("Hello world");
    }
}
//Syntax
// class  ClassName{
//    dataType attributesName
// stm

    //constructor
//    ClassName(){
//
//    }
//    returnType methodName
//}
//class ClassNameMain{
//
//}

//type=
//Class
//Object
//Encapsulation
//Inheritance
//Polymorphism
//Abstraction