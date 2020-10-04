package pf_set_2;
import java.util.*;

public class CountOf3Multiples {
	
	static int divisibleBy3(int []array, int size) {
		
		int c=0;
		
		for(int n: array) {
			if (n%3==0) {
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

		
		int count = divisibleBy3(arr, num);
		
		System.out.println(count);


	}

}
