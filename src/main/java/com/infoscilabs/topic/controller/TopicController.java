package com.infoscilabs.topic.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infoscilabs.topic.model.Topic;
import com.infoscilabs.topic.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	TopicService service;
	
	@RequestMapping(path="/topics" , method = RequestMethod.GET)
	public List<Topic> getAllTopics(){
		return service.getAllTopics();
	}
	
	@RequestMapping(path="/topics/{id}" , method = RequestMethod.GET)
	public Topic fetchTopic(@PathVariable String id){
		Optional<Topic> oTopic = service.fetchTopic(id);
		Topic topic = oTopic.get();
		return topic;
	}
	
	@RequestMapping(path="/topics" , method = RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic){
		service.addTopic(topic);
	}
	
	@RequestMapping(path="/topics/{id}" , method = RequestMethod.PUT)
	public void updateTopic(@PathVariable String id, @RequestBody Topic topic){
		service.updateTopic(id , topic);
	}

	@RequestMapping(path="/topics/{id}" , method = RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id){
		service.deleteTopic(id);
	}
}
