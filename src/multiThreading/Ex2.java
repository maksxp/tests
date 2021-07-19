package multiThreading;

public class Ex2{
    public static void main(String[] args) {
        Thread myThread3 =new Thread(new MyThread3());
        Thread myThread4 =new Thread(new MyThread4());
        myThread3.start();
        myThread4.start();
        System.out.println("MAIN");

    }
}

class MyThread3 implements Runnable {
    @Override
    public void run (){
        for (int i=1; i<=1000; i++){
            System.out.println(i);
        }
    }
}
class MyThread4 implements Runnable {
    @Override
    public void run (){
        for (int i=1000; i>=1; i--){
            System.out.println(i);
        }
    }
}