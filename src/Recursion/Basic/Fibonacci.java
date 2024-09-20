package Recursion.Basic;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(50)); //13
    }
    static int fib(int n){
        if( n <= 1){
            return n;
        }

        return fib(n-1) + fib(n-2);
        //Linear Recurrence --> It is inefficient to solve linear recurrence using recursion
        //two or more recursive calls doing same work
    }
}
