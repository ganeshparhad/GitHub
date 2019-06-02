package com.spring.training.rest.resource.service;
import java.util.List;
import com.spring.training.rest.resource.models.Employee;
public interface IEmployeeService
{
List<Employee> getEmployees();
Employee addEmployee(Employee dto);
Employee getEmployee(long id);
Employee updateEmployee(long id,Employee employee);
Employee deleteEmployee(long id);
}