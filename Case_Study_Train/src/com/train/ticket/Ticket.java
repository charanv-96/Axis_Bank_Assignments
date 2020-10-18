package com.train.ticket;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TreeMap;

public class Ticket {

	static int counter = 100;
	private String pnr;
	private Date travelDate;
	private Train train;
	private TreeMap<Passenger, Integer> passengers;

	public Ticket(Date travelDate, Train train) {
		this.travelDate = travelDate;
		this.train = train;
	}

	private String generatePNR() {
		
		pnr = "";
		
		pnr += String.valueOf(train.getSource().substring(0, 1))
				+ String.valueOf(train.getDestination().substring(0, 1)) + "_";
		
		Calendar c = Calendar.getInstance();
		
		c.setTime(travelDate);
		
		int year = c.get(Calendar.YEAR);
		int month = 1 + c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		pnr += String.valueOf(year) + String.valueOf(month) + String.valueOf(day) + "_" + String.valueOf(counter);
		
		counter++;
		
		return pnr;
		
	}

	private double calcPassengerFare(Passenger p) {
		
		double fare = train.getTicketPrice();
		
		if (p.getAge() <= 12)
		{
			fare = (train.getTicketPrice() * 0.5);
		}
		else if (p.getAge() >= 60)
		{
			fare = (train.getTicketPrice() * 0.6);
		}
		else if (p.getGender() == 'F')
		{
			fare = (train.getTicketPrice() * 0.25);
		}
			
		
		return fare;
		
	}

	public void addPassenger(String name, int age, char gender) {
		
		Passenger p = new Passenger(name, age, gender);
		
		int fare = (int) calcPassengerFare(p);
		
		passengers.put(p, fare);
		
	}

	private double calculateTotalTicketPrice() {
		
		double totalPrice = 0;
		
		for(Integer price : passengers.values())
		{
			totalPrice += price;
		}
			
		return totalPrice;

	}

	private StringBuilder generateTicket() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String str = "PNR            : " + pnr +
				     "\nTrain no       : " + String.valueOf(train.getSource()) + 
				     "\nTrain Name     : " + train.getTrainName() +
				     "\nFrom           : " + train.getSource() +
				     "\nTo             : " + train.getDestination() +
				     "\nTravel Date    : " + sdf.format(travelDate) +
				     "\n\nPassengers :" +
				     "\nName            Age     Gender     Fare\n";

		for(Passenger p : passengers.keySet()) {
			
			str += p.getName() + "        " + 
		          String.valueOf(p.getAge()) + "     " + 
				  String.valueOf(p.getGender()) + "     " +
		          String.valueOf(calcPassengerFare(p)) + "\n";
			
		}
		
		str += "Total Price : " + String.valueOf(calculateTotalTicketPrice());
		
		StringBuilder ticketDetails = new StringBuilder(str);
		
		return ticketDetails;

	}

	public void writeTicket() {
		
		File file = new File(generatePNR());
		
		try {
			
			file.createNewFile();
			FileWriter fw = new FileWriter(file);

			fw.close();
			System.out.println("Ticket Booked with PNR : " + pnr);
			
		} 
		catch (IOException e) {
			
			e.getMessage();
			
		}

	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Ticket.counter = counter;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public TreeMap<Passenger, Integer> getPassengers() {
		return passengers;
	}

	public void setPassengers(TreeMap<Passenger, Integer> passengers) {
		this.passengers = passengers;
	}

}
