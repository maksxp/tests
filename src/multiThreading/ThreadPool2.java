package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPool2 {
    public static void main(String[] args) throws InterruptedException {
//        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//
////        for (int i=0; i<10; i++) {
////            scheduledExecutorService.schedule(new RunnableImpl200(), 3, TimeUnit.SECONDS);
////        }
//        scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl200(), 3,1, TimeUnit.SECONDS);
////        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl200(), 3,3, TimeUnit.SECONDS);
//        Thread.sleep(10000);
//        scheduledExecutorService.shutdown();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i=0; i<10; i++) {
            executorService.execute(new RunnableImpl200());
            Thread.sleep(1000);
        }
        executorService.shutdown();

    }
}


class RunnableImpl200 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " begins work");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+ " ends work");
    }
}