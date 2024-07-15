package com.lmdlearning.learning.spring.framework.examples.c1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplication {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(RealWorldSpringContextLauncherApplication.class)) {
		
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			var ctx = context.getBean(BusinessCalculationService.class).findMax();
		
			System.out.println(ctx);
	}

	}

}
