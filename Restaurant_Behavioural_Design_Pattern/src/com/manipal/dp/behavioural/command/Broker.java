package com.manipal.dp.behavioural.command;

import java.util.ArrayList;

public class Broker {
	
	ArrayList<Order> orders = new ArrayList<Order>();
	
	public void takeOrder(Order order)
	{
		orders.add(order);
	}
	
	public void placeOrders() {
		// TODO Auto-generated method stub
		
		for(Order order : orders)
		{
			order.execute();
		}
		
		orders.clear();
		
	}

}
