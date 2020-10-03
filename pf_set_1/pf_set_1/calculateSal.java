package pf_set_1;

import java.util.Scanner;


public class calculateSal {
	
	static double calculate(int sal, int shift) {
		
		double sal_from_shift = (shift*0.02*sal);
		
		double food = 0.2*sal;
		double travel = 0.3*sal;
		
		return (sal+sal_from_shift-food-travel);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter salary");
		
		int salary = sc1.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("Enter shifts");
		
		int shifts = sc3.nextInt();
		
		if (salary<0) {
			System.out.println("Salary too small");
		}
		else if (shifts<0) {
			System.out.println("shifts too small");
		}
		else if (salary>8000) {
			System.out.println("Salary too large");
		}
		else {
			
			int result = (int)calculate(salary, shifts);
			System.out.println(result);
			
		}

	}

}
