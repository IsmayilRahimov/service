package org.example.service.synchronize;

public class AccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Thread restoran = new Thread(() -> bankAccount.pulCixarma("Restoran", 100));
        Thread market = new Thread(() -> bankAccount.pulCixarma("Magaza", 100));
        restoran.start();
        market.start();

    }
}
