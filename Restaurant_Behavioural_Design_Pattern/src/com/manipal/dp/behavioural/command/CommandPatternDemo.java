package com.manipal.dp.behavioural.command;

public class CommandPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Items someItem = new Items();
		
		PlaceOrder placeOrder = new PlaceOrder(someItem, "Noodles");
		PayBill payBill = new PayBill(someItem , 250.00);
		
		Broker broker = new Broker();
		
		broker.takeOrder(placeOrder);
		broker.takeOrder(payBill);
		
		broker.placeOrders();

	}

}
