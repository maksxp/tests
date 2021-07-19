package multiThreading;

public class Ex1 extends Thread{

    @Override
    public void run () {
         for (int i = 1; i <= 1000; i++) {
             System.out.println(i);
         }
     }
    public static void main(String[] args) {
        Ex1 ex1 =new Ex1();

        ex1.start();

        for (int i=1000; i>=1; i--){
            System.out.println(i);
        }

        System.out.println("MAIN");

    }
}

//class MyThread1 extends Thread {
//    @Override
//    public void run (){
//        for (int i=1; i<=1000; i++){
//            System.out.println(i);
//        }
//    }
//}
//class MyThread2 extends Thread {
//    @Override
//    public void run (){
//        for (int i=1000; i>=1; i--){
//            System.out.println(i);
//        }
//    }
//}

