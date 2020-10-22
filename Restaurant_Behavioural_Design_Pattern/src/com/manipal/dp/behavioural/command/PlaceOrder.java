package com.manipal.dp.behavioural.command;

public class PlaceOrder implements Order{
	
	Items item;
	private String dishName;
	

	public PlaceOrder(Items someItem, String dishName) {
		// TODO Auto-generated constructor stub
		
		this.item = someItem;
		this.dishName = dishName;
	}
	
	@Override
	public void execute()
	{
		item.placeOrder(dishName);
	}

}
