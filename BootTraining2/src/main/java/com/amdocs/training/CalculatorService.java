package com.amdocs.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	
	@Autowired
	GetDataFromDB dataDB;
	
	public int sum()
	{
		int sum=0;
		int i[]=dataDB.getData();
		for(int j:i)
			sum=sum+j;
		return sum;
	}

}
