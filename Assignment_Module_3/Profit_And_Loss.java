import java.util.Scanner;

public class Profit_And_Loss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the number of dozens of eggs purchased");
		
		int X=sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter the prize per dozen");
		
		int Y=sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("Enter the selling prize of 1 egg");
		
		int Z=sc3.nextInt();
		
		int cp, sp;
		
		cp=X*Y;
		
		sp=Z*X*12;
		
		float profit =sp-cp;
		
		float perc=(profit*100)/cp;
				
		System.out.println("Percentage profit is " + String.format("%.2f", perc));		

	}

}
