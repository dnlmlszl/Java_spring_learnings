package com.lmdlearning.learning.spring.framework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {
	
	@Override
	public void up() {
		System.out.println("Move up!");
	}

	@Override
	public void down() {
		System.out.println("Move down!");
		
	}

	@Override
	public void left() {
		System.out.println("Move left!");
		
	}

	@Override
	public void right() {
		System.out.println("Move right!");
		
	}
	
	@Override
	public String toString() {
		String message = "Hi from the Pacman Game object!";
		return String.format("%s", message);
	}

}
