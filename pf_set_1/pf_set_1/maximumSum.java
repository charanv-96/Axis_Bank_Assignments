package pf_set_1;

import java.util.Scanner;

public class maximumSum {
	
	static int maximumoe(int []array) {
		
		int sumo=0,sume=0;
		
		for(int num : array) {
			if(num%2==0) {
				sume+=num;
			}
			else {
				sumo+=num;
			}
			
			
		}
		if (sumo>sume) {
			return sumo;
		}
		else {
			return sume;
		}
		
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
		int result = maximumoe(arr);
		System.out.println(result);
		

	}

}
