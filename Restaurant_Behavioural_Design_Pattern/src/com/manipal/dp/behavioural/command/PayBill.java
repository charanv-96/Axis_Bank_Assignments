package com.manipal.dp.behavioural.command;

public class PayBill implements Order{
	
	Items item;
	private Double Amount;
	
	public PayBill(Items someItem, Double Amount)
	{
		this.item = someItem;
		this.Amount = Amount;
	}
	
	@Override
	public void execute()
	{
		item.payBill(this.Amount);
	}

}
