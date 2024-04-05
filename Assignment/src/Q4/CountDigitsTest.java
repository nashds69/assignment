package Q4;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountDigitsTest {

	 @Test
	    public void testCountDigitsPositive() {
	        assertEquals(6, CountDigits.countDigits(123456));
	    }

	    @Test
	    public void testCountDigitsZero() {
	        assertEquals(1, CountDigits.countDigits(0));
	    }

}