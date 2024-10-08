package Recursion.Basic;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static int fact(int n){
        if(n <=1){
            return 1; //this is our base condition, here our recursive calls stops.
        }
        return n * fact(n-1);
    }
}
