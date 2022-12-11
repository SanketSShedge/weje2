package com.jspiders.practice.main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharacterFile {
	public static void main(String[] args) {
		File file = new File("CharStream.txt");
		if(file.exists()) {
			System.out.println("File already exists.");
		}else {
			try {
				file.setReadable(true);
				file.setWritable(true);
				file.createNewFile();
				System.out.println("File created successfully.");
				
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write("This is data sent to file.");
				System.out.println("Content written to file.");
				fileWriter.close();
				
				FileReader fileReader = new FileReader(file);
				System.out.println(fileReader.read());
				System.out.println("Data read from file.");
				fileReader.close();
				
				Scanner sc = new Scanner(System.in);
				while(sc.hasNextLine());
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
