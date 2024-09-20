package Recursion.PatternQ;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {

        int[] arr = {5, 9, 3, 7, 1, 4};
        sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr , int r, int c, int max){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[max]) {
                sort(arr, r ,c+1, c);
            }else {
                sort(arr, r, c + 1, max);

            }
        }
        else{
            swap(arr, max, r-1);
            sort(arr,r-1, 0, 0);
        }

    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
