package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommissionEmployeeTest {
    CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);
   @Test
   public void IncreaseSales_PlusMinusTest(){
       emp.increaseSales(1000);
       assertEquals(1000,emp.getSales(),"sales 1k");
       emp.increaseSales(-500);
       assertEquals(1000,emp.getSales(),"sales -500");
   }
   @Test
    public void holidayBonusTest(){
       assertEquals(0,emp.holidayBonus(),"no holiday bonus");
   }
   @Test
    public void commisionAnnualRaiseTest(){
       emp.annualRaise();
       emp.annualRaise();
       assertEquals(.0305,emp.getRate(),"rate = .0305");
   }
}