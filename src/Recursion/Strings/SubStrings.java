package Recursion.Strings;

import java.util.ArrayList;
import java.util.List;

public class SubStrings {
    static List<String> substrings(String p , String up , List<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        substrings( p+ch, up.substring(1) , list);
        substrings(p, up.substring(1), list);

         return list;
    }
    //same question without putting list in argument

    static ArrayList<String> sub (String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        //Answer from below calls --------------------------

        ArrayList<String> left = sub(p+ch, up.substring(1));
        ArrayList<String> right = sub(p, up.substring(1  ));
        left.addAll(right);
        return left;
    }




    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(substrings("" ,"abc" , list));
        System.out.println(sub("", "abc"));
    }
}
