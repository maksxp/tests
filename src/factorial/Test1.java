package factorial;

public class Test1 {
    public static void main(String[] args) {
        try {
            System.out.println(Factorial.getFactorial(-1));
        } catch (FactorialException e) {
            e.printStackTrace();
        }
    }
}
