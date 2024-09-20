package Recursion.Strings;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    static ArrayList<String> permutation(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
           ans.addAll(permutation(f + ch +s, up.substring(1)));
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(permutation("", "abc"));

        permut("", "abc");
        System.out.println(permutationCount("", "abcd"));
    }

    static void permut(String p, String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permut(f+ch+s, up.substring(1));
        }
    }
    static int permutationCount(String p, String up){
        if(up.isEmpty()) {
//            System.out.println(p);
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count+ permutationCount(f+ch+s, up.substring(1));
        }
        return count;
    }

}

