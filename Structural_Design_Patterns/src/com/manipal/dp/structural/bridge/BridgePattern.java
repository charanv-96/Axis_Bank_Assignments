package com.manipal.dp.structural.bridge;

public class BridgePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1 = new RetailCustomer(new Select(), new Paid());
		c1.purchase();
		
		System.out.println();
		
		Customer c2 = new GeneralConsumer(new Select(), new Paid());
		c2.purchase();

	}

}
