package Recursion.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Maze {

    static void pathWithRestriction(String p, Boolean [][] maze, int row ,int col ) {
        if (row == maze.length-1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if(maze[row][col] == false){
            return;
        }

        if (row < maze.length-1) {


        }
        if (col < maze[0].length - 1) {
            pathWithRestriction(p + 'R', maze , row, col + 1);
        }
    }


    static ArrayList<String> pathRetDiag(String p, int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);

            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        if(row > 1 && col > 1){
            ans.addAll(pathRetDiag(p + 'D' , row -1 , col -1));
        }

        if (row > 1) {
            ans.addAll(pathRetDiag(p + 'V', row - 1, col));

        }
        if (col > 1) {
            ans.addAll(pathRetDiag(p + 'H', row, col - 1));
        }

        return ans;
    }


    static void path(String p, int row ,int col ) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }
        if (row > 1) {
            path(p + 'D', row - 1, col);

        }
        if (col > 1) {
            path(p + 'R', row, col - 1);
        }
    }
    static ArrayList<String> pathRet(String p, int row, int col){
            if(row == 1 && col == 1){
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }

        ArrayList<String> ans = new ArrayList<>();
        if (row > 1) {
            ans.addAll(pathRet(p + 'D', row - 1, col));

        }
        if (col > 1) {
            ans.addAll(pathRet(p + 'R', row, col - 1));
        }

            return ans;
    }


    static int count(int row , int col){
        if(row == 1 || col == 1){
            return 1;
        }
        int left = count(row-1 , col);
        int right = count(row , col-1);
        return right + left;
    }



    public static void main(String[] args) {
        System.out.println(count(3,3));
        path("", 3 , 3);
        System.out.println(pathRet("" , 3 , 3));
        System.out.println("Including Diagonal Paths : ");
        System.out.println(pathRetDiag("", 3 , 3 ));


        //path restriction part
        Boolean[][] board = {
                {true, true , true},
                {true, false, true},
                {true, true, true}
        };
        pathWithRestriction("", board , 0, 0);
    }
}
