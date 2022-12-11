package com.jspiders.builderpattern.object;

public class ContactBuilder {
	String firstName;
	String middleName;
	String lastName;
	long mobileNo;
	long landlineNo;
	String email;
	String address;
	String company;
	String dob;
	
	public ContactBuilder firstName(String firstName) {
		this.firstName=firstName;
		return this;
	}
	
	public ContactBuilder middleName(String middleName) {
		this.middleName=middleName;
		return this;
	}
	
	public ContactBuilder lastName(String lastName) {
		this.lastName=lastName;
		return this;
	}
	
	public ContactBuilder mobileNo(long mobileNo) {
		this.mobileNo=mobileNo;
		return this;
	}
	
	public ContactBuilder landlineNo(long landlineNo) {
		this.landlineNo=landlineNo;
		return this;
	}
	
	public ContactBuilder email(String email) {
		this.email=email;
		return this;
	}
	
	public ContactBuilder address(String address) {
		this.address=address;
		return this;
	}
	
	public ContactBuilder company(String company) {
		this.company=company;
		return this;
	}
	
	public ContactBuilder dob(String dob) {
		this.dob=dob;
		return this;
	}
	
	public Contact getContact() {
		Contact contact=new Contact(this.firstName, this.middleName, this.lastName, this.mobileNo, this.landlineNo, this.email, this.address,
				this.company, this.dob);
		return contact;
	}
}
