package reflection_examples;

public class Calculator {
    void sum (int a, int b){
        int result = a + b;
        System.out.println("Sum of "+a+" and "+b+" is "+result);
    }

    void subtraction (int a, int b){
        int result = a - b;
        System.out.println("Difference of "+a+" and "+b+" is "+result);
    }

    void division (int a, int b){
        int result = a / b;
        System.out.println("quotient of "+a+" and "+b+" is "+result);
    }

    void multiplication (int a, int b){
        int result = a * b;
        System.out.println("product of "+a+" and "+b+" is "+result);
    }
}
