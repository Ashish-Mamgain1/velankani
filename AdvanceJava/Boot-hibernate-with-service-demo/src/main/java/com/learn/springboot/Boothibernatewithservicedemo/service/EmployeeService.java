package com.learn.springboot.Boothibernatewithservicedemo.service;

import java.util.List;

import com.learn.springboot.Boothibernatewithservicedemo.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);

}
