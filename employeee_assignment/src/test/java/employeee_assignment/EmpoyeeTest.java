package employeee_assignment;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmpoyeeTest {
	Employee emp1 =new Employee(1, "Vipul", 15000);
	@Test
	public void testGetAnnualBasic() {
		assertEquals("Annual basic is",180000,emp1.getAnnualBasic());
	}
	@Test
	public void testGetMonthlyGross() {
		assertEquals("Monthly Gross Salary",24550, emp1.getMonthlyGrossSalary());
	}
	@Test
	public void testAnnualGrossSalary() {
		assertEquals("Annual Gross Salary",294600, emp1.getAnnualGrossSalary());
	}
	@Test
	public void testGetMonthlyDeduction() {
		assertEquals("Monthly Deductions",1600, emp1.getMonthlyDeductions(),0);
	}
	@Test
	public void testMonthlyTakeHome() {
		assertEquals("Monthly take home",22950, emp1.getMonthlyTakeHome(),0);
	}
	@Test
	public void testAnnualTakeHome() {
		assertEquals("Annual take home",275400, emp1.getAnnualTakeHome(),0);
	}


}
