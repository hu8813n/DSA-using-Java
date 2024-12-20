package MultiThreading;

class Bracket{
    void printBrackets(char open , char close){
        for (int i = 0; i < 10; i++) {

            if(i < 5){
                System.out.print(open);
            }else {
                System.out.print(close);

            }

        }
        System.out.println();
    }
}

public class Sync {
    public static void main(String[] args) {
        Bracket bracket = new Bracket();
        Thread thread1 = new Thread( new Runnable(){
            public void run(){
                for (int i = 0; i < 5; i++) {
                    bracket.printBrackets('[' , ']');
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread( new Runnable(){
            public void run(){
                for (int i = 0; i < 5; i++) {
                    bracket.printBrackets('{' , '}');
                }
            }
        });
        thread2.start();
    }

    //if you observe the output you found that resource is shared among the thread --> unsyncronised
}
