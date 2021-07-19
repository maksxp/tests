package multiThreading;

public class Ex4 implements Runnable{

    @Override
    public void run() {
        System.out.println("Method run. Name of thread = "+Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Ex4());
        thread.start();
        thread.join();
        System.out.println("Method main. Name of thread = "+Thread.currentThread().getName());
    }
}
