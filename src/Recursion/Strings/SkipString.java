package Recursion.Strings;

public class SkipString {
    //skip the given string
    static String skip(String up){
        if(up.isEmpty()){
           // System.out.println(p);
            return "";
        }

        if(up.startsWith("apple")){
           return skip( up.substring(5));
        }else{
           return up.charAt(0) + skip( up.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println( skip( "bccappledack"));

    }
}
