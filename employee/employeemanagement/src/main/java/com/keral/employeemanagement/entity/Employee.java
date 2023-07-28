package com.keral.employeemanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int eId;
	private String firstName;
	private String lastName;
	private String email;
	private int eSalary;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int geteSalary() {
		return eSalary;
	}

	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}

	public Employee() {
		super();
	}

	public Employee(int eId, String firstName, String lastName, String email, int eSalary) {
		super();
		this.eId = eId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.eSalary = eSalary;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", eSalary=" + eSalary + "]";
	}

}
