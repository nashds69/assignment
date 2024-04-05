package Q1;
import static org.junit.Assert.*;

import org.junit.Test;

public class AddTwoIntegersTest {

	  @Test
	    public void testAddPositiveNumbers() {
	        assertEquals(10, AddTwoIntegers.add(6, 4));
	    }

	    @Test
	    public void testAddNegativeNumbers() {
	        assertEquals(-2, AddTwoIntegers.add(-4, 2));
	    }
}