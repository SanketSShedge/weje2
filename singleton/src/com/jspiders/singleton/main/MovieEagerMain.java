package com.jspiders.singleton.main;

import com.jspiders.singleton.object.MovieEager;

public class MovieEagerMain {
	public static void main(String[] args) {
		MovieEager.bookTickets(20);
		MovieEager.bookTickets(50);
		MovieEager.bookTickets(40);
	}
}
