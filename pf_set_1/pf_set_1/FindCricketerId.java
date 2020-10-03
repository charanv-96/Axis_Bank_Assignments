package pf_set_1;

import java.util.Scanner;

public class FindCricketerId {
	
	static int Cricketer[] = new int[10];
	
	static int[] findCricketerId(int []array, int size, int score) {
		int c=0;
		for (int i=0; i<size; i++) {
			
			if (array[i]>score) {

				Cricketer[c] = array[i-1];
				c++;

			}
		}
		return Cricketer;
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
		
		System.out.println("Enter the score");
		
		int score=sc2.nextInt();
		
		int []result=findCricketerId(arr,num,score);
		
		for(int n: result) {
			if (n!=0) {
				System.out.println(n);
			}
			else {
				System.exit(0);
			}
			
		}

	}

}
