package com.amdocs.boot.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired 
	private TopicRepository topicRepo;
	
	static ArrayList<Topic> list = new ArrayList<Topic>();
	Topic t1=new Topic();
	
	
	public void addTopic(Topic topic)
	{
		 topicRepo.save(topic);
		 System.out.println("Saved");
	}
	
	public List getTopic()
	{
		List<Topic> lst=new ArrayList<Topic>();
		
		topicRepo.findAll().forEach(lst::add);
		return lst;
		
	}
	
	public Optional<Topic> getTopicId(String id)
	{
		return topicRepo.findById(id);
	}
	
}
