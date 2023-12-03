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

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(substrings("" ,"abc" , list));
    }
}
