package multiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEx {
    public static void main(String[] args) throws InterruptedException {

        Call call = new Call();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.whatsAppCall();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
//        Thread.sleep(5000);
        System.out.println("main end");

    }
}

class Call {

    private Lock lock = new ReentrantLock();

    void mobileCall () {
        lock.lock();
        try {
            System.out.println("mobile call starts");
            Thread.sleep(1000);
            System.out.println("mobile call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void whatsAppCall () {
        lock.lock();
        try {
            System.out.println("whatsApp call starts");
            Thread.sleep(2000);
            System.out.println("whatsApp call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void skypeCall () {
        lock.lock();
        try {
            System.out.println("skype call starts");
            Thread.sleep(3000);
            System.out.println("skype call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
