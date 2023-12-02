package com.example.udamyspringcrud2demo.DaoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.udamyspringcrud2demo.Dao.EmployeeDAIO;
import com.example.udamyspringcrud2demo.Entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class EmployeeDaoImp implements EmployeeDAIO {

	 @Autowired
	    EntityManager entityManager;

	    // Make the constructor public
	    public EmployeeDaoImp(EntityManager entityManager) {
	        this.entityManager = entityManager;
	    }
	
	
	public List<Employee> findAll() {
		
		 //create query
        TypedQuery<Employee> theQuery=entityManager.createQuery("from Employee",Employee.class);

        //execute and get result list
        List<Employee> employees =theQuery.getResultList();

        //return query
        return employees;
	}
	

}
