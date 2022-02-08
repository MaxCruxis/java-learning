package Concurrency;

import java.util.concurrent.TimeUnit;

public class ThreadStudying {
    public static void main(String[] args) {
        /*Runnable task = () -> {
            try {
                *//*int secToWait = 1000 * 3;
                Thread.currentThread().sleep(secToWait);*//*
                System.out.println("nap time");
                TimeUnit.SECONDS.sleep(5);
                System.out.println("Wake the fck up Samurai");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(task);
        thread.start();*/

        Runnable task = () -> {
            try {
                TimeUnit.SECONDS.sleep(60);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        };
        Thread thread = new Thread(task);
        thread.start();
        thread.interrupt();
    }
}
