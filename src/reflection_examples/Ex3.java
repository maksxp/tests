package reflection_examples;

import java.lang.reflect.Field;

public class Ex3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "MMM", "IT");
        Class employeeClass = employee.getClass();
        Field field = employee.getClass().getDeclaredField("salary");

        //first string below allows access to private field. Without it we will get IllegalAccessException
        field.setAccessible(true);
        double salaryValue = (Double) field.get(employee);
        System.out.println(salaryValue);
        //string below sets new value to private field. Works if setAccessible(true) was invoked.
        field.set(employee, 1500);
        double newSalaryValue = (Double) field.get(employee);
        System.out.println(newSalaryValue);
    }
}
