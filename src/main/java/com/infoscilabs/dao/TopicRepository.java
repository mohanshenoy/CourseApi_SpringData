package com.infoscilabs.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infoscilabs.model.Topic;

public interface TopicRepository  extends CrudRepository<Topic, String>{
			

}
