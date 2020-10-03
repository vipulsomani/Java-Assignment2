import java.util.NoSuchElementException;
import java.util.Scanner;

public class practice {
	public static void main(String[] args) {

		int result = divide();
		System.out.println(result);
	}
	private static int divide() {
		Scanner sc = new Scanner(System.in);
		int x,y;
		try {
			x= sc.nextInt();
			y= sc.nextInt();
			System.out.println("x divide by y  = ");
			return x/y;
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			return divide();
			//throw new ArithmeticException("Not suitable input x / y= ");
			
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			throw new ArithmeticException("Divide by zero");
		}
	}
}
