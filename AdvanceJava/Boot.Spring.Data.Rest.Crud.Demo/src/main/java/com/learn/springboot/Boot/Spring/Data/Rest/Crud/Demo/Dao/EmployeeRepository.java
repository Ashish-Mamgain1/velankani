package com.learn.springboot.Boot.Spring.Data.Rest.Crud.Demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.learn.springboot.Boot.Spring.Data.Rest.Crud.Demo.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
