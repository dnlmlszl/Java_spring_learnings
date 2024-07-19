package com.lmdlearning.learning_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.lmdlearning.learning_jpa_and_hibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseJdbcRepository repository;

	@Override
	public void run(String... args) throws Exception {

		repository.insert(new Course(1, "Learn AWS now!", "LMD"));
		repository.insert(new Course(2, "Learn DevOps", "LMD"));
		repository.insert(new Course(3, "Learn Mambo Banana", "LMD"));
		
		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
		
	}	

}
