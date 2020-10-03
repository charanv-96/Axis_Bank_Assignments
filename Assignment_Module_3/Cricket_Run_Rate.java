import java.util.Scanner;

public class Cricket_Run_Rate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float rrr;
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter number of overs bowled so far");
		
		int overs=sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter the current run rate");
		
		float crr=sc2.nextFloat();
		
		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("Enter the target");
		
		int target=sc3.nextInt();

		rrr = (target-(overs*crr))/(50-overs);
	
		System.out.println("The required run rate is : " + String.format("%.2f", rrr));

	}

}
