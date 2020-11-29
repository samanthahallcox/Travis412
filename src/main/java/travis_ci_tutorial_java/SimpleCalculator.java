package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		long sum = (long)a + (long)b;
		if(sum > Integer.MAX_VALUE)
			throw new ArithmeticException("Integer overflow error");
		return a + b;
	}

	public int minus(int a, int b) { return a - b; }

	public int multiply(int a, int b) { return a * b; }

	public int divide(int a, int b) {
		if (b == 0) throw new IllegalArgumentException("Cannot divide by zero!");
		return a / b;
	}
}
