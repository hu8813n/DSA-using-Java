package Recursion.Basic;

public class CountNoOfDigit {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(DigitCount( n));
    }
    static int DigitCount(int n){
        if( n == 0){
            return 0;
        }
        return 1+DigitCount(n/10);
    }
}
