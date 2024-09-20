package Strings;

public class Main {
    public static void main(String[] args) {
        // a and b pointing toward same object, the concept of string pool
        String a = "Hussain";
        System.out.println(a);
        String b = "Hussain";
        System.out.println(b);
        // what if we modify one of them;
        a = "Abutalib";
        // you can not modify the string , strings are immutable
        // The new object created here with reference variable a pointing to object ---> Abutalib
        System.out.println(a + " " + b); //output : Abutalib Hussain why???? Ans is in above line

        // Q = why we can not modify the string objects.

        // how to create different objects with same value;
        String first = new String("abcd");
        String second = new String ("abcd");
        // go to comparison class to learn about it.
        System.out.println(first == second);


        // when you only need to check value --> use .equals() method.
        System.out.println(first.equals(second));
    }
}
