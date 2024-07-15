package com.lmdlearning.learning.spring.framework;

import com.lmdlearning.learning.spring.framework.game.GameRunner;
import com.lmdlearning.learning.spring.framework.game.PacmanGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {

		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		
		var game = new PacmanGame();
		
		var gameRunner = new GameRunner(game);
		
		System.out.println("\n==========\n");
		gameRunner.run();
		System.out.println("\n==========\n");
		
	}

}
