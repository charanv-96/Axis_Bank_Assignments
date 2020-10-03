import java.util.Scanner;

public class Calc_Electric_Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float bill_total=0;
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the previous reading");
		
		int prev=sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter the current reading");
		
		int curr=sc2.nextInt();
		
		int units=curr-prev;
		
		if (units>100) {
			bill_total+=(units-100)*4.6;
			
			bill_total+=70*3.5;
			
			bill_total+=30*2.3;
		}
		else if(units>30) {
			bill_total+=(units-30)*3.5;
			
			bill_total+=30*2.3;
		}
		else {
			bill_total+=units*2.3;
		}
		
		System.out.println("The bill amount is " + String.format("%.2f", bill_total));
		
		
	}

}
