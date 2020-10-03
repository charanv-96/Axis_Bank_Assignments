import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class PT_Drill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the number of participants");
		
		int num=sc1.nextInt();
		
		String []names = new String[num];
		


    
		for (int i=0; i<num; i++) {
			Scanner sc = new Scanner(System.in);
			names[i]=sc.next();
			
		}
		

		
		Arrays.sort(names);
		
		double l=Math.sqrt(num);
		
		int len = (int) l;
		
		String names_final[][] = new String[len][len];
		
		int c=0;
		
		for (int j=0; j<len; j++) {
			for (int k=0; k<len; k++) {
				names_final[j][k]=names[c];
				c+=1;
				
			}
			
		}

		System.out.println("Middle Row");
		for (int i=0; i<len; i++) {
			System.out.print(names_final[(len/2)][i] + " ");
		}
		System.out.println();
		System.out.println("Middle Column");
		for (int i=0; i<len; i++) {
			System.out.print(names_final[i][(len/2)] + " ");
		}
/*		
		for (int h=0; h<len; h++) {
			for (int k=0; k<len; k++) {
				System.out.println(names_final[h][k]);
				
			}
		
	*/		
		}
		
		
		}
		
	

