
public class CommandLineArgumentsAsssignment {
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int sum = a+b+c;
		System.out.println("Summation from command line input is" + sum );
		}
}
