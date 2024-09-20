package OOP.Introduction;

  /*
    Classes ---
    A class in Java is a blueprint or template for creating objects.
    It encapsulates data for the object and methods to manipulate that data.
    A class defines the attributes and behaviors that the objects created from the class will have.

    Attributes (or fields) are the properties or characteristics of the class.
    Methods are the functions or procedures that operate on the attributes of the class.
    */

public class Car {

    //Attributes
    String brand;
    String color;
    int year;

    // Methods
    void startEngine() {
        System.out.println("The engine has started.");
    }

    void stopEngine() {
        System.out.println("The engine has stopped.");
    }

    //Constructor --
    public Car(){
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    /*
Parameterized Constructor:
A parameterized constructor allows you to initialize an object with specific values.
It takes arguments that are used to set the initial state of the object.
     */
    public Car( String brand, String color, int year){
        this.brand = brand;
        this.color = color;
        this.year = year;
    }
}
