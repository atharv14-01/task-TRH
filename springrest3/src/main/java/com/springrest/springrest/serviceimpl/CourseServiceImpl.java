package com.springrest.springrest.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	
	private List<Course> list;
	
	public CourseServiceImpl() {
		
		list = new ArrayList<>();
		list.add(new Course(145, "JAVA Core Course", "This course contains basics of JAVA"));
		list.add(new Course(4342, "spring boot course", "creating Rest API using spring boot"));
	}
	@Override
	public List<Course> getCourses() {
		System.out.println(list);
		return list;
	}
}