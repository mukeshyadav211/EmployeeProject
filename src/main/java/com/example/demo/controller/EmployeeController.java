package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/employees")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@RequestMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable String id) {
		return employeeService.getEmployee(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/employee/add")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employee/{id}")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable String id) {
		employeeService.updateEmployee(id, employee);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/employee/{id}")
	public void deleteemployee(@PathVariable String id) {
		employeeService.deleteEmployee(id);
	}

}