package Recursion.Basic;

public class countZeroes {
    public static void main(String[] args) {
        System.out.println(zero(302040));
        System.out.println( "This answer belong to helper function: " + helper(1020030, 0));
    }
    static int zero(int n) {
        if (n % 10 == n) {
            return 0;
        }
        if (n % 10 == 0) {
            return 1 + zero(n / 10);
        } else {
            return zero(n / 10);
        }
    }
        //special pattern how to pass value to above function
        static int helper(int n, int c){
            if(n%10 == n){
                return c;
            }
            if( n%10 == 0){
                return helper(n/10, c+1);
            }else{
                return helper(n/10 , c);
            }
        }

}
