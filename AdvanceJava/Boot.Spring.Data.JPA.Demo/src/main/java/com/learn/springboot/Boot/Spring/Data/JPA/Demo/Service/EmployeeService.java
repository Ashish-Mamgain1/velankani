package com.learn.springboot.Boot.Spring.Data.JPA.Demo.Service;

import java.util.List;

import com.learn.springboot.Boot.Spring.Data.JPA.Demo.Entity.Employee;



public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);

}
