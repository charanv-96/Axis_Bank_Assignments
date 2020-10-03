import java.util.Scanner;

public class Special_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num=sc1.nextInt();
		
		int a=2,b=1,c=3,n=0,temp1,temp2;
		
		System.out.print(a + " ");
		
		System.out.print(b + " ");
		
		System.out.print(c + " ");
		
		
		while (true) {
			
			n=a+b+c;
			
			if (n>=num) {
				break;
			}
			else {
				System.out.print(n + " ");
			}

			
			temp1=c;
			c=n;
			temp2=b;
			b=temp1;
			a=temp2;
					
			
		}
		

	}

}
