package Threads;

public class MyThread extends Thread {
    boolean isfalse;
    Object lock = new Object();

    public MyThread(boolean isfalse) {
        this.isfalse = isfalse;
    }

    public void run() {
        synchronized (lock) {
            for (int i = 0; i <= 10; i++) {
                if (i % 2 == 0 && true) {
                    System.out.println(Thread.currentThread().getName() + i);

                    lock.notify();
                } else {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        }
    }

}

