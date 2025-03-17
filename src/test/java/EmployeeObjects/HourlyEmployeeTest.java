package EmployeeObjects;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {
    HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
    @Test
    public void testIncreaseHours_Plus_Minus (){
        //add hours, checks positive numbers
        emp.increaseHours(10);
        assertEquals(10,emp.getHoursWorked(),"Hours after adding =10");
        // check for negatives
        emp.increaseHours(-2);
        assertEquals(10,emp.getHoursWorked(),"Hours should remain 10 even if negative is added");
        //check for 0
        emp.increaseHours(0);
        assertEquals(10,emp.getHoursWorked(),"Hours should remain 10 after adding 0");

    }
    @Test
    public void testAnnualRaise(){
        //Check to see if wage gets increased 5%
        assertEquals(32.85,emp.getWage(),"32.85 is expected");
        emp.annualRaise();
        assertEquals(34.49,emp.getWage(),"wage should be 34.49");
    }
@Test
    public void testCalculateWeeklyPayNormal(){
        //get 35 hours worked
        emp.increaseHours(35);
        assertEquals(35,emp.getHoursWorked(),"35 hours");
        double pay= emp.calculateWeeklyPay();
        assertEquals(1149.75,pay,"weekly pay 35 hours");
    }
    @Test
    public void testCalculateWeeklyPayOvertime(){
        emp.increaseHours(45);
        assertEquals(45,emp.getHoursWorked());
        double otPay= emp.calculateWeeklyPay();
        assertEquals(1560.38,otPay,"Weekly pay with overtime ");
    }

}
