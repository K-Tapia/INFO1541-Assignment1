package EmployeeObjects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestingAnnotations {

    public static void main(String[] args) throws Exception {

        // copy employees from previous test pages
        HourlyEmployee hourly= new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        SalaryEmployee salary = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
        CommissionEmployee commission = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);
        // array for looping employees
        Object[] employees = {hourly, salary, commission};

        // count employee annotations
        int count = 0;
        for (Object emp : employees) {

            if (emp.getClass().isAnnotationPresent(EmployeeType.class)) {
                count++;
            }
        }
        System.out.println("You have " + count + " employee types.");

        //check fields and methods for each employee
        for (Object emp : employees) {

            System.out.println("\nProcessing: " + emp.getClass().getSimpleName());

            // Check fields for payrate annotation
            for (Field field : emp.getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(PayRate.class)) {
                    field.setAccessible(true); // allow private field access
                    Object value = field.get(emp); // get the value of the field
                    System.out.println("Employee pay rate: $" + value);
                }
            }

            // Check methods for weekly pay annotation
            for (Method method : emp.getClass().getDeclaredMethods()) {
                if (method.isAnnotationPresent(WeeklyPayCalculator.class)) {
                    method.setAccessible(true);
                    Object result = method.invoke(emp); // invoke the method
                    System.out.println("Weekly Pay Calculation: $" + result);
                }
            }
        }
    }
}
