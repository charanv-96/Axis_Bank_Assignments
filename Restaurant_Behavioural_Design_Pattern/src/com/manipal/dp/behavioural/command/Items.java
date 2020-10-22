package com.manipal.dp.behavioural.command;

public class Items{
	
	private String itemName;
	private int quantity;
	
	public Items()
	{
		this.itemName = "Mobile";
		this.quantity = 5;
	}

	public void placeOrder(String dishName) {
		System.out.println("Order placed : Dish : " + dishName);
	}
	
	public void payBill(Double Amount) {
		System.out.println("Bill paid : Amount : " + Amount);
	}
	

}
