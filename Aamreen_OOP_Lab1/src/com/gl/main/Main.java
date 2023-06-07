package com.gl.main;
import java.util.Scanner;
import com.gl.model.Employee;
import com.gl.service.CredentialService;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String args[]) {
		Employee e = new Employee("Aamreen", "Shaikh");
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int option = scanner.nextInt();
		System.out.println(option);
		
		CredentialService credsvc = new CredentialService();
		String password = credsvc.generatePassword();
		String[] departments = {"tech", "admin", "hr", "legal"};
		
		String emailAddress = credsvc.generateEmailAddress(e, departments[option-1]);
		System.out.println(emailAddress);
		
		e.setEmail(emailAddress);
		e.setPassword(password);
		
		credsvc.showCredentials(e);
	}
}