package com.lmdlearning.learning.spring.framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Adding Component to the classes and scan package instead of manually creating Beans to do the job
@Configuration
@ComponentScan("com.lmdlearning.learning.spring.framework.game")
public class GamingAppLauncherApplication {

	public static void main(String[] args) {

		// Creating context
		try(var context = 
					new AnnotationConfigApplicationContext
						(GamingAppLauncherApplication.class)) {
			
			// Using the context
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}
		
	}

}
