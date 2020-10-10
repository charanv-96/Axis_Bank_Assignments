package assignment_1;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double[] numbers = new Double[Integer.parseInt(args[0])];

		double sum = 0;
		int j = 0;
		for (int i = 1; i <= Integer.parseInt(args[0]); i++) {

			numbers[j] = Double.parseDouble(args[i]);
			j++;
		}
		for (int i = 0; i < numbers.length; i++) {

			sum += numbers[i];

		}
		System.out.println(sum);
	}

}
