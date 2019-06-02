package com.spring.training.rest.resource.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.spring.training.rest.resource.api.EmployeeApi;
import com.spring.training.rest.resource.controller.exception.ResourceNotFoundException;
import com.spring.training.rest.resource.models.Employee;
import com.spring.training.rest.resource.service.IEmployeeService;

@Controller
public class EmployeeController implements EmployeeApi
{

	@Autowired
	IEmployeeService service;
	
	@Override
	public ResponseEntity<Object> addEmployee(@Valid Employee newEmployee) // it will validate employee before doig any process
	{
		return new ResponseEntity<Object>(HttpStatus.OK).ok(service.addEmployee(newEmployee));
	}

	@Override
	public ResponseEntity<Object> deleteEmployeeByID(Long ID) {
		System.out.println(ID);
		 return new ResponseEntity<Object>(HttpStatus.OK).ok(service.deleteEmployee(ID));
	}

	@Override
	public ResponseEntity<Object> getEmployeeByID(Long ID) {
		Employee emp=service.getEmployee(ID);
		if(emp==null)
		{
			throw new ResourceNotFoundException("Resource is not availbale");
		}
		 return new ResponseEntity<Object>(HttpStatus.OK).ok(service.getEmployee(ID));
	}

	@Override
	public ResponseEntity<List<Employee>> getEmployees() {
		System.out.println("getemployess");
		List<Employee> list=service.getEmployees();
		 return new ResponseEntity<List<Employee>>(HttpStatus.OK).ok(list);
	}

	@Override
	public ResponseEntity<Object> updateEmployeebyID(Long ID, Employee updateEmployee) {
		
		System.out.println(ID+ " update emp:"+updateEmployee);
		return new ResponseEntity<Object>(HttpStatus.OK).ok(service.updateEmployee(ID, updateEmployee));
	}

}
