package com.amdocs.boot.topics;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
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
		return (ArrayList) topicservice.getTopic();
	}
	
	
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic)
	{
		topicservice.addTopic(topic);
		
	}
	@RequestMapping("/topics/{id}")
	public Optional<Topic> getTopic(@PathVariable String id)
	{
		return topicservice.getTopicId(id);
	}
//	@RequestMapping(method=RequestMethod.DELETE, value="/topicsdelete/{id}")
//	public void deleteTopic(@PathVariable String id)
//	{
//		topicservice.removeTopic(id);
//		
//	}
}
