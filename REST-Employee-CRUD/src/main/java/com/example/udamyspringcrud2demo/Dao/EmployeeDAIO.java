package com.example.udamyspringcrud2demo.Dao;

import java.util.List;

import com.example.udamyspringcrud2demo.Entity.Employee;

public interface EmployeeDAIO {

	List<Employee> findAll();
}
