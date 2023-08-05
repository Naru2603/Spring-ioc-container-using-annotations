package com.infosys.AutowireAnnotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	int id;
	String name;
	
	Department department;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public Employee(Department department) {
		super();
		this.department = department;
		System.out.println("Setting department using constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
		System.out.println("setting department by Setter method");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

}
