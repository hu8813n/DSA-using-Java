package Searching.BinarySearch;
// https://leetcode.com/problems/find-in-mountain-array/description/
public class FindInMountainArray {
// array = [1,2,3,4,5,3,1], target = 3
// Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
    public static void main(String[] args) {
        int[] arr = {1, 2,3, 4, 5, 3, 1};
        int target = 3;

        int peakIdx = peakFinder(arr);
        int ans = -1;
        ans = search(arr, target, 0, peakIdx);
        if(ans == -1){
            ans = search(arr, target, peakIdx, arr.length-1);

        }
        System.out.println(ans);
    }
    static int peakFinder(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else{
                start = mid +1;
            }
        }
        return start;
    }
    static int search(int[] arr, int target,int start, int end){
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
