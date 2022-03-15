package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Language {
	
	@Id
	private String id;
	private String name;
	private String description;
	
	@ManyToOne
	private Employee employee;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	public Language(String id, String name, String description, String employeeId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.employee = new Employee(employeeId, "", "");
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Language() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}