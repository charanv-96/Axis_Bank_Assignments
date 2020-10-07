package assignment1;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			if (args.length == 0) {
				System.out.println("No input received");
			}

			float number = Integer.parseInt(args[0]) / Integer.parseInt(args[1]);

			System.out.println(number);

		} catch (NumberFormatException nfe) {
			System.out.println("Only integers are allowed");
		} catch (ArithmeticException ae) {
			System.out.println("Division with zero is not possible");
		}

	}

}
