package com.lmdlearning.learning.spring.framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {

	@Override
	
	public void up() {
		System.out.println("Jump!");
	}
	
	@Override
	public void down() {
		System.out.println("Go into a hole!");
	}
	
	@Override
	public void left() {
		System.out.println("Go back!");
	}
	
	@Override
	public void right() {
		System.out.println("Accelerate!");
	}
	
	@Override
	public String toString() {
		String message = "Hi from the Mario Game object!";
		return String.format("%s", message);
	}
}
