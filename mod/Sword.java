package Maze.mod;

import Maze.mod.Maze;
import Maze.mod.Position;

public class Sword {
	/*
	 * Sword Class that implements functionality of sword for Player
	 */
	
	//Declare current position and isAlive vars
	private Position _curPos;
	
	private boolean _isAlive = true;

	//Getters
	public Position getPosition() {	return _curPos; }
	public boolean isAlive() { return _isAlive; }

	//Sets isAlive to false
	public void killSword() {
		_isAlive= false;
		
	}
	
	//Constructor that initializes current position of sword
	public Sword(Maze z) {
		_curPos = new Position(z.getSword().getRow(), z.getSword().getCol());
	}
	
	/*
	 * Setters
	 * Set position given a position
	 */
	public void setPosition(Position p) {
		_curPos = p;
	}
	
	//Sets position given a row and a column
	public void setPosition(int r, int c) {
		_curPos = new Position(r,c);
	}
	
	//	//Dead method that sets the current position to a wall, removing it from the map
	public void dead() {
		_curPos= new Position(0,2);
		}

}
