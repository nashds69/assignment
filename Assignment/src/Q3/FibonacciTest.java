package Q3;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
    public void testGenerateFibonacci() {
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        assertArrayEquals(expected, Fibonacci.generateFibonacci(12));
    }

    @Test
    public void testGenerateFibonacciWithNegativeTerms() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.generateFibonacci(-5));
        }
}