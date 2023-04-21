package Homework;
public class ThreadInterface implements Runnable{
    private final  char symbol;
    public ThreadInterface( char symbol) {
        this.symbol = symbol;
    }
    public void run() {
        for (int i=0; i<100; i++){
            System.out.print(symbol);
        }
    }
}
