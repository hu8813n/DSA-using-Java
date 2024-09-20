package Searching.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
     //   int[] arr = {2, 4, 6 ,9 , 11, 12, 19, 20, 36, 48};
        int[] arr = {90, 78, 43, 12, 15, -6, -9};
        int target =-9;
        System.out.println(search(arr, target));

    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        //find whether array is stored in ascending or descending order

        boolean isAsc = arr[start] < arr[end];
        while(start <= end ){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid -1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid -1;
                }
            }

        }
        return -1;
    }
}
