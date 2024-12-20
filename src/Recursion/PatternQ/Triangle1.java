package Recursion.PatternQ;
//****
//***
//**
//*
//n=4

import com.sun.security.jgss.GSSUtil;

public class Triangle1 {
    public static void main(String[] args) {
        pat1(4, 0);
    }
//    static void pat(  int r , int c){
//        if(r == 0){
//            return;
//        }
//        if( c < r){
//            System.out.print("* ");
//            pat( r, c+1);
//        }else{
//            System.out.println();
//            pat(r-1, 0);
//        }
//
//    }

    static void pat1(int r , int  c){
        if(r == 0){
            return;
        }

        if(c < r){
            System.out.print("*");
            pat1(r , ++c);
        }else {
            System.out.println();
            pat1(r-1, 0);
        }

    }
}
