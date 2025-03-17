package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryEmployeeTest {
    SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
    @Test
    public void calculateWeekleyPayTest(){
        double sal=emp.getSalary();
        assertEquals(64325,emp.getSalary(),"s "+sal);
        double salPay= emp.calculateWeeklyPay();
        assertEquals(1237.02,salPay,"week pay "+salPay);
    }
    @Test
    public void holidayPayBonusTest(){
        double sal=emp.getSalary();
        assertEquals(64325,emp.getSalary(),"s "+sal);
        double holidayPay= emp.holidayBonus();
        assertEquals(2164.54,emp.holidayBonus(),"holiday pay "+holidayPay);
    }

}