package Homework;
public class ThreadClass extends Thread{
    private final  char symbol;
    public ThreadClass(char symbol) {
        this.symbol= symbol;
    }
    public void run(){
        for (int i=0; i<100; i++){
            System.out.print(symbol);
        }
    }
}
