package multiThreading;

public class Ex3 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("my thread");
        myThread5.setPriority(9);
        System.out.println("name myThread5 "+myThread5.getName()+
                " | priority myThread5 "+myThread5.getPriority());

    }
}
class MyThread5 extends Thread {
    @Override
    public void run (){
        System.out.println("hello");
    }
}
