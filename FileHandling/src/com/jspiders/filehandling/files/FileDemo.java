package com.jspiders.filehandling.files;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		File file = new File("D:DemoFile.txt");
		try {
			file.createNewFile();
			System.out.println("File successfully created");
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	}
