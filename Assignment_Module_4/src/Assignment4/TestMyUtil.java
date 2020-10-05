package Assignment4;

public class TestMyUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyUtil m = new MyUtil();

		System.out.println(m.throwDice());

		int[] arr1 = { 1, 2, 3 };

		int[] arr2 = { 1, 2, 3, 4, 5 };

		System.out.println(m.findAverage(arr1));

		System.out.println(m.findAverage(arr2));

		double a = 25.00, b = 34.00, c = 13.45;

		System.out.println(Math.max(a, b));

		System.out.println(Math.min(a, b));

		System.out.println(Math.ceil(c));

		System.out.println(Math.floor(c));

		System.out.println(Math.round(c));

	}

}
