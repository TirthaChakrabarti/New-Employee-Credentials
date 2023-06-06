package com.greatlearning.services;

import com.greatlearning.employee.Employee;

public class ServicesImplementations implements ServicesInterface{

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {
		
		String email = firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+".greatlearning.com";
		return email;
	}

	@Override
	public String generatePassword() {
		
		RandomPasswordGenerator password = new RandomPasswordGenerator();
		return password.generateRandomPassword(8);
	}

	@Override
	public void showCredentials(Employee emp) {
		
		System.out.println("Hi "+emp.getFirstName()+", Your generated credentials are as follows: \n");
		System.out.println("Email: "+emp.getEmail());
		System.out.println("Password: "+emp.getPassword());
	}

	
}
