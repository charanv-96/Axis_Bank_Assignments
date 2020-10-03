import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the number of students");
		
		int num=sc1.nextInt();
		
		int []marks = new int[num];
		
	    Scanner in = new Scanner(System.in);  
		
		for (int i=0; i<num; i++) {
			Scanner sc = new Scanner(System.in);
			marks[i]=sc.nextInt();
			
		}
		
		int sum=0;
		
		for (int mark: marks) {
			sum+=mark;

		}
	    int minValue = marks[0]; 
	    int maxValue = marks[0];
	    
	    for(int i=0;i<marks.length;i++){ 
	      if(marks[i] < minValue){ 
	        minValue = marks[i]; 
	      }
	      if(marks[i] > maxValue){ 
		        maxValue = marks[i]; 
		      }
		      
	    }
		System.out.println("min value is " + minValue);
		System.out.println("max value is " + maxValue);
		System.out.println("avg value is " + sum/num);

	}

}
