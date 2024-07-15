package com.lmdlearning.learning.spring.framework.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Normal scope / Singleton returns the same instance each time
@Component
class NormalClass {
	
	public NormalClass() {
		System.out.println("Hello NormalClass . . .");	
	}
}

// Prototype Scope returns a new instance each time
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {
	
	public PrototypeClass() {		
        System.out.println("Hello PrototypeClass . . .");	
    }
}


@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {

	public static void main(String[] args) {

		// Creating context
		try(var context = 
					new AnnotationConfigApplicationContext
						(BeanScopesLauncherApplication.class)) {
			
			// Using the context
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
				
			
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
		}
		
	}

}

/*

OUTPUT:

 Hello NormalClass . . .
com.lmdlearning.learning.spring.framework.examples.e1.NormalClass@13bc8645
com.lmdlearning.learning.spring.framework.examples.e1.NormalClass@13bc8645
Hello PrototypeClass . . .
com.lmdlearning.learning.spring.framework.examples.e1.PrototypeClass@24c22fe
Hello PrototypeClass . . .
com.lmdlearning.learning.spring.framework.examples.e1.PrototypeClass@93081b6
Hello PrototypeClass . . .
com.lmdlearning.learning.spring.framework.examples.e1.PrototypeClass@cd1e646

 */ 
