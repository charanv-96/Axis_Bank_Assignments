package com.train.test;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.train.ticket.Ticket;
import com.train.ticket.Train;
import com.train.ticket.TrainDAO;

public class TicketApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		System.out.println("Enter the Train Number");

		Scanner sc = new Scanner(System.in);
		int trainNo = sc.nextInt();

		TrainDAO tdao = new TrainDAO();

		Train t = tdao.findTrain(trainNo);

		if (t.equals(null)) {

			System.out.println("Train not found");

		} else {

			System.out.println("Enter Travel Date");

			String tDate = sc.next();

			Date date = null;

			try {

				date = new SimpleDateFormat("dd/MM/yyyy").parse(tDate);

				Calendar c = Calendar.getInstance();

				c.setTime(date);

				int year = c.get(Calendar.YEAR);
				int month = 1 + c.get(Calendar.MONTH);
				int day = c.get(Calendar.DAY_OF_MONTH);

				LocalDate currentDate = LocalDate.now();

				LocalDate travelDate = LocalDate.of(year, month, day);

				Period period = currentDate.until(travelDate);

				int days = period.getDays();

				if (days <= 0) {

					System.out.println("Travel Date is before current date");
					return;

				}

			} catch (ParseException e) {

				e.getMessage();

			}

			System.out.println("Enter Number of Passengers");

			int noOfPassengers = sc.nextInt();

			Ticket ticket = new Ticket(date, t);

			while (noOfPassengers > 0) {

				sc.nextLine();

				System.out.println("Enter Passenger Name");

				String pName = sc.nextLine();

				System.out.println("Enter Age");
				int pAge = sc.nextInt();

				System.out.println("Enter Gender(M/F)");
				char pGender = sc.next().charAt(0);

				ticket.addPassenger(pName, pAge, pGender);

				noOfPassengers--;

			}

			ticket.writeTicket();

			sc.close();

		}

	}

}
