package basicException;

class FactorialException extends Exception {
	public FactorialException(String s) {
		System.out.println(s);
	}
}

class InvalidInputException extends Exception {
	public InvalidInputException(String s) {
		System.out.println(s);
	}
}

public class Factorial {

	public static int factorial(int num) throws InvalidInputException, FactorialException {
		int fact = 1;
		if (num <= 1) {
			throw new InvalidInputException("Enter Number greater than 1");
		}
		for (int i = num; i > 0; i--) {
			if (fact > 2147483647) {
				throw new FactorialException("Range exceed !!!!");
			}
			fact = fact * i;
		}
		return fact;
	}
}