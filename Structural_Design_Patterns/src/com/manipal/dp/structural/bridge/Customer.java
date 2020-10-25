package com.manipal.dp.structural.bridge;

abstract class Customer {
	
	protected shop shop1;
	protected shop shop2;
	
	protected Customer(shop shop1, shop shop2)
	{
		
		this.shop1 = shop1;
		this.shop2 = shop2;
		
	}
	
	abstract public void purchase();

}


