package com.jspiders.practice.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFile {
	public static void main(String[] args) {
		File file = new File("ByteStream.txt");
		if(file.exists()) {
			System.out.println("File already exists.");
		}else {
			try {
				file.setReadable(true);
				file.setWritable(true);
				file.createNewFile();
				System.out.println("File created successfully.");
				
				FileOutputStream opstream = new FileOutputStream(file);
				opstream.write(50);
				System.out.println("Content written to file.");
				opstream.close();
				
				FileInputStream ipstream = new FileInputStream(file);
				System.out.println(ipstream.read());
				System.out.println("Data read from file.");
				ipstream.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
