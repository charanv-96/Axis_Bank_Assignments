package assignment2;

class InvalidInputException extends Exception {

}

public class Customer {

	private String custNo;
	private String custName;
	private String category;

	Customer(String custNo, String custName, String category) {

		try {

			System.out.println(custNo.substring(0, 1));

			if (custNo.substring(0, 1).equals("C") || custNo.substring(0, 1).equals("c")) {

				System.out.println(".");

				if (custName.length() >= 4) {

					System.out.println(".");

					if (category.equals("Platinum") || category.equals("Gold") || category.equals("Silver")) {

						System.out.println(".");
						this.category = category;
						this.custName = custName;
						this.custNo = custNo;

					} else {
						throw new InvalidInputException();
					}

				} else {
					throw new InvalidInputException();
				}

			} else {
				throw new InvalidInputException();
			}
		} catch (InvalidInputException iie) {
			System.out.println("Enter valid input");
		}

	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void getDetails() {
		System.out.println("Customer no : " + this.custNo);
		System.out.println("Customer name : " + this.custName);
		System.out.println("Category : " + this.category);
	}
}
