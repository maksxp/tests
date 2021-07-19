package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
    public static void main(String[] args) throws InterruptedException {
/*        ExecutorService executorService = Executors.newFixedThreadPool(5);*/
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i=0; i<10; i++) {
            executorService.execute(new RunnableImpl100());
            System.out.println("i "+i);
        }

        executorService.shutdown();
        executorService.awaitTermination(4, TimeUnit.SECONDS);
        System.out.println("main ends");
    }
}

class RunnableImpl100 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
