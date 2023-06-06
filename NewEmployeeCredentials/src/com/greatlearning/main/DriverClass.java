package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.employee.Employee;
import com.greatlearning.services.ServicesImplementations;

public class DriverClass {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		//Creating new employee
		
		System.out.print("Enter first name: ");
		String firstName = scan.next();
		scan.nextLine();
		
		System.out.print("Enter last name: ");
		String lastName = scan.next();
		scan.nextLine();
		
		Employee employee1 = new Employee(firstName, lastName);
		
		//Determining employee's department
		
		int option; 
		do {
			showDepartments();
			option = selectDepartment();
			
			if ((option>0)&&(option<5)) {
				break;
			}
			else {
				System.out.println("Invalid option. Enter valid option.");
			}
		}
		while(true);
		
		//Generating Email Id and Password for the new employee
		
		String Email = null;
		String Password = null;
		
		ServicesImplementations si = new ServicesImplementations();
		
		switch (option) {
		
			case 1: {
				Email = si.generateEmailAddress(firstName, lastName, "technical");
				Password = si.generatePassword();
				break;
			}
			case 2: {
				Email = si.generateEmailAddress(firstName, lastName, "admin");
				Password = si.generatePassword();
				break;
			}
			case 3: {
				Email = si.generateEmailAddress(firstName, lastName, "humanresource");
				Password = si.generatePassword();
				break;
			}
			case 4: {
				Email = si.generateEmailAddress(firstName, lastName, "legal");
				Password = si.generatePassword();
				break;
			}
		}
		
		//Displaying employee's credentials
		
		employee1.setEmail(Email);
		employee1.setPassword(Password);
		
		si.showCredentials(employee1);
	}
	
	public static void showDepartments(){
		
		System.out.println("\nSelect your department: \n");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
	}
	
	public static int selectDepartment(){
		
		System.out.print("\nYour option: ");
		int option = scan.nextInt();
			System.out.println("");
			return option;
	}
}
