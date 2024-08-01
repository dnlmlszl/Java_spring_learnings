package com.lmdlearning.library_exercise;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryExerciseApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("Application has started...");
            // Itt helyezhetsz el bármilyen inicializáló kódot vagy logikát, amit szeretnél futtatni.
        };
    }

}
