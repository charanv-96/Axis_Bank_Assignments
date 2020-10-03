import java.util.Scanner;

public class Class_Rooms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter class 1 capacity");
		
		int c1=sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter class 2 capacity");
		
		int c2=sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("Enter class 3 capacity");
		
		int c3=sc3.nextInt();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of students");
		
		int arr[]= {c1,c2,c3};
		
		int n=sc.nextInt();
		
		int count=0;
		
		for (int i : arr) {
			
			if (n<=i) {
				count+=1;
			}
		}
		
		if (count>0) {
			System.out.println(count + " labs can accommodate "+ n + " students");
		}
		else {
			System.out.println("None of the labs can accommodate " + n + " students");
		}
		

	}

}
