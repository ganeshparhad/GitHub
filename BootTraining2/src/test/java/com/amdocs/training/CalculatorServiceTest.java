package com.amdocs.training;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorServiceTest {
	
	@InjectMocks
	CalculatorService calculatorService;
	
	@Mock
	GetDataFromDB getDataFromDB;
	@Before
	public void before()
	{
		int[] i= {1,9,3};
		System.out.println("Before");
		when(getDataFromDB.getData()).thenReturn(i);
	}

	@Test
	public void testSum() {
		System.out.println("test");
		int result = calculatorService.sum();
		System.out.println(result);
		assertEquals(13, result);
		
	}
	
	@After
	public void after()
	{
		System.out.println("After");
		
	}

}
