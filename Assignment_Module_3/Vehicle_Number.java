import java.util.Scanner;

public class Vehicle_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter lower limit");
		
		int ll=sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter upper limit");
		
		int ul=sc2.nextInt();
		
		for (int i=ll; i<=ul; i++) {
			int n=i;
			int sum=0;
			while(n>0) {
				sum+=n%10;
				n=n/10;	
			}
			if (sum%9==0) {
				System.out.println(i);
			}
			else {
				continue;
			}
		}

	}

}
