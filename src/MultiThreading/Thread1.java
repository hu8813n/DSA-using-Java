package MultiThreading;

import javax.swing.*;



public class Thread1 extends Thread{


    @Override
    public void run(){
        for (int i = 0; i <5; i++) {
            System.out.println(Thread.currentThread().getName());
        }


    }
    public static void main(String[] args) {
        Thread thread  = new Thread1();

        thread.start();
        for (int i = 0; i <5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

