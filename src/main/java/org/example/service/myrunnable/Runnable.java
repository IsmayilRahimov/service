package org.example.service.myrunnable;

public class Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadRunnable());
        Thread thread2 = new Thread(new PaymentRunnable());
        thread.run();
        thread2.run();
    }
}
