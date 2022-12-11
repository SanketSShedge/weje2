package com.jspiders.filehandling.files;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) {
		File file = new File("D:\\Demo1.docx");
		try {
			file.createNewFile();
			System.out.println("File created successfully.");
			if(file.canExecute()) {
				System.out.println("File is executable.");
			}else {
				System.out.println("File is not executable.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

