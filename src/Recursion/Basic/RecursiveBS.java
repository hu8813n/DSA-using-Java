package Recursion.Basic;

public class RecursiveBS {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6 ,9 , 11, 12, 19, 20, 36, 48};
        int target =2;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
    static int search (int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid] ){
            return search(arr, target, start, mid-1);
        }else{
            return search(arr, target, mid+1, end);
        }
    }
}
