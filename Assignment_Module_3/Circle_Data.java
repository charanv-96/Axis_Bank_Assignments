import java.util.Scanner;

public class Circle_Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the radius");
		
		float r=sc1.nextFloat();
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter the output code");
		
		String output_code = sc2.next();
		
		switch (output_code){
		
		case "DIA":
			System.out.println("Diameter of circle is " + 2*r);
			break;
			
		case "AR":
			System.out.println("Area of circle is " + 3.14*r*r);
			break;
			
		case "PER":
			System.out.println("Perimeter of circle is " + 2*3.14*r);
			break;
			
		case "ARSEM":
			System.out.println("Area of semi circle is " + 3.14*r);
			break;
			
		default:
			System.out.println("Enter valid output code");
			break;
		}
		}

	}


