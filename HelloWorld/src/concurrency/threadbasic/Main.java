package concurrency;

import static concurrency.ThreadColor.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // enable JVM to run the run method of another thread
        Thread anotherThread = new AnotherThread();
        //anotherThread.setName("==Another Thread==");
        anotherThread.start();
        System.out.println(ANSI_PURPLE + "Hello from main thread.");

        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();
        anotherThread.join();
        myRunnable.join();
        //anotherThread.interrupt();


        System.out.println(ANSI_PURPLE + "Hello again from main thread.");
    }
}
