package Maze.cont;

import Maze.cont.Overseer;

public class Run {
	//main method to start the game
	public static void main(String[] args) {
		LAB3();
	}
	
	//creates an Overseer object thus starting the game
	public static void LAB3() {
		Overseer o= new Overseer();
	}
	
	//creates an OverseerRestart object to restart the game when character dies
	public static void RESTART() {
		OverseerRestart o= new OverseerRestart();
	}
}
