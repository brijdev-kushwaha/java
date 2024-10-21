package com.Task_9_L2;

public class BankAccountDemo {
public static void main(String[] args) {
    BankAccount account = new BankAccount(500.00); // Initial balance of 500.00

    // Create multiple threads
    BankAccountThread[] threads = new BankAccountThread[5];
    for (int i = 0; i < threads.length; i++) {
        threads[i] = new BankAccountThread(account);
        threads[i].start(); // Start the thread
    }

    // Wait for all threads to finish
    for (BankAccountThread thread : threads) {
        try {
            thread.join(); // Wait for this thread to die
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    // Final balance
    System.out.printf("Final Balance: %.2f%n", account.getBalance());
}
}
