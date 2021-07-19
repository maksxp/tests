package multiThreading;

public class SynchronizedBlock3 {
    static final Object lock =new Object();

    synchronized void mobileCall () {
        synchronized (lock) {
            System.out.println("mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("mobile call ends");
        }
    }

    synchronized void skypeCall () {
        synchronized (lock) {
            System.out.println("skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("skype call ends");
        }
    }

    synchronized void whatsAppCall () {
        synchronized (lock) {
            System.out.println("whatsApp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("whatsApp call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunMobile());
        Thread thread2 = new Thread(new RunSkype());
        Thread thread3 = new Thread(new RunWhatsApp());

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class RunMobile implements Runnable {
    @Override
    public void run() {
        new SynchronizedBlock3().mobileCall();
    }
}

class RunSkype implements Runnable {
    @Override
    public void run() {
        new SynchronizedBlock3().skypeCall();
    }
}

class RunWhatsApp implements Runnable {
    @Override
    public void run() {
        new SynchronizedBlock3().whatsAppCall();
    }
}

class Car {}