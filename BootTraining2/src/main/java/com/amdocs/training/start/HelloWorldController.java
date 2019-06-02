package com.amdocs.training.start;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String greetMassage()
	{
		return "Hi dom nick torreto";
	}
}
