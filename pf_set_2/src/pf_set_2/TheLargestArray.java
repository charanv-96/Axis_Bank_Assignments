package pf_set_2;

import java.util.Scanner;

public class TheLargestArray {
	
	static int []output1 = new int[20];
	
	static void largestArray(int []array1, int []array2, int size) {
		
		
		int c=0;
		for(int i=0; i<size; i++) {
			
			if (array1[i]>array2[i]) {
				output1[c]=array1[i];
				c++;
			}
			else if (array1[i]<array2[i]) {
				output1[c]=array2[i];
				c++;
			}
			else {
				output1[c]=array2[i];
				c++;
			}
		
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
	
		int []arr1 = new int[num];
		
		System.out.println("First array");
		for (int i=0; i<num; i++) {
			Scanner sc = new Scanner(System.in);
			int x=sc.nextInt();
			if (x<0) {
				System.out.println("Invalid input");
				System.exit(0);
			}
			else {
				arr1[i]=x;
			}


	}
		int []arr2 = new int[num];
		
		System.out.println("Second array");
		for (int i=0; i<num; i++) {
			Scanner sc = new Scanner(System.in);
			int x=sc.nextInt();
			if (x<0) {
				System.out.println("Invalid input");
				System.exit(0);
			}
			else {
				arr2[i]=x;
			}


	}
		
		largestArray(arr1,arr2,num);
		
		for (int i: output1) {
			if(i!=0) {
				System.out.println(i);
			}
		}
		
	}
}
