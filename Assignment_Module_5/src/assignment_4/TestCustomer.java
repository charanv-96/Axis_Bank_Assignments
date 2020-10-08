package assignment_4;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address add1 = new Address("khb", "bangalore");
		Address add2 = new Address("bas", "bangalore");

		Customer customer = new Customer("Charan", add1, add2);

		System.out.println(customer.getCustomerDetails());

	}

}
