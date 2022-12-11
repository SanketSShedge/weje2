package com.jspiders.builderpattern.main;

import com.jspiders.builderpattern.object.Contact;
import com.jspiders.builderpattern.object.ContactBuilder;

public class contactMain {
	
	public static void main(String[] args) {
		Contact contact=new ContactBuilder().firstName("Virat").lastName("Kohli").getContact();
		System.out.println(contact);
		
		Contact contact2=new ContactBuilder().firstName("Nora").mobileNo(9876543210L).getContact();
		System.out.println(contact2);
	}
}
