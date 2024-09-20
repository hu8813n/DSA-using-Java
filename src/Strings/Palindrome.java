package Strings;

public class Palindrome {
    //palindrome means it is same whether you read from left of right
    public static void main(String[] args) {
        String s = "abcdcbka";
        System.out.println(palindrome(s));
    }
    static boolean palindrome(String s){
        if(s == null || s.length()== 0){
            return true;
        }
       // boolean isTrue = true;
//        for(int i = 0; i < s.length()/2; i++){
//            if(s.charAt(i) != s.charAt(s.length()-i-1)){
//                isTrue = false;
//            }
//        }
        int st = 0;
        int e = s.length() -1;
        while(st < e) {
            if(s.charAt(st) != s.charAt(e)){
                return false;
            }
            st++;
            e--;
        }
            return true;
    }
}
