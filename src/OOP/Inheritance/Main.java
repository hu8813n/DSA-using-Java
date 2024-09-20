package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        BoxWeight boxW = new BoxWeight();
        System.out.println(boxW.width);

        BoxWeight box2 = new BoxWeight(20.7, 74, 25.6, 30);
        System.out.println("the weight is " + box2.weight);
    }
}
