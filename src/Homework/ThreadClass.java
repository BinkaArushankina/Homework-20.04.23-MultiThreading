package Homework;

public class ThreadClass extends Thread{
    public ThreadClass(String name) {
        super(name);
    }
    public void run(){
        for (int i=0; i<100; i++){
            System.out.print("*");
        }
    }
}
