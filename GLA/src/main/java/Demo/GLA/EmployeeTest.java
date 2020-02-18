package Demo.GLA;

import org.junit.Test;

import junit.framework.Assert;

public class EmployeeTest {
	@Test
	public void checkmonthsalary() {
		Employee ee=new Employee();
		BussEmp be=new BussEmp();
		ee.setId(101);
		ee.setName("GLA");
		ee.setSalary(20000);
		int monsal1=be.monthsalary(ee);
		Assert.assertEquals(20000,monsal1);
	}
	public static void main(String args[]) {
		EmployeeTest tt=new EmployeeTest();
		tt.checkmonthsalary();
	}

}
