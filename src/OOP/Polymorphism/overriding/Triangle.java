package OOP.Polymorphism.overriding;

public class Triangle extends Shapes {

    @Override
    void area() {
        System.out.println("Area is 0.5 * h * b");
    }
}
