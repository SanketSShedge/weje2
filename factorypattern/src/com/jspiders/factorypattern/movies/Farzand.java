package com.jspiders.factorypattern.movies;

import com.jspiders.factorypattern.inter.Movie;

public class Farzand implements Movie{

	@Override
	public void nowPlaying() {
		System.out.println("Now playing Farzand.");
	}
}
