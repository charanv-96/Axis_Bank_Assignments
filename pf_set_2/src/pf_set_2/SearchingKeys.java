package pf_set_2;

import java.util.Scanner;

public class SearchingKeys {
	
	static int []found = new int[10];
	
	static void searchKeys(int []array, int size, int value) {
		
		int c=0;
		for(int i=1;i<size;i++) {
			if (array[i]==value) {
				found[c]=array[i-1];
				c++;
			}
			i++;
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
		
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter the search key");
		
		int value=sc1.nextInt();
		
		searchKeys(arr, num, value);
		
		if (found[0]==0) {
			System.out.println("No keys found");
		}
		else {
			for(int i : found) {
				if (i!=0) {
					System.out.println(i);
				}

			}
		}

	}

}
