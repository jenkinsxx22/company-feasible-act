package com.feasible.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")

public class Employee {

	@Id
	@GeneratedValue
	@Column(name="id")	
	private long id;

	@Column(name="first_name")	
	private String firstname;

	@Column(name="last_name")	
	private String lastname;

	@Column(name="email")	
	private String email;
	
	@Column(name="address")	
	private String address;
	
	@Column(name="designation")	
	private String designation;
	
	@Column(name="department")	
	private String department;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(long id, String firstname, String lastname, String email, String address, String designation,
			String department) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.address = address;
		this.designation = designation;
		this.department = department;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

}
