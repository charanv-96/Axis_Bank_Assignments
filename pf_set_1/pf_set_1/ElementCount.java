package pf_set_1;

import java.util.Scanner;

public class ElementCount {
	
	static int findElementCount(int []array, int size, int element) {
		
		int c=0;
		
		for(int n: array) {
			if (n==element) {
				c++;
			}
		}
		
		return c;
		
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
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter the search element");
		
		int element=sc2.nextInt();
		
		int count = findElementCount(arr, num, element);
		
		System.out.println(count);

	}

}
