package multiThreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace () throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("market staff came to work");
        countDownLatch.countDown();
        System.out.println("countDownLatch = "+countDownLatch.getCount());
    }

    private static void everythingIsReady () throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("everything Is Ready. Let's go");
        countDownLatch.countDown();
        System.out.println("countDownLatch = "+countDownLatch.getCount());
    }

    private static void openMarket () throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("market is open");
        countDownLatch.countDown();
        System.out.println("countDownLatch = "+countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("One", countDownLatch);
        new Friend("Two", countDownLatch);
        new Friend("Three", countDownLatch);
        new Friend("Four", countDownLatch);
        new Friend("Five", countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();


    }
}

class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Friend (String name, CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
        this.name=name;
        this.start();
    }
    @Override
    public void run (){
        try {
            countDownLatch.await();
            System.out.println(name+" started to buy");
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
