package Assignment4;

public class MyUtil {

	static int throwDice() {
		int num = (1 + (int)(Math.random() * 5));

		return num;

	}
	
	static float findAverage(int []array) {
		
		float avg;
		int sum = 0;
		
		for (int i : array) {
			sum += i;
		}
		
		avg = sum/array.length;
		
		return avg;
		
	}

}
