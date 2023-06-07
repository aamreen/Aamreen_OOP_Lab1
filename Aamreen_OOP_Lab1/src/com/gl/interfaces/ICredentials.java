package com.gl.interfaces;

import com.gl.model.Employee;

public interface ICredentials {

	String generateEmailAddress(Employee employee, String department);

	String generatePassword();

	void showCredentials(Employee e);

}
