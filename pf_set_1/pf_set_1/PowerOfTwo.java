package pf_set_1;

import java.util.Scanner;

public class PowerOfTwo {
	
	static int powerOf2(int number) {
		
		if (number%2==0) {
			return 0;
		}
		else {
			return 1;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result=0;
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num=sc1.nextInt();
		
		if (num<0) {
			System.out.println("too small");
			System.exit(0);
		}
		else if(num>32767) {
			System.out.println("too large");
			System.exit(0);
		}
		else {
			result = powerOf2(num);
		}
		
		if (result==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
