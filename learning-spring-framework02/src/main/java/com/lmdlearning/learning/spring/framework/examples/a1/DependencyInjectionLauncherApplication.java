package com.lmdlearning.learning.spring.framework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// Types of Dependency Injections:

// FIELD INJECTION - Autowired at Dep1 and Dep2 in the constructor
// SETTER INJECTION - Autowired at setters of the class
// CONSTRUCTOR INJECTION - Autowired at class constructor 

@Component
class YourBusinessClass {
	
	// @Autowired
	Dependency1 dependency1;
	
	//@Autowired
	Dependency2 dependency2;
	
	
	@Autowired
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor Injection - Your Business Class");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}



	/*@Autowired
	public void setDependency1(Dependency1 dependency1) {
		System.out.println("Setter Injection - setDependency1");
		this.dependency1 = dependency1;
	}


	@Autowired
	public void setDependency2(Dependency2 dependency2) {
		System.out.println("Setter Injection - setDependency2");
		this.dependency2 = dependency2;
	}*/


	public String toString() {
		
		return String.format("Using %s and %s", dependency1, dependency2);
	}
}

@Component
class Dependency1 {
	
	public String toString() {
		
		return String.format("Dependency1");
	}
	
}

@Component
class Dependency2 {
	
	public String toString() {
		
		return String.format("Dependency2");
	}
}


@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {

	public static void main(String[] args) {

		// Creating context
		try(var context = 
					new AnnotationConfigApplicationContext
						(DependencyInjectionLauncherApplication.class)) {
			
			// Using the context
			// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			var ctx = context.getBean(YourBusinessClass.class);
			
			System.out.println(ctx);
			
		}
		
	}

}
