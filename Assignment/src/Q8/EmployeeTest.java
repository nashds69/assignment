package Q8;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	   @Test
	    public void testCalculateDA() {
	        Employee employee = new Employee("John Doe", "Software Engineer", 60000.0);
	        double da=employee.calculateDA();
	        assertEquals(6000.0,da,0.01);
	    }
}