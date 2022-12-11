package com.jspiders.practice.main;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		File file = new File("D:\\DemoFile.txt");
		try {
			file.createNewFile();
			System.out.println("File created successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
