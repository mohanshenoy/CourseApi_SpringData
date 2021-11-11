package com.infoscilabs.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infoscilabs.dao.TopicRepository;
import com.infoscilabs.model.Topic;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics(){
		return (List<Topic>) topicRepository.findAll();
	}

	public Optional<Topic> fetchTopic(String name) {
		return topicRepository.findById(name);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String name, Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String name) {
		topicRepository.deleteById(name);
	}
}
