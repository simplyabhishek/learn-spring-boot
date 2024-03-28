package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
@RequestMapping("/courses")
public List<Course> retrieveAllCourses(){
	return Arrays.asList(
			new Course(1,"learn AWS","in28minutes"),
			new Course(2,"learn devOps","in28minutes"));
}
}
