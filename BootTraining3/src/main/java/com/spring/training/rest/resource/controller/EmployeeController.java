package com.spring.training.rest.resource.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.
Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import com.spring.training.rest.resource.api.EmployeeApi;
import com.spring.training.rest.resource.models.Employee;
import com.spring.training.rest.resource.service.
IEmployeeService;
@Controller
public class EmployeeController implements EmployeeApi
{
@Autowired
IEmployeeService service;
@Override
public ResponseEntity<Object> addEmployee(Employee
newEmployee) {
System.out.println(newEmployee);
service.addEmployee(newEmployee);
return new ResponseEntity<Object>(HttpStatus.OK);
}
@Override
public ResponseEntity<Object> deleteEmployeeByID(Long
ID) {
System.out.println(ID);
return new ResponseEntity<Object>(HttpStatus.OK);
}
@Override
public ResponseEntity<Object> getEmployeeByID(Long
ID) {
System.out.println(ID);
return new ResponseEntity<Object>(HttpStatus.OK);
}


@Override
public ResponseEntity<List<Employee>> getEmployees() {
System.out.println("getemployess");
List<Employee> list=service.getEmployees();
return new ResponseEntity<List<Employee>>(HttpStatus.
OK).ok(list);
}




@Override
public ResponseEntity<Object> updateEmployeebyID
(Long ID, Employee updateEmployee) {
System.out.println(ID+ " update emp:"+updateEmployee);
return EmployeeApi.super.updateEmployeebyID(ID,
updateEmployee);
}
}