package Strings;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 954.1278f;
        System.out.printf("Formatted  number is %.2f" , a);
        System.out.println();
        //printf() method also rounding off the number
        System.out.println(Math.PI);
        // see the difference here .
        System.out.printf("Pie: %.3f", Math.PI);
        System.out.println();
        System.out.printf("My name is %s and I am %s" , "Khawar", "cool");
    }
}
