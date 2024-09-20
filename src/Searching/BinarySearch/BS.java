package Searching.BinarySearch;

public class BS {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6 ,9 , 11, 12, 19, 20, 36, 48};
        int target =50;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start <= end ){
           int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
           else{
                return mid;
            }
        }
        return -1;
    }
}
