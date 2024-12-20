package MultiThreading;

public class Thread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread2 temp = new Thread2();
   //     temp.start();  -> since we are using the thowable method we can not start like this

        Thread t = new Thread(temp);
        t.start();




    }
}
