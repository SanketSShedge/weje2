package com.jspiders.singleton.object;

public class MovieEager {
	static int noOfTickets;
	static MovieEager movieEager = new MovieEager(100);
	
	public MovieEager(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	
	public static MovieEager bookTickets(int noOfBookings) {
		System.out.println("Available tickets:" +noOfTickets);
		System.out.println("Booking " +noOfBookings+ " tickets.");
		if(noOfBookings > noOfTickets) {
			System.out.println("Tickets not available.");
			return movieEager;
		}
		noOfTickets -= noOfBookings;
		System.out.println("Tickets left:" +noOfTickets);
		return movieEager;
	}
}
