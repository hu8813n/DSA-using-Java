package Searching.BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 8, 9, 11, 14, 15, 17, 19, 21, 24, 16, 29, 35, 39, 42, 44, 49, 47, 48, 55, 59, 74, 75, 79, 80, 84, 88, 90, 98};
        int target = 49;

        int idx = search(arr, target);

        System.out.println(idx);
        System.out.println(arr[idx]);
    }
    static int search(int[] arr, int target){

        int start = 0;
        int end = 1;

        // finding the search area
        while(target > arr[end]){
            start = end + 1;
            end = end * 2;
        }

        while(start <= end){
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
