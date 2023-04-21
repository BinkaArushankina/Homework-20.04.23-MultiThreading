package Homework;
public class ThreadInterface implements Runnable{
    private final  char symbol;
    public ThreadInterface( char symbol) {
        this.symbol = symbol;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is started");
        for (int i=0; i<100; i++){
            System.out.print(symbol);
        }
        System.out.println(Thread.currentThread().getName()+ " is ending");
    }
}
