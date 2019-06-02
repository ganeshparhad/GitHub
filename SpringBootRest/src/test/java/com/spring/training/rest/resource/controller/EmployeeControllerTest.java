package com.spring.training.rest.resource.controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockBeans;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.spring.training.rest.resource.models.Employee;
import com.spring.training.rest.resource.service.IEmployeeService;

@RunWith(SpringRunner.class)
@WebMvcTest(EmployeeController.class)  //need this when we are testing any controller
public class EmployeeControllerTest {

	@Autowired
	MockMvc mockMvc;

	@MockBean
	IEmployeeService iEmployeeService;

	@Test
	public void testAddEmployee() throws Exception {

		Employee emp = new Employee();
		emp.setId(111l);
		emp.setFirstName("Mukesh");
		emp.setLastName("Kumar");
		when(iEmployeeService.addEmployee(Mockito.any(Employee.class))).thenReturn(emp);
		RequestBuilder request = MockMvcRequestBuilders.post("/employees").contentType(MediaType.APPLICATION_JSON)
				.content("{\"id\": 111,\"firstName\": \"Mukesh\",\"lastName\": \"Kumar\"}");
		mockMvc.perform(request).andExpect(status().isOk())
				.andExpect(content().json("{\"id\": 111,\"firstName\": \"Mukesh\",\"lastName\": \"Kumar\"}"));
	}

	@Test
	public void testDeleteEmployeeByID() {
		// fail("Not yet implemented");
	}

	@Test
	public void testGetEmployeeByID() throws Exception {
		Employee emp = new Employee();
		emp.setId(111l);
		emp.setFirstName("Mukesh");
		emp.setLastName("Kumar");
		when(iEmployeeService.getEmployee(111l)).thenReturn(emp);
		RequestBuilder request = MockMvcRequestBuilders.get("/employees/111").contentType(MediaType.APPLICATION_JSON);
		mockMvc.perform(request).andExpect(status().isOk())
				.andExpect(content().json("{\"id\": 111,\"firstName\": \"Mukesh\",\"lastName\": \"Kumar\"}"));

		System.out.println(request);

	}

	@Test
	public void testGetEmployees() {
		// fail("Not yet implemented");
	}

	@Test
	public void testUpdateEmployeebyID() {
		// fail("Not yet implemented");
	}

}
