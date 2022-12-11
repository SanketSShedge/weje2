package com.jspiders.adapterpattern.object;

import com.jspiders.adapterpattern.interfaces.CompanyEvents;

public class CompEmpAdapter extends Employee 
implements CompanyEvents {

	public static void main(String[] args) {
		CompEmpAdapter adapter = new CompEmpAdapter();
		adapter.womensDay();
	}
	
	@Override
	public void womensDay() {
		CompEmpAdapter adapter = new CompEmpAdapter();
		adapter.setId(1);
		adapter.setName("Ambadas");
		adapter.setEmail("hapus143@gmail.com");
		System.out.println("The manager of the event is: " +adapter.getName());
		
		CompEmpAdapter adapter2 = new CompEmpAdapter();
		adapter2.setId(1);
		adapter2.setName("Chandra");
		adapter2.setEmail("chandra420@gmail.com");
		System.out.println("The chief guest of the event is: " +adapter2.getName());
	}
}
