package com.learn.springboot.cruddemo.rest;

import java.util.List;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springboot.cruddemo.entity.Employee;
import com.learn.springboot.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeRestController(EmployeeService theEmployeeService) {

		this.employeeService = theEmployeeService;
	}

	@GetMapping("/employees")
	public List<Employee> findAll() {

		return employeeService.findAll();
	}

	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {
		Employee theEmployee = employeeService.findById(employeeId);
		if (theEmployee == null) {
			throw new RuntimeException("Employee id not found" + employeeId);
		}
		return theEmployee;

	}

	@PostMapping("/employees/")
	public Employee addEmployee(@RequestBody Employee theEmployee) {
		// also just in case if they pass an id in JSON set id to 0
		// this is to force to save th new item.... instead of update
		theEmployee.setId(0);

		employeeService.save(theEmployee);
		return theEmployee;
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee theEmployee) {
		employeeService.save(theEmployee);
		return theEmployee;
	}

}
