package com.spring.training.rest.resource.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.training.rest.resource.models.Employee;
import com.spring.training.rest.resource.repository.EmployeeRepository;
import com.spring.training.rest.resource.repository.entity.EmployeeEntity;
import com.spring.training.rest.resource.service.mapper.EmployeeEntityDTOMapper;

@Service
public class EmployeeServiceImpl implements IEmployeeService
{
	@Autowired
	EmployeeRepository repository;

	@Override
	public List<Employee> getEmployees() {
		
		List<EmployeeEntity> list =repository.findAll();
		return EmployeeEntityDTOMapper.mapDTOList(list);
	}

	@Override
	public Employee addEmployee(Employee dto) {
		EmployeeEntity entity=EmployeeEntityDTOMapper.mapToEntity(dto);
		entity=repository.save(entity);
		
		return EmployeeEntityDTOMapper.mapToDTO(entity);
	}

	@Override
	public Employee getEmployee(long id) {
		
		Optional<EmployeeEntity> entity=repository.findById(id);
		return EmployeeEntityDTOMapper.mapToDTO(entity.orElse(null));
	}

	@Override
	public Employee updateEmployee(long id, Employee employee) {
		Employee emp=getEmployee(id);
		
		if(emp!=null)
		{
			EmployeeEntity entity=EmployeeEntityDTOMapper.mapToEntity(employee);
			repository.save(entity);
		}
		return emp;
	}

	@Override
	public Employee deleteEmployee(long id) {
		Employee emp=getEmployee(id);
		if(emp!=null)
		{
			repository.deleteById(id);
		}
		return emp;
	}

}
