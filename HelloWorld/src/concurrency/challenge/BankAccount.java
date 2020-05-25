package concurrency.challenge;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private volatile double balance;
    private String accountNumber;
    private ReentrantLock lock;

    public BankAccount(double initialBalance, String accountNumber) {
        this.balance = initialBalance;
        this.accountNumber = accountNumber;
        lock = new ReentrantLock();
    }

    public void deposit(double amount) {
        while (true) {
            boolean status = false;
            try {
                if (lock.tryLock(10, TimeUnit.MILLISECONDS)) {
                    try {
                        balance += amount;
                        status = true;
                        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", balance is " + this.getBalance());
                        break;
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " could not get the lock.");
                }
            } catch (InterruptedException e) {

            }
            System.out.println(Thread.currentThread().getName() + " Transaction status:" + status);
        }

    }

    public void withdraw(double amount) {
        while (true) {
            boolean status = false;
            try {
                if (lock.tryLock(10, TimeUnit.MILLISECONDS)) {
                    try {
                        balance -= amount;
                        status = true;
                        System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", balance is " + this.getBalance());
                        break;
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " could not get the lock.");
                }
            } catch (InterruptedException e) {

            }
            System.out.println(Thread.currentThread().getName() + " Transaction status:" + status);
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
