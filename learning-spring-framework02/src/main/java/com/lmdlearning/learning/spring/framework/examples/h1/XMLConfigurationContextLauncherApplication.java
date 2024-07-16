package com.lmdlearning.learning.spring.framework.examples.h1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lmdlearning.learning.spring.framework.game.GameRunner;



public class XMLConfigurationContextLauncherApplication {

	public static void main(String[] args) {

		// Creating context
		try(var context = 
					new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
			
			// Using the context
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			
			context.getBean(GameRunner.class).run();
			
		}
		
	}

}
