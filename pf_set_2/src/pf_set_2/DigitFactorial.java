package pf_set_2;

import java.util.Scanner;

public class DigitFactorial {
	
	static int factorial[] = new int[10];
	
	static void digitFactorial(int number) {
		
		int n=number;
		
		int c=0;
		
		while(n>0) {
			int fact = 1;
		
			int digit = n%10;
			
			while(digit>0) {
				
				fact*=digit;
				digit-=1;
				
			}
			
			n=n/10;
			factorial[c]=fact;
			c++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the number 1");
		
		int num1=sc1.nextInt();
		
		if (num1<0) {
			System.out.println("number too small");
			System.exit(0);
		}
		else if (num1>32767) {
			System.out.println("number too large");
			System.exit(0);
		}
		
		digitFactorial(num1);
		
		int len=factorial.length;
		
		for (int i =len-1; i>=0; i--) {
			if (factorial[i]!=0) {
				System.out.println(factorial[i]);	
			}

			
		}
		
	}

}
