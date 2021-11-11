package com.infoscilabs.course.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infoscilabs.course.model.Course;
import com.infoscilabs.course.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String topicId){
		return (List<Course>) courseRepository.findByTopicId(topicId);
	}

	public Optional<Course> fetchCourse(String courseId) {
		return courseRepository.findById(courseId);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String courseId) {
		courseRepository.deleteById(courseId);
	}
}
