package com.manipal.dp.behavioural.command;

public class BoughtStock implements Order{
	
	Stock stock;
	

	public BoughtStock(Stock someStock) {
		// TODO Auto-generated constructor stub
		
		this.stock = someStock;
	}
	
	@Override
	public void execute()
	{
		stock.buy();
	}

}
