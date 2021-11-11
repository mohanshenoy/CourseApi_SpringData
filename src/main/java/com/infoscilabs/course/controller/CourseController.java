package com.infoscilabs.course.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infoscilabs.course.model.Course;
import com.infoscilabs.course.service.CourseService;
import com.infoscilabs.topic.model.Topic;
import com.infoscilabs.topic.service.TopicService;

@RestController
public class CourseController {
	
	@Autowired
	CourseService service;
	
	@RequestMapping(path="/topics/{topicId}/courses" , method = RequestMethod.GET)
	public List<Course> getAllCourses(@PathVariable String topicId){
		return service.getAllCourses(topicId);
	}
	
	@RequestMapping(path="/topics/{topicId}/courses/{courseId}" , method = RequestMethod.GET)
	public Course fetchCourse(@PathVariable String topicId, @PathVariable String courseId){
		Optional<Course> oCourse = service.fetchCourse(courseId);
		Course course = oCourse.get();
		return course;
	}
	
		@RequestMapping(path="/topics/{topicId}/courses" , method = RequestMethod.POST)
		public void addCourse(@PathVariable String topicId, @RequestBody Course course){
			course.setTopic(new Topic(topicId, "",""));
			service.addCourse(course);
		}
			
		@RequestMapping(path="/topics/{topicId}/courses/{courseId}" , method = RequestMethod.PUT)
		public void updateCourse(@PathVariable String topicId, @PathVariable String courseId, @RequestBody Course course){
			service.updateCourse(course);
		}
		
		@RequestMapping(path="/topics/{topicId}/courses/{courseId}" , method = RequestMethod.DELETE)
		public void deleteCourse(@PathVariable String topicId, @PathVariable String courseId){
			service.deleteCourse(courseId);
		}

}
