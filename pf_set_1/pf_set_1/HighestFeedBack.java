package pf_set_1;

import java.util.Scanner;

public class HighestFeedBack {

	static int feedback[] = new int[100];
	
	static void highestFeedBack(int []metlife, int []hardfort, int size) {
		
		int c=0;
		
		for (int i=0; i<size-1; i++) {
			int temp=0;
			for (int j=0; j<size-1; j++) {
				if (metlife[i]==hardfort[j]) {
					if (metlife[i+1]>hardfort[j+1]) {
						temp=metlife[i+1];
						break;
					}
					else {
						temp=hardfort[j+1];
						break;
					}
						
				}
				
			}
			if (temp==0) {
				feedback[c]=metlife[i];
				c++;
				feedback[c]=metlife[i+1];
				c++;
			}
			else {
				feedback[c]=metlife[i];
				c++;
				feedback[c]=temp;
				c++;
			}
			i++;
		}
		
		for (int i=0; i<size-1; i++) {
			int flag=0;
			for (int j=0; j<size-1; j++) {
				
				if (hardfort[i]==metlife[j]) {
					flag=1;
					break;
				}
				else {
					continue;
				}
				
			}
			if (flag==0) {
				feedback[c]=hardfort[i];
				c++;
				feedback[c]=hardfort[i+1];
				c++;
			}
			i++;
			}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter the number of elements");
		
		int num=sc1.nextInt();
		
		if (num<0) {
			System.out.println("Invalid input");
			System.exit(0);
		}
	
		int []metlife = new int[num];
		int []hardfort = new int[num];
		System.out.println("metlife details");
		for (int i=0; i<num; i++) {
			Scanner sc = new Scanner(System.in);
			int x=sc.nextInt();
			if (x<0) {
				System.out.println("Invalid input");
				System.exit(0);
			}
			else {
				metlife[i]=x;
			}

			
		}
		System.out.println("hardfort details");
		for (int i=0; i<num; i++) {
			Scanner sc = new Scanner(System.in);
			int y=sc.nextInt();
			if (y<0) {
				System.out.println("Invalid input");
				System.exit(0);
			}
			else {
				hardfort[i]=y;
			}

			
		}
		
		highestFeedBack(metlife,hardfort,num);
		
		for(int n: feedback) {
			if (n!=0) {
				System.out.println(n);
			}
			
		}
		
		

	}

}
