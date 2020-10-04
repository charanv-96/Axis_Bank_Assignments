package pf_set_2;

import java.util.Scanner;

public class MultiplesAverage {
	
	static float findAverageBy5s(int number) {
		
		float sum=0;
		int c=0;
		for (int i=1;i<=number;i++) {
			if (i%5==0) {
				sum+=i;
				c++;
			}
		}
		
		float avg;
		
		avg = sum/c;
		
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		
		int num=sc1.nextInt();
		
		if (num>32767) {
			System.out.println("Invalid number");
			System.exit(0);
		}
		else if (num<0) {
			System.out.println("Invalid number");
			System.exit(0);
		}
		else {
			float avg = findAverageBy5s(num);
			
			System.out.println(avg);
		}

	}

}
