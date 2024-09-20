package Recursion.Basic;

public class ReverseAno {
    public static void main(String[] args) {
        int n =1234;
        System.out.println(rev(n, 0));
    }
    static int rev(int n, int ans){
        if(n < 1){
            return ans/10;
        }
        ans += n%10;

        return rev(n/10,ans*10 );

    }
}
