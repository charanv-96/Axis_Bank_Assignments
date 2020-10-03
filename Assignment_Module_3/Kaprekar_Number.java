import java.util.Scanner;

public class Kaprekar_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num=sc1.nextInt();
		
		int sq_num=num*num;
		
		int n=sq_num;
		int sum;
		int c=0;
		while(n>0) {
			n=n/10;
			c+=1;
		}
		
		String number = Integer.toString(sq_num);

		int fh = Integer.parseInt(number.substring(0,c/2));
		int sh = Integer.parseInt(number.substring(c/2));
		
		sum=sh+fh;
		
		if (sum==num) {
			System.out.println("Kaprekar Number");
		}
		else {
			System.out.println("Not A Kaprekar Number");
		}
		
	}

}
