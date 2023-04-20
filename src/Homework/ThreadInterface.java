package Homework;

public class ThreadInterface implements Runnable{
    String name;

    public ThreadInterface(String name) {
        this.name = name;
    }
    public void run() {
        for (int i=0; i<100; i++){
            System.out.print("#");
        }
    }
}
