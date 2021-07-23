package reflection_examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class employeeClass = Class.forName("reflection_examples.Employee");

        // deprecated option of creating a new object of class
        Object ob = employeeClass.newInstance();
        Employee emp = (Employee) employeeClass.newInstance();
        System.out.println(emp);

        System.out.println("___________________________________");

        // recommended option (without generics) of creating a new object of class
        Constructor constructor1 = employeeClass.getConstructor();
        Object ob1 = constructor1.newInstance();
        Employee emp1 = (Employee) ob1;
        System.out.println(emp1);

        System.out.println("___________________________________");

        // recommended option (using generics) of creating a new object of class
        Constructor <Employee> constructor2 = employeeClass.getConstructor();
        Employee emp2 = constructor2.newInstance();
        System.out.println(emp2);

        System.out.println("___________________________________");

        // recommended option (using generics) of creating a new object of class using constructor with parameters
        Constructor <Employee> constructor3 = employeeClass.getConstructor(int.class, String.class, String.class);
        Employee emp3 = constructor3.newInstance(1, "1", "1");
        System.out.println(emp3);

        System.out.println("___________________________________");

        //invoke public method with parameters
        Method method1 = employeeClass.getMethod("setSalary", double.class);
        method1.invoke(emp3, 800.88);
        System.out.println(emp3);

        System.out.println("___________________________________");

//        //invoke private method with parameters - DOES NOT WORK
//        Method method2 = employeeClass.getDeclaredMethod("changeDepartment", String.class);
//        method2.invoke(emp3, "2");
//        System.out.println(emp3);
//        System.out.println("___________________________________");
    }
}
