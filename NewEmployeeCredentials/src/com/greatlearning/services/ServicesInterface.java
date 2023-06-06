package com.greatlearning.services;

import com.greatlearning.employee.Employee;

public interface ServicesInterface {

	public String generateEmailAddress(String firstName, String lastName, String department);
	public String generatePassword();
	public void showCredentials(Employee emp);
}
