package concurrency.threadbasic;

import static concurrency.threadbasic.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println(ANSI_BLUE+"Hello from "+currentThread().getName());
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println(ANSI_BLUE+"Another thread woke me up");
            return;
        }
        System.out.println(ANSI_BLUE+"Three seconds have passed and I'm awake");
    }
}
