package Homework;
public class Homework {
    public static void main(String[] args)throws Exception {
        //Задача
        //Написать метод 100 раз печатающий символ и вывести на экран результат его работы для двух потоков
        //(Например, один поток печатает # а второй *).
        //В конце работы на экран должно выводиться "end of main"

        System.out.println("main starts ");

        ThreadInterface threadInterface= new ThreadInterface("ThreadInterface");
        Thread thread= new Thread(threadInterface);
        thread.start();
        thread.join();

        System.out.println();

        ThreadClass threadClass= new ThreadClass("ThreadClass");
        threadClass.start();
        threadClass.join();

        System.out.println("\nend of main");

        //main starts
        //####################################################################################################
        //****************************************************************************************************
        //end of main
    }
}
