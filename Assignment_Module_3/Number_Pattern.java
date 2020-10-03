import java.util.Scanner;

public class Number_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num=sc1.nextInt();
		
		for (int i=1;i<=num;i++) {
			if (i%3!=0) {
				for (int j=1;j<=i;j++)
				{
				System.out.print(i);
				}
				System.out.println();
				
			}


		}

	}

}
