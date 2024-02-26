package Threads;

import oops.Employe;

public class Test {
    public static void main(String[] args) {
        Thread evenThread= new Thread(new MyThread(true),"Even Thread");
        Thread oddThread=new Thread(new MyThread(false),"Odd Thread");
        evenThread.start();
        oddThread.start();

      

    }
}
