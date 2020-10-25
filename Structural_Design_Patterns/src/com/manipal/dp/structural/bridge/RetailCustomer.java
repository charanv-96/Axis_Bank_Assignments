package com.manipal.dp.structural.bridge;

class RetailCustomer extends Customer{

	protected RetailCustomer(shop shop1, shop shop2) {
		super(shop1, shop2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		
		System.out.print("Retail Customer ");
		shop1.execute();
		shop2.execute();
		
	}

	
	
}
