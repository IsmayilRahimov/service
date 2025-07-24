package org.example.service.myrunnable;

import java.lang.Runnable;

public class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread : Runnable");
    }
}
