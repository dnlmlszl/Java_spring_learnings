package com.lmdlearning.learning.spring.framework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// Lazy initialization is triggered only when the class is in use

@Component
class ClassA {}

@Component
@Lazy
class ClassB {
	
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		
		System.out.println("Some initialization logic");
		
		this.classA = classA;
	}

	public void doSomething() {
		
		System.out.println("Do something");
		
	}
}


@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication
{

	public static void main(String[] args) {

		// Creating context
		try(var context = 
					new AnnotationConfigApplicationContext
						(LazyInitializationLauncherApplication.class)) {
			
			// Using the context
			// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println("Initialization of context is completed");
			
			context.getBean(ClassB.class).doSomething();
			
		}
		
	}

}
