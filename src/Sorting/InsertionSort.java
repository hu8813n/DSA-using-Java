package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 12, 7, 9, 8};
        i_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void i_sort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j > 0; j--){
                // swapping only when e[j] < e[j-1]
                if(arr[j] < arr[j-1]){
                    swapArray(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }


    static void swapArray(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
