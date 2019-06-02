package com.spring.training.rest.resource.service;
import java.util.List;
import org.springframework.beans.factory.annotation.
Autowired;
import org.springframework.stereotype.Service;
import com.spring.training.rest.resource.models.Employee;
import com.spring.training.rest.resource.repository.
EmployeeRepository;
import com.spring.training.rest.resource.repository.
EmployeeEntity;
import com.spring.training.rest.resource.service.mapper.
EmployeeEntityDTOMapper;
@Service
public class EmployeeServiceImpl implements
IEmployeeService
{
@Autowired
EmployeeRepository repository;
@Override
public List<Employee> getEmployees() {
// TODO Auto-generated method stub
List<EmployeeEntity> list =repository.findAll();
return EmployeeEntityDTOMapper.mapDTOList(list);
}
@Override
public Employee addEmployee(Employee dto) {
return null;
}
@Override
public Employee getEmployee(long id) {
// TODO Auto-generated method stub
return null;
}
@Override
public Employee updateEmployee(long id, Employee
employee) {
// TODO Auto-generated method stub
return null;
}
@Override
public Employee deleteEmployee(long id) {
// TODO Auto-generated method stub
return null;
}
}