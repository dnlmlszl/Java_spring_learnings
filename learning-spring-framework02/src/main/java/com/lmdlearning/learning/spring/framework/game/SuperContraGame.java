package com.lmdlearning.learning.spring.framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole {
	
	@Override
	public void up() {
		System.out.println("Up!");
	}
	
	@Override
	public void down() {
		System.out.println("Sit down!");
	}
	
	@Override
	public void left() {
		System.out.println("Go back!");
	}
	
	@Override
	public void right() {
		System.out.println("Shoot a bullet!");
	}
	
	@Override
	public String toString() {
		String message = "Hi from the Super Contra Game object!";
		return String.format("%s", message);
	}

}