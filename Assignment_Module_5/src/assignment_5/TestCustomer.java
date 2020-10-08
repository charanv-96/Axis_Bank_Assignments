package assignment_5;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address add = new Address("khb", "bangalore");
		
		Customer customer = new Customer("Charan", add);
		
		
		
		System.out.println(customer.getCustomerDetails());

	}

}
