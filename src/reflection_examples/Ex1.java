package reflection_examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        //first option of creating an object of class "Class"
        Class employeeClass = Class.forName("reflection_examples.Employee");
//        //second option of creating an object of class "Class"
//        Class employeeClass2 = Employee.class;
//        //third option of creating an object of class "Class"
//        Employee emp = new Employee(); // we can use any constructor or our purposes
//        Class employeeClass3 =emp.getClass();

        //this method returns NOT PRIVATE Field by it's name
        Field someField = employeeClass.getField("id");
        System.out.println("Type of id field: "+someField.getType());

        System.out.println("_______________________________________");

        //this method does not return private fields
        Field [] fields = employeeClass.getFields();
        for (Field f:fields){
            System.out.println("Type of "+f.getName()+" is "+f.getType());
        }

        System.out.println("_______________________________________");

        //this method returns ALL fields
        Field [] allFields = employeeClass.getDeclaredFields();
        for (Field f:allFields) {
            System.out.println("Type of " + f.getName() + " is " + f.getType());
        }

        System.out.println("_______________________________________");

        //this method returns NOT PRIVATE method by it's name
        Method someMethod = employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of method: "+someMethod+" is "+someMethod.getReturnType()+
                "\nlist of parameters: "+Arrays.toString(someMethod.getParameterTypes()));

        System.out.println("_______________________________________");

        //this method returns NOT PRIVATE method by it's name and parameter (uses for methods with parameters)
        Method someMethod1 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method: "+someMethod1+" is "+someMethod1.getReturnType()+
                "\nlist of parameters: "+Arrays.toString(someMethod1.getParameterTypes()));

        System.out.println("_______________________________________");

        //this method returns ALL NOT PRIVATE methods (including extended from parent - in our case it's class Object)
        Method [] methods = employeeClass.getMethods();
        for (Method method:methods){
            System.out.println("Name of method = "+method.getName()+
                    ", Return type = "+method.getReturnType()+
                    ", parameter types are "+Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("_______________________________________");

        //this method returns ALL methods including overridden
        Method [] allMethods = employeeClass.getDeclaredMethods();
        for (Method method:allMethods){
            System.out.println("Name of method = "+method.getName()+
                    ", Return type = "+method.getReturnType()+
                    ", parameter types are "+Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("_______________________________________");

        //this method returns only public methods
        Method [] allPublicMethods = employeeClass.getDeclaredMethods();
        for (Method method:allPublicMethods){
            if (Modifier.isPublic(method.getModifiers())){
            System.out.println("Name of method = "+method.getName()+
                    ", Return type = "+method.getReturnType()+
                    ", parameter types are "+Arrays.toString(method.getParameterTypes()));
        }
        }

        System.out.println("_______________________________________");

        //this method returns constructor without parameters
        Constructor constructor = employeeClass.getConstructor();
        System.out.println("Constructor has "+constructor.getParameterCount() +
                " parameters, their types are "+ Arrays.toString(constructor.getParameterTypes()));

        System.out.println("_______________________________________");

        //this method returns constructor with parameters
        Constructor constructor1 = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor has "+constructor1.getParameterCount() +
                " parameters, their types are "+ Arrays.toString(constructor1.getParameterTypes()));

        System.out.println("_______________________________________");

        //this method returns all NOT PRIVATE constructors
        Constructor [] allConstructors = employeeClass.getConstructors();
        for (Constructor constructor2: allConstructors) {
            System.out.println("Constructor "+constructor2.getName()+
                    " has " + constructor2.getParameterCount() +
                    " parameters, their types are " + Arrays.toString(constructor2.getParameterTypes()));
        }


    }
}
