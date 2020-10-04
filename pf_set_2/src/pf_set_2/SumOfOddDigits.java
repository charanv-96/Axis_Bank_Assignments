package pf_set_2;

import java.util.Scanner;

public class SumOfOddDigits {
	
	static int sumOddDigits(int number) {
		
		int res; 
		
		if (number>32767) {
			res=-1;
		}
		else if (number<0) {
			res=-1;
		}
		else {
			int sum=0;
			while(number>0) {
				
				int digit = number%10;
				
				if (digit%2!=0) {
					sum+=digit;
				}
				
				number=number/10;
				
			}
			res=sum;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num=sc1.nextInt();
		
		int result = sumOddDigits(num);
		
		if (result==-1) {
			System.out.println("invalid input");
		}
		else {
			
			System.out.println(result);
		}

	}

}
