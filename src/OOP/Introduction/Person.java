package OOP.Introduction;

public class Person {
    String name;
    int cash ;

    Person(String name , int cash) {
        this.name = name;
        this.cash = cash;
    }

    void display() {
        System.out.println("Name: " + this.name);
    }

    private void print(Person p) {
        System.out.println("Total cash " + p.cash);
    }

    void show() {
        print(this); // Passing the current object to print method
    }


}
