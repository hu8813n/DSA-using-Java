package Searching.BinarySearch;
 /*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
    * */
public class FirstandLastIdx {
     public static void main(String[] args) {
         int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
         int target  = 7;
         int[] ans = {-1, -1};
         ans[0] = search(arr, target, true );
         if(arr[0] != -1){
             ans[1] = search(arr, target, false );
         }
         System.out.print(ans[0] + "  " + ans[1]);

     }
     static int search(int[] arr, int target , boolean isFirstIdx){
         if(arr.length == 0){
             return -1;
         }
         int ans = -1;
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
                 ans = mid;
                 if(isFirstIdx){
                     end = mid -1;
                 }else{
                     start = mid + 1;
                 }

             }
         }
         return ans;
     }
}
