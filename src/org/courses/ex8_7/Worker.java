package org.courses.ex8_7;

public class Worker implements Runnable {
    @Override
    public void run() {
        System.out.println("Starts Daemon thread");
    }
}
