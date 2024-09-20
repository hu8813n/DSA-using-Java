package Recursion.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {1, 7, 3, 9, 15, 17, 22};
        int target = 1;
        System.out.println(search(arr, target, 0));
    }
    static int search(int[] arr, int target, int index){
        if(index == arr.length-1){
            System.out.println("Element Not Found");
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return search(arr, target, index +1);
        }

          //  return arr[index] == target || search(arr, target, index+ 1)  // Returning boolean value

    }
}
