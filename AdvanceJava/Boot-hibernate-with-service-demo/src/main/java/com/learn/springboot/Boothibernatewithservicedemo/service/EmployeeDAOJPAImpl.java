package com.learn.springboot.Boothibernatewithservicedemo.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.springboot.Boothibernatewithservicedemo.dao.EmployeeDAO;
import com.learn.springboot.Boothibernatewithservicedemo.entity.Employee;



@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO {

	private EntityManager entityManager;

	@Autowired
	public EmployeeDAOJPAImpl(EntityManager entityManager) {

		this.entityManager = entityManager;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		System.out.println("Inside JPA findAll");
		Query theQuery = entityManager.createQuery("from Employee");
		List<Employee> employees = theQuery.getResultList();
		return employees;
	}

	@Override
	public Employee findById(int theId) {
		// TODO Auto-generated method stub
		System.out.println("Inside JPA findById");
		Employee theEmployee = entityManager.find(Employee.class, theId);
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		System.out.println("Inside JPA save");
		Employee employee = entityManager.merge(theEmployee);
		theEmployee.setId(employee.getId());
		

	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		System.out.println("Inside JPA deleteById");
		Query theQuery=entityManager.createQuery("delete from Employee where id=:theId");
		theQuery.setParameter("theId", theId);
		theQuery.executeUpdate();

	}

}
