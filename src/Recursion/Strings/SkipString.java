package Recursion.Strings;

public class SkipString {
    //skip the given string
    static void skip(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(up.startsWith("apple")){
            skip( p , up.substring(5));
        }else{
            skip( p+ch, up.substring(1));
        }
    }

    public static void main(String[] args) {
        skip("" , "bccappledack");

    }
}
