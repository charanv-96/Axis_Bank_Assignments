import java.util.Scanner;

public class Find_Participant_Id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the number of participants");
		
		int num=sc1.nextInt();
		
		int []arr = new int[num];
		
	    Scanner in = new Scanner(System.in);  
		
		for (int i=0; i<num; i++) {
			Scanner sc = new Scanner(System.in);
			arr[i]=sc.nextInt();
			
		}

		while(true) {
			
			Scanner sc3 = new Scanner(System.in);
			
			System.out.println("Enter the Search Id");
			
			int search_id = sc3.nextInt();
			
			if (search_id==0) {
				System.out.println("Program Terminated");
				break;
			}
			else 
			{	
				boolean flag=false;
				for(int id : arr) {
					if (search_id==id) {
						flag=true;
						break;
					}
					else {
						continue;
					}
				}
				if (flag==true) {
					
					System.out.println("Participant with id " + search_id + " exists");
					
				}
				else {
					System.out.println("Participant with id " + search_id + " does not exist");
				}
			}
			
			
		}

	}

}
