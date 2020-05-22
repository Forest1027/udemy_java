package concurrency.threadbasic;

import static concurrency.threadbasic.ThreadColor.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // enable JVM to run the run method of another thread
        Thread anotherThread = new AnotherThread();
        anotherThread.start();
        anotherThread.join();
        System.out.println(ANSI_PURPLE + "Hello from main thread.");

        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();

        System.out.println(ANSI_PURPLE + "Hello again from main thread.");
    }
}
