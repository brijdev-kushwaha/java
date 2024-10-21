package com.Task_9_L2;


class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.printf("Deposited: %.2f | New Balance: %.2f%n", amount, balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.printf("Withdrew: %.2f | New Balance: %.2f%n", amount, balance);
        } else {
            System.out.printf("Insufficient funds for withdrawal of %.2f | Current Balance: %.2f%n", amount, balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}
class BankAccountThread extends Thread {
    private BankAccount account;

    public BankAccountThread(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Randomly choose to deposit or withdraw
            if (Math.random() > 0.5) {
                double amount = (Math.random() * 100) + 1; // Random amount between 1 and 100
                account.deposit(amount);
            } else {
                double amount = (Math.random() * 100) + 1; // Random amount between 1 and 100
                account.withdraw(amount);
            }

            try {
                // Sleep for a bit to simulate time taken for operations
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
