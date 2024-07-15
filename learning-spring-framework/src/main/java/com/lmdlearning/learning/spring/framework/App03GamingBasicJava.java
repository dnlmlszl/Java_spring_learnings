package com.lmdlearning.learning.spring.framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lmdlearning.learning.spring.framework.game.GameRunner;
import com.lmdlearning.learning.spring.framework.game.GamingConsole;

public class App03GamingBasicJava {

	public static void main(String[] args) {

		// Creating context
		try(var context = 
					new AnnotationConfigApplicationContext
						(GamingConfiguration.class)) {
			
			// Using the context
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}
		
	}

}
