package com.infoscilabs.course.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infoscilabs.course.model.Course;

public interface CourseRepository  extends CrudRepository<Course, String>{
			
	public List<Course> findByTopicId(String topicId);
}
