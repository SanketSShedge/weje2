package com.jspiders.practice.movies;

import com.jspiders.practice.inter.Movie;

public class PS3 implements Movie{

	@Override
	public void nowPlaying() {
		System.out.println("Now playing PS3.");			
	}
}
