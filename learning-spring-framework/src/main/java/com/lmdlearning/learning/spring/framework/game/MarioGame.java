package com.lmdlearning.learning.spring.framework.game;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump!");
	}
	
	@Override
	public void down() {
		System.out.println("Go into hole!");
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
		String message = "Hi from the Mario game object!";
		return String.format("%s", message);
	}
}
