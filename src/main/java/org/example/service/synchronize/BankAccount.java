package org.example.service.synchronize;

public class BankAccount {
    private int balance = 1000;

    public synchronized void pulCixarma(String threadName, int amount) {
        if (balance >= amount) {
            System.out.println(threadName + " emeliyyati ise dusdu ");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(threadName + " emeliyyati bitdi. Yeni balans:" + balance);
        }else {
            System.out.println("Kifayet qeder balans yoxdur : ");
        }
    }

}
