package com.lmdlearning.learning_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.lmdlearning.learning_jpa_and_hibernate.course.JPA.CourseJPARepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
	// @Autowired
	// private CourseJdbcRepository repository;
	
	@Autowired
	private CourseJPARepository repository;

	@Override
	public void run(String... args) throws Exception {

		repository.insert(new Course(1, "Learn AWS JPA version!", "LMD"));
		repository.insert(new Course(2, "Learn DevOps JPA version", "LMD"));
		repository.insert(new Course(3, "Learn Mambo Banana JPA version", "LMD"));
		
		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
		
	}	

}
