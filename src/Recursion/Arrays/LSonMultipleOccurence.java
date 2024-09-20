package Recursion.Arrays;

import java.sql.Array;
import java.util.ArrayList;

public class LSonMultipleOccurence {
    public static void main(String[] args) {
        int[] arr= {1, 7, 11, 23, 1, 9, 15, 17, 22};
        int target = 1;
       // ArrayList<Integer> list = new ArrayList<>();
        System.out.println(search(arr, target, 0 , new ArrayList<>()));
        System.out.println(searchIdx(arr, target, 0 ));
    }
    static ArrayList<Integer> search(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length-1){
            System.out.println("Element Not Found");
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return search(arr, target, index +1, list);

        //  return arr[index] == target || search(arr, target, index+ 1)  // Returning boolean value

    }
    static ArrayList<Integer> searchIdx(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length-1){
            return list;
        }
        if(arr[index] == target){
            //this will contain answer for that function call only
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls =  searchIdx(arr, target, index +1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
