package Concurrency;

public class ThreadStudying {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                int secToWait = 1000 * 60;
                Thread.currentThread().sleep(secToWait);
                System.out.println("Wake the fck up Samurai");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }
}
