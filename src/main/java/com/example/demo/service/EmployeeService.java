package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployee() {
		List<Employee> employeeList = new ArrayList<>();
		employeeRepository.findAll().forEach(employeeList::add);
		return employeeList;
	}

	public Employee getEmployee(String id) {
		return employeeRepository.findById(id).get();
	}

	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public void updateEmployee(String id, Employee employee) {
		employeeRepository.save(employee);
	}

	public void deleteEmployee(String id) {
		employeeRepository.deleteById(id);
	}

}