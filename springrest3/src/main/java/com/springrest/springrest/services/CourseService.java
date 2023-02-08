package com.springrest.springrest.services;
import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

import java.util.List;

public interface CourseService {
	
	public List<Course> getCourses();
}
