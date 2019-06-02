package om.amdocs.service;

import om.amdocs.model.User;

public class GreetingMessageServiceImpl implements GreetingMessageService  {
	

	User user;
	
	@Override
	public String greetUser() {
		
		return "Hello" +" "+ user.getFirstName() +" "+ user.getLastName();
	}
	
	public void setUser(User user)
	{
		this.user=user;
	}

	public GreetingMessageServiceImpl(User user) {
		super();
		this.user = user;
	}
	


}
