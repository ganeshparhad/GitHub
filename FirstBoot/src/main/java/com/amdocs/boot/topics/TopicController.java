package com.amdocs.boot.topics;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("/topics")
	public ArrayList getAllTopics()
	{
		return topicservice.getTopic();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return topicservice.getTopicById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic)
	{
		topicservice.add(topic);
		
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/topicsdelete/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		topicservice.removeTopic(id);
		
	}
}
