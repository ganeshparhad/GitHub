package com.spring.training.rest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.training.rest.resource.models.Employee;


//integration teast
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT) //it will select random post to run 
public class SpringBootRestApplicationTests {

	@Autowired
	TestRestTemplate restTemplate;
	
	@Test
	public void contextLoads() {
		HttpHeaders header =new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>("parameter",header);
		
		ResponseEntity<Employee> response = restTemplate.exchange("/employees/111",HttpMethod.GET,entity,Employee.class);
		
		Employee emp = response.getBody();
		
		assertTrue(111==emp.getId());
	}

}
