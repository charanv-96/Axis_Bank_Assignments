package com.manipal.dp.behavioural.command;

public class SoldStock implements Order{
	
	Stock stock;
	
	public SoldStock(Stock someStock)
	{
		this.stock = someStock;
	}
	
	@Override
	public void execute()
	{
		stock.sell();
	}

}
