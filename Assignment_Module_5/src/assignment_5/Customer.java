package assignment_5;

public class Customer {
	
	private String customerName;
	private Address residentialAddress;
	
	Customer(String customerName, Address Address) {
		
		this.customerName = customerName;
		this.residentialAddress = Address;
		
	}
	
	public String getCustomerDetails() {
		
		return ("Customer : " + customerName +"\n" + "Residential Address : " + residentialAddress.getAddressDetails());
		
	}
	
}
