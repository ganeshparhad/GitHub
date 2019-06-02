package com.amdocs.boot.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	static ArrayList<Topic> list = new ArrayList<Topic>();
	Topic t1=new Topic();
	
	public TopicService()
	{
		t1.setId("java");
		t1.setName("String");
		list.add(t1);
		t1=new Topic();
		t1.setId("web");
		t1.setName("Rest");
		t1=new Topic();
		t1.setId("AI");
		t1.setName("Big Data");
		
		
		list.add(t1);
	}
	
	public ArrayList getTopic()
	{
		return list;
	}
	
	public Topic getTopicById(String id)
	{
		System.out.println("outside for loop");
		System.out.println(list);
		for(Topic t:list)
		{
			System.out.println("inside for loop"+ t +" " + id );
			if(t.getId().equalsIgnoreCase(id))
			{
				System.out.println("inside if");
				return t;
			}
		}
		System.out.println("record not found");
		return new Topic();
	}

	public void add(Topic topic) {
		list.add(topic);
		
	}

	public void removeTopic(String id) {
		System.out.println("Before " +list);
		list.removeIf(t1->t1.getId().equals(id));
		System.out.println("After " +list);
		
	}

}
