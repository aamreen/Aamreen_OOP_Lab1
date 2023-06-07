package com.gl.service;
import com.gl.interfaces.ICredentials;
import com.gl.model.Employee;
import java.util.Random;

public class CredentialService implements ICredentials {
	@Override
	public String generateEmailAddress(Employee employee, String department) {
		return employee.getFirstName()+employee.getLastName()+"@"+department+"abc.com";
	}
	
	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		String values = capitalLetters+smallLetters+numbers+specialCharacters;
		Random random = new Random();
		String password = "";
		for(int i=0; i<8; i++) {
		password += values.charAt(random.nextInt(values.length()));
		}
		return password;
	}
	
	@Override
	public void showCredentials(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Dear " + employee.getFirstName());
		System.out.println("Your Email = " + employee.getEmail());
		System.out.println("Your Password = " + employee.getPassword());
	}

}
