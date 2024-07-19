package com.lmdlearning.learning_jpa_and_hibernate.course.JPA;

import org.springframework.stereotype.Repository;

import com.lmdlearning.learning_jpa_and_hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class CourseJPARepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		
		entityManager.merge(course);
	}
	
	public Course findById(long id) {
		
		return entityManager.find(Course.class, id);
	}
	
	public void deleteById(long id) {
		
		Course course = entityManager.find(Course.class, id);
		
		entityManager.remove(course);
	}

}
