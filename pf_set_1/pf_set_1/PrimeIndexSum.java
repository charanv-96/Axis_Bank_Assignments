package pf_set_1;

import java.util.Scanner;

public class PrimeIndexSum {
	
	static int primeIndexSum(int []array, int size) {
		
		int sum=0;
		int c=0;
		for (int num =0; num<size; num++) {
			boolean flag=true;
			for (int i=2;i<=(num+1)/2; i++) {
				if((num+1)%i==0) {
					flag=false;
					break;
				}
				else {
					continue;
				}
			}
			if (flag==true) {
				sum+=array[num];
				c++;
			}
			else if(num+1==1) {
				sum+=array[num];
				c++;
			}
			else {
				continue;
			}
			
		}
		
		return sum/c;
		
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
		int prime_avg = primeIndexSum(arr, num);
		System.out.println(prime_avg);	

}
}
