package Strings;
// String Concatenation Operations
public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);
        //THis is same as few steps : "a" + "1"
        //Integer will converted to Integer that will call toString()
    }
}
