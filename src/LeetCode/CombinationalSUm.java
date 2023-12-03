package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class CombinationalSUm {
    static List<List<Integer>> cs(int[] arr , int target ){
        List<List<Integer>> ans = new ArrayList<>();
        helper( arr , target , 0 , ans , new ArrayList<>());
        return ans;
    }
    static void helper( int[] candidates , int target , int ind , List<List<Integer>> outer , List<Integer> inn){
        if ( ind == candidates.length){
            if( target == 0){
                outer.add(new ArrayList<>(inn));
            }
            return;
        }
        if(candidates[ind] <= target){
            inn.add(candidates[ind]);
            helper(candidates, target-candidates[ind] , ind , outer , inn );
            inn.remove(inn.size()-1);
        }
        helper(candidates , target , ind+1, outer, inn);
    }

    public static void main(String[] args) {
        int[] arr= {2, 3 , 6 ,7};
        // Arrays.toString(arr); // convert integer array to string

        System.out.println(cs(arr, 7 ));

    }
}
