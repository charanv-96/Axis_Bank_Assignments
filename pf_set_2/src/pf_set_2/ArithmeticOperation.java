package pf_set_2;

import java.util.Scanner;

public class ArithmeticOperation {
	
	static int performArithmeticOperation(int num1, int num2, int operation) {
		
		int res=0;
		
		switch (operation) {
		
		case 1:
		{
			res = num1+num2;
			break;
		}
		case 2:
		{
			res = num1-num2;
			break;
		}
		case 3:
		{
			res = num1*num2;
			break;
		}
		case 4:
		{
			res = num1/num2;
			break;
		}
		default:
		{
			res = -1;
		}
		}
		
		return res;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the number 1");
		
		int num1=sc1.nextInt();
		
		if (num1<0) {
			System.out.println("invalid number");
			System.exit(0);
		}
		else if (num1>32767) {
			System.out.println("invalid number");
			System.exit(0);
		}
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter the number 2");
		
		int num2=sc2.nextInt();
		
		if (num2<0) {
			System.out.println("invalid number");
			System.exit(0);
		}
		else if (num2>32767) {
			System.out.println("invalid number");
			System.exit(0);
		}
		
		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("Enter the operation to be performed");
		
		int num3=sc3.nextInt();
		
		int result = performArithmeticOperation(num1, num2, num3);
		
		System.out.println(result);
		
	}

}
