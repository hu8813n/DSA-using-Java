package MultiD_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // syntax ---> datatype[][] var_name = new datatype[no_of_rows][no of columns]
        int[][] arr = new int[3][3];

        //there is also another way
        int[][] array = {
                {1, 2, 3}, // 0th index
                {4, 5, 6},  // 1st index
                {7, 8, 9}  // 2nd index
        };
        System.out.println(array[1][1]);


        //input in 2d array
        Scanner sc = new Scanner(System.in);

        for(int row =0; row< arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                arr[row][col] = sc.nextInt();

            }
        }
        // output of 2d array
//        for(int row =0; row< arr.length; row++){
//            for(int col=0; col<arr[row].length; col++){
//                System.out.print(arr[row][col]+ " ");
//            }
//            System.out.println();
//        }
        //using Arrays.toString method
//        for(int row =0; row< arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
        //using enhanced for loop
        for( int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
