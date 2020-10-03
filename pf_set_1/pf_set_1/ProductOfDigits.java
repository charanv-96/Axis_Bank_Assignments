package pf_set_1;

import java.util.Scanner;

public class ProductOfDigits {
	
	static int productDigits(int num){
		int prod=1;
		int n=num;
		if (num<0) {
			return -1;
		}
		else if (num>32767) {
			return -1;
		}
		else {
			
			
			while(n>0) {
				prod=prod*(n%10);
				n=n/10;
			}
		}
		
		
		return prod;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num=sc1.nextInt();
		
		int result = productDigits(num);
		
		if (result==-1) {
			System.out.println("Invalid Input");
		}
		else {
			System.out.println(result);
		}
		



	}

}
