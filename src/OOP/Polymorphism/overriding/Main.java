package OOP.Polymorphism.overriding;

public class Main {
    //method overriding example
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();

        circle.area();
        shape.area();
    }
}
