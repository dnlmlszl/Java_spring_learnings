package com.lmdlearning.learning_spring_boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Building a REST API
 http://localhost:8080/courses end point
 Return the following data:
 
 [
 	{
 		"id": 1,
 		"name": "Learn AWS",
 		"author": "LMD"
 	}
 ] 
 
 * */

@RestController
@RequestMapping("/courses")
public class CourseController {
	
	private List<Course> courses = new ArrayList<>(Arrays.asList(
	        new Course(1, "AWS", "LMD"),
	        new Course(2, "DevOps", "LMD"),
	        new Course(3, "Spring Boot", "John Doe"),
	        new Course(4, "Learn React", "LMD"),
	        new Course(5, "Learn GCP", "John Doe")
	    ));
	
	@GetMapping
	public List<Course> retrieveAllCourses() {
		return courses;
	}
	
	@GetMapping("/{id}")
	public Course retrieveCourse(@PathVariable long id) {
		return courses.stream()
				.filter(course -> course.getId() == id)
				.findFirst().orElse(null);
	}
	
	@PostMapping
	public Course createCourse(@RequestBody Course course) {
		courses.add(course);
		return course;
	}
	
	@PutMapping("/{id}")
	public Course updateCourse(@PathVariable long id, @RequestBody Course courseDetails) {
		Course course = courses.stream()
				.filter(crs -> crs.getId() == id)
				.findFirst()
				.orElse(null);
		if (course != null) {
			course.setName(courseDetails.getName());
			course.setAuthor(courseDetails.getAuthor());
		}
		
		return course;
	}
	
	@DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable long id) {
        courses.removeIf(course -> course.getId() == id);
    }

}
