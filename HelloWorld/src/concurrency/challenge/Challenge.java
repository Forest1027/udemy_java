package concurrency.challenge;

public class Challenge1 {
    /**
     * Create and start threads
     * We could have two people using a joint bank account at the same time.
     * Create and start two threads that use the same BankAccount instance and an initial balance of $1000.00.
     * One will deposit $300.00 into the bank account, and then withdraw $50.00.
     * The other will deposit $203.75 and then withdraw $100.00
     *
     * solution: deposit and withdraw methods are decorated by synchronized keyword
     *
     * @param args
     */
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000, "JointAccount");
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                account.deposit(300);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
                account.withdraw(50);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(203.75);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
                account.withdraw(100);
            }
        });

        thread1.start();
        thread2.start();
    }
}
