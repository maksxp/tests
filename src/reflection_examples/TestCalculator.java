package reflection_examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//we will use test100.txt file from the root of project
//if we have text as below we want to get result in console
//sum - name of method in first line
// a  - first param  in second line
// b - second param  in third line

//only reflection allows us to solve such task
public class TestCalculator {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("test100.txt"))){
            String methodName = bufferedReader.readLine();
            String firstArgument = bufferedReader.readLine();
            String secondArgument = bufferedReader.readLine();

            Calculator calculator = new Calculator();
            Class cl = calculator.getClass();
            Method method = null;
            Method [] myMethods = cl.getDeclaredMethods();
            for (Method myMethod:myMethods){
                if (myMethod.getName().equals(methodName)){
                    method=myMethod;
                }
            }
            method.invoke(calculator, Integer.parseInt(firstArgument), Integer.parseInt(secondArgument));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
