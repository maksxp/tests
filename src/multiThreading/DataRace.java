package multiThreading;

public class DataRace {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    volatile static int count = 0;
}

class MyRunnable implements Runnable {
    public synchronized void increment (){
        Counter.count++;
        System.out.print(Counter.count+" ");
    }

    @Override
    public void run() {
        for (int i=0; i<3; i++){
            increment();
        }

    }
}

