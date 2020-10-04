package pf_set_2;

import java.util.Scanner;

public class DecimalConversion {
	
	static int convertToDecimal(int binary_number) {

		int dec_num=0;
		int n = binary_number;
		int digit=0;
		int mul=1;
		if (binary_number>11111) {
			System.out.println("Invalid number");
			System.exit(0);
		}
		else {
			while(n>0) {
				
				digit=n%10;
				n=n/10;
				if (digit==0 || digit==1) {
					dec_num+=digit*mul;
				}
				else {
					System.out.println("Invalid number");
					System.exit(0);
				}
				mul*=2;
			}
		}
		
		return dec_num;
			

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		
		int bin_num=sc1.nextInt();
		
		int result = convertToDecimal(bin_num);
		
		System.out.println(result);
		
		

	}

}
