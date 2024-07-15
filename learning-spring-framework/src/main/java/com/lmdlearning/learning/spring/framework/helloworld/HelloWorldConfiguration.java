package com.lmdlearning.learning.spring.framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};

record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "LMD Junior";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		var person = new Person("LMD", 20, new Address("Main Street", "Utrecht"));
		
		return person;
	}
	
	@Bean
	public Person person2MethodCall() {
		var person = new Person(name(), age(), address());
		
		return person;
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		var person = new Person(name, age, address3);
		
		return person;
	}
	
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) {
		var person = new Person(name, age, address);
		
		return person;
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
		var person = new Person(name, age, address);
		
		return person;
	}
	
	// To solve the issue with multiple Address Beans, we can select one of them as a primary Bean
	// or select one as a Qualifier
	// This allows us to run the context without any Exception
	@Bean(name = "address2")
	@Primary
	public Address address() {
		var address = new Address("My place", "Budapest");
		
		return address;
	}
	
	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		var address = new Address("Motinaga Avenue", "Manchester");
		
		return address;
	}
	

}
