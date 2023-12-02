package com.example.udamyspringcrud2demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.udamyspringcrud2demo.Dao.EmployeeDAIO;
import com.example.udamyspringcrud2demo.Entity.Employee;

@RestController
public class EmployeeController {
	
	private final EmployeeDAIO employeeDAIO;

    @Autowired
    public EmployeeController(EmployeeDAIO employeeDAIO) {
        this.employeeDAIO = employeeDAIO;
    }

    @GetMapping("/emp")
    List<Employee> findAll() {
        return employeeDAIO.findAll();
    }

}
