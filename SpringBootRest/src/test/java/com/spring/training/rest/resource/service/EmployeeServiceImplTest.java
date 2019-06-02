package com.spring.training.rest.resource.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.spring.training.rest.resource.controller.EmployeeController;
import com.spring.training.rest.resource.models.Employee;
import com.spring.training.rest.resource.repository.EmployeeRepository;
import com.spring.training.rest.resource.repository.entity.EmployeeEntity;

@RunWith(SpringRunner.class)
@SpringBootTest  //when we are testing service we need to use this
public class EmployeeServiceImplTest {
	@Autowired
	IEmployeeService service;
	
	@MockBean
	EmployeeRepository repository;
	
	@Test
	public void testGetEmployees() {
		
		EmployeeEntity entity = new EmployeeEntity(1l,"Mukesh","Kumar");
		List<EmployeeEntity> list = new ArrayList<EmployeeEntity>();
		list.add(entity);
		when(repository.findAll()).thenReturn(list);
		List<Employee> empList = service.getEmployees();
		Employee emp = empList.get(0);
		System.out.println(emp);
		assertEquals("Mukesh",emp.getFirstName());
		
	}

	@Test
	public void testAddEmployee() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetEmployee() {
		//fail("Not yet implemented");
	}

	@Test
	public void testUpdateEmployee() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDeleteEmployee() {
		//fail("Not yet implemented");
	}

}
