package Homework;
public class Homework {
    public static void main(String[] args)throws Exception {
        //Задача
        //Написать метод 100 раз печатающий символ и вывести на экран результат его работы для двух потоков
        //(Например, один поток печатает # а второй *).
        //В конце работы на экран должно выводиться "end of main"

        System.out.println("main starts ");

        ThreadInterface threadInterface= new ThreadInterface('*');
        Thread thread= new Thread(threadInterface);
        thread.setName("ThreadInterface");
        thread.start();
        thread.join();

        System.out.println();

        Thread threadClass= new ThreadClass('#');
        threadClass.setName("ThreadClass");
        threadClass.start();
        threadClass.join();


       //wmesto join() moschno ispolsowatj isAlive()
       // do{
       //     System.out.println(".");
       // }while(threadClass.isAlive() || thread.isAlive()); //poka oni schiwi budet petschatatsa totschka

        System.out.println("\nend of main");

        //potok moschet bitj dominantnij i woobsche drugim ne otdawatj wosmoschnostj rabotatj, poetomu eto moschno kontr.
        threadClass.setPriority(5);
        System.out.println("ThreadClass Priority is "+threadClass.getPriority());
        System.out.println("Main Thread Priority is "+Thread.currentThread().getPriority()); //currentThread() -eto main


        //Output
        //main starts
        //####################################################################################################
        //****************************************************************************************************
        //end of main
    }
}
