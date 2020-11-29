package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}

	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5,3), 2);
	}

	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(2, 5),10);
	}

	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(10,2), 5);
	}

	@Test
	public void testDivideByZero() {
		SimpleCalculator calc = new SimpleCalculator();
		int a = 5;
		int b = 0;
		try {
			calc.divide(a, b);
			fail("Expected IllegalArgumentException from division by zero");
		} catch (IllegalArgumentException e) {
			//test passed because divide handled division by zero with IllegalArgumentException
		} catch (Exception e) {
			fail("Expected IllegalArgumentException from division by zero");
		}
	}
}
