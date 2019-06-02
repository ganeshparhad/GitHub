package om.amdocs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import om.amdocs.service.GreetingMessageService;
import om.amdocs.service.GreetingMessageServiceImpl;

public class MainClass {
	
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		GreetingMessageService greetMessageServiceImpl =(GreetingMessageService) context.getBean("greetMessageService",GreetingMessageServiceImpl.class);
		System.out.println(greetMessageServiceImpl.greetUser());
	}

}
