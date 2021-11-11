package com.infoscilabs.topic.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infoscilabs.topic.model.Topic;

public interface TopicRepository  extends CrudRepository<Topic, String>{
			

}
