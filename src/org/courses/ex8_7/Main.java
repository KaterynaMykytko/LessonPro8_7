package org.courses.ex8_7;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Thread thread = new Thread(worker);
        thread.setDaemon(true);
        thread.start();
        System.out.println(thread.getName());
        System.out.println("Is Daemon?" + thread.isDaemon());
        System.out.println(thread.getState());
        System.out.println(thread.isAlive());
        System.out.println(thread.getPriority());
        System.out.println("Thread main finished");
    }
}