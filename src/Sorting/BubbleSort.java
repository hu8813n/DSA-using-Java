package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 12, 7, 9, 8};
        b_sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void b_sort(int[] arr){
        for(int i = 0; i < arr.length; i++ ){
            boolean isSwapped = false;
            for(int j = 1; j < arr.length - i ; j++){
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwapped = true;
                }
                }
            if(!isSwapped){
                break;
            }
        }
    }
}
