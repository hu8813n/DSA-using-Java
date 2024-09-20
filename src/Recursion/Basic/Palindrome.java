package Recursion.Basic;
import Recursion.Basic.ReverseAno;

import static Recursion.Basic.ReverseAno.rev;

public class Palindrome {
    public static void main(String[] args) {
        int n = 1234321;
        System.out.println(checkP(n));
    }

    static boolean checkP(int n){
        return n == rev(n, 0);
    }
}
