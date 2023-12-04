package Recursion.Strings;

import java.util.ArrayList;
import java.util.List;

//find all possible combination of dice face to get 4 roll it as many times as you want
public class Dice {

    static List<String> dice(String p , int target){
        if(target == 0){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> ans = new ArrayList<>();

        for(int i = 1; i <= 6 && i<=target; i++){
            ans.addAll(dice(p+i , target-i));
        }
        return ans;
    }
    static int dicerollcount(String p , int target){
        if(target == 0){
            return 1;
        }

        int count = 0;

        for(int i = 1; i <= 6 && i<=target; i++){
           count = count + dicerollcount(p+i , target-i);
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(dice("" , 4));
        System.out.println(dicerollcount("", 4));
    }
}
