package com.lmdlearning.learning_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.lmdlearning.learning_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
	// @Autowired
	// private CourseJdbcRepository repository;
	
	// @Autowired
	// private CourseJPARepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {

		//repository.insert(new Course(1, "Learn AWS JPA version!", "LMD"));
		//repository.insert(new Course(2, "Learn DevOps JPA version", "LMD"));
		//repository.insert(new Course(3, "Learn Mambo Banana JPA version", "LMD"));
		
		// repository.deleteById(1);
		
		// System.out.println(repository.findById(2));
		// System.out.println(repository.findById(3));
		
		repository.save(new Course(1, "Learn AWS Spring JPA!", "LMD"));
		repository.save(new Course(2, "Learn DevOps Spring JPA", "LMD"));
		repository.save(new Course(3, "Learn Mambo Banana Spring JPA", "LMD"));		
		repository.save(new Course(4, "Learn Spring JPA", "LMD"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		System.out.println(repository.findById(4l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("LMD"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println(repository.findByName("Learn DevOps Spring JPA"));
		
	}	

}
