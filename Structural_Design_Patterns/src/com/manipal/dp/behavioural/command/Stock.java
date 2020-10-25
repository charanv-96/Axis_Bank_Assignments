package com.manipal.dp.behavioural.command;

public class Stock{
	
	private String itemName;
	private int quantity;
	
	public Stock()
	{
		this.itemName = "Mobile";
		this.quantity = 5;
	}

	public void buy() {
		System.out.println("Bought Stock " + itemName + " quantity " + quantity);
	}
	
	public void sell() {
		System.out.println("Sold Stock " + itemName + " quantity " + quantity);
	}
	

}
