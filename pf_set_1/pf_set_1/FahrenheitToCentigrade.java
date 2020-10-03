package pf_set_1;

import java.util.Scanner;

public class FahrenheitToCentigrade {
	
	static float convertToCentigrade(int tempf) {
		
		float tempc=(tempf-32)*5/9;
		
		return tempc;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the fahrenheit temperature");
		
		int tempf=sc1.nextInt();
		
		if (tempf<0) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		
		float result = convertToCentigrade(tempf);
		
		System.out.println(String.format("%.2f", result));
	
		
	}

}
