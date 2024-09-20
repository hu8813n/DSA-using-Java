package Sorting;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
            int[] arr = {2, 1, 5, 3, 12, 7, 9, 8};
            s_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void s_sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            //find the maximum element in the remaining array and swap with itscorrect index
            int last = arr.length - i -1;
            int maxIdx = getMaxIdx(arr, 0 , last);
            swapArray(arr, maxIdx, last);
        }
    }
    static int getMaxIdx(int[] arr, int start, int end){
        int max = start;
        for(int i = 0; i<= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swapArray(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
