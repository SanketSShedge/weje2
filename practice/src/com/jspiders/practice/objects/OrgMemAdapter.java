package com.jspiders.practice.objects;

import com.jspiders.practice.inter.OrganizationEvents;

public class OrgMemAdapter extends Member 
implements OrganizationEvents{
	public static void main(String[] args) {
		OrgMemAdapter adapt = new OrgMemAdapter();
		adapt.mensDay();
	}
		
	@Override
	public void mensDay() {
		OrgMemAdapter adapt = new OrgMemAdapter();
		adapt.setId(101);
		adapt.setName("Professor");
		adapt.setEmail("prof123@gmail.com");
		System.out.println("The chief guest of event is: " +adapt.getName());
	}
}
