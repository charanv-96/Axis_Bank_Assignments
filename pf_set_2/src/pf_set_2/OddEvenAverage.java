package pf_set_2;

import java.util.Scanner;

public class OddEvenAverage {
	
	static float OddEvenSum(int []array, int size) {
		
		int sumo=0, sume=0;
		
		for(int n: array) {
			if (n%2==0) {
				sume+=n;
			}
			else {
				sumo+=n;
			}

		}
		
		float avg=(sumo+sume);
		
		avg=avg/2;
		
		return avg;
		
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		
		int num=sc1.nextInt();
		
		if (num<0) {
			System.out.println("Invalid input");
			System.exit(0);
		}
	
		int []arr = new int[num];
		
		
		for (int i=0; i<num; i++) {
			Scanner sc = new Scanner(System.in);
			int x=sc.nextInt();
			if (x<0) {
				System.out.println("Invalid input");
				System.exit(0);
			}
			else {
				arr[i]=x;
			}
			
			
			
		}
		
		float result = OddEvenSum(arr, num);
		
		System.out.println(result);

		
	}

}
