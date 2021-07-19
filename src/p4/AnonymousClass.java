package p4;

 abstract class Math {
    abstract int doOperation(int a, int b);
}

public class AnonymousClass {

     private int x=5;
    public static void main(String[] args) {

        Math math = new Math() {
            @Override
            public int doOperation(int a, int b) {
                AnonymousClass anonymousClass =new AnonymousClass();
                return a+b+anonymousClass.x;
            }
        };
        System.out.println(math.doOperation(3,6));

        Math math2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a*b;
            }
        };
        System.out.println(math2.doOperation(3,6));

    }
}
