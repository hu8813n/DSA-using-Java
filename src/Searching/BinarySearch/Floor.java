package Searching.BinarySearch;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6 ,9 , 11, 12, 19, 20, 36, 48};
        int target =47;
        int idx = search(arr, target);
        System.out.println(idx);
        System.out.println(arr[idx]);

    }

    static int search(int[] arr, int target){
        if(arr.length == 0){
            return 0;
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
        return end ;
    }
}
