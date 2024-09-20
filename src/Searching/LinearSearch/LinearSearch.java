package Searching.LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
        int[] arr= {1, 7, 3, 9, 15, 17, 22};
        int target = 9;
        System.out.println(linearSearch(arr, target));

    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for( int i=0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
