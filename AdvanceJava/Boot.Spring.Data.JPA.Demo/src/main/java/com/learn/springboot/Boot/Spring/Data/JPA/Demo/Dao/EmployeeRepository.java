package com.learn.springboot.Boot.Spring.Data.JPA.Demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.springboot.Boot.Spring.Data.JPA.Demo.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
