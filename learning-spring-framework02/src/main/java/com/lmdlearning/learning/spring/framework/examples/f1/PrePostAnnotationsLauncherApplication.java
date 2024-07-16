package com.lmdlearning.learning.spring.framework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		System.out.println("All dependencies are ready!");
		this.someDependency = someDependency;
	}
	
	// Call annotation if you want to reach a method right after the initialization of the bean
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}
	
	// Annotation is in use if a clean up method is required such as close active connections, etc.
	@PreDestroy
	public void cleanUp() {
		System.out.println("Clean up");
	}
}

@Component
class SomeDependency {

	public void getReady() {
		System.out.println("Some logic using SomeDependency");
		
	}}


@Configuration
@ComponentScan
public class PrePostAnnotationsLauncherApplication {

	public static void main(String[] args) {

		// Creating context
		try(var context = 
					new AnnotationConfigApplicationContext
						(PrePostAnnotationsLauncherApplication.class)) {
			
			// Using the context
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		}
		
	}

}
