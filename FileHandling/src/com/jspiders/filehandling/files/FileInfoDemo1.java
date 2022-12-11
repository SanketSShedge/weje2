package com.jspiders.filehandling.files;

import java.io.File;
import java.io.IOException;

public class FileInfoDemo1 {
	public static void main(String[] args) {
		File file = new File("DemoFile.txt");
		if(file.canRead()) {
			System.out.println("File is readable.");
		} else {
			System.out.println("File is not readable.");
		}
		if(file.canWrite()) {
			System.out.println("File is writeable.");
		}else {
			System.out.println("File is not readable.");
		}
		if(file.canExecute()) {
			System.out.println("File is executable.");
		}else {
			System.out.println("File is not executable.");
		}
		System.out.println(file.length());
	}
}
