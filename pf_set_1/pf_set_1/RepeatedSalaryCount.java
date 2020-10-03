package pf_set_1;

import java.util.Scanner;

public class RepeatedSalaryCount {
	
	static int countRepeaters(int []array, int size) {
		
		int c = 0;
		for (int i=0;i<size;i++) {
			for (int j=0;j<size;j++) {
				if (i!=j) {
					if (array[i]==array[j]) {
						c+=1;
					}
					else {
						continue;
						}
					
					}
				else {
					continue;
				}
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
		
		int result = countRepeaters(arr,arr.length);
		
		System.out.println(result);

	}

}
