package com.manipal.dp.structural.bridge;

class GeneralConsumer extends Customer{

	protected GeneralConsumer(shop shop1, shop shop2) {
		super(shop1, shop2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		
		System.out.print("General Consumer ");
		shop1.execute();
		shop2.execute();
		
	}
	


}
