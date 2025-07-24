package org.example.service.runnable;

public class MainRunable {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.run();

    }
}
