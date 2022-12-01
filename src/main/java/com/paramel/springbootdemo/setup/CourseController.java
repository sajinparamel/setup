package com.paramel.springbootdemo.setup;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class CourseController {
	@RequestMapping("/request")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList( 
		new Course(1,"Sajin","Spring Boot"),
		new Course(2,"Priya","English"));
	}

}
