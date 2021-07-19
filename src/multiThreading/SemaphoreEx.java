package multiThreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("One", callBox);
        new Person("Two", callBox);
        new Person("Three", callBox);
        new Person("Four", callBox);
        new Person("Five", callBox);

    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person (String name, Semaphore callBox){
        this.name=name;
        this.callBox=callBox;
        this.start();
    }
    @Override
    public void run (){
        try {
            System.out.println(name+" waits for call .....");
            callBox.acquire();
            System.out.println(name+" is calling ++++");
            Thread.sleep(2000);
            System.out.println(name+" finished call");
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            callBox.release();
        }
    }

}
