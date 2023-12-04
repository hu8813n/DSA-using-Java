package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {

    static List<String> pn(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        int digit = up.charAt(0) - '0'; //this will convert this into integer
         List<String> ans = new ArrayList<>();
        for(int i = (digit-1)*3; i < digit*3; i++) {

            char ch = (char) ('a' + i);
            ans.addAll(pn(p + ch, up.substring(1)));
        }
            return ans;
    }

    static int padCount(String p, String up) {
            if (up.isEmpty()) {
                return 1;
            }
            int digit = (int) up.charAt(0) - '0'; //this will convert this into integer
            int count = 0;
            for (int i = (digit - 1) * 3; i < digit * 3; i++) {
                char ch = (char) ('a' + i);
                count = count + padCount(p + ch, up.substring(1));
            }
            return count;
    }


    public static void main(String[] args) {
        System.out.println(pn("","12"));
            System.out.println(padCount("", "12"));
    }
}
