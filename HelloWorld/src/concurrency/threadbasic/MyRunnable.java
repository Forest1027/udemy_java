package concurrency.threadbasic;

import static concurrency.threadbasic.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED+"Hello from "+Thread.currentThread().getName());
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println(ANSI_RED+"Another thread woke me up");
            return;
        }
        System.out.println(ANSI_RED+"Three seconds have passed and I'm awake");
    }
}
