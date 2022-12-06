package com.emp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.Entity.Employee;
import com.emp.Service.IEmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;
	
	@PostMapping("/add")
	Integer createEmployee(@RequestBody Employee employee){
		Integer id=employeeService.saveEmployee(employee);
		System.out.println(id);
		return id;
	}
}
