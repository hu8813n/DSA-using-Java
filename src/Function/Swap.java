package Function;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        System.out.println("a: " + a + " b : " + b);
        swap(a,b);
//        System.out.println("After swap");
//        System.out.println("a:" + a + " b : " + b); No swapping happens here why?????  ans: pass by value
    }
    static void swap(int a , int b ){
        int temp = a;
        a = b;
        b = temp;
        System.out.println();
        System.out.println("a:" + a + " b : " + b);
    }
}
