package com.infoscilabs.topic.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infoscilabs.topic.model.Topic;
import com.infoscilabs.topic.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics(){
		return (List<Topic>) topicRepository.findAll();
	}

	public Optional<Topic> fetchTopic(String id) {
		return topicRepository.findById(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}


}
