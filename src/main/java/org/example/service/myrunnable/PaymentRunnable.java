package org.example.service.myrunnable;

import java.lang.Runnable;

public class PaymentRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Payment : Runnable");
    }
}
