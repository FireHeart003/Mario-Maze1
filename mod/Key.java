package Maze.mod;

public class Key {
	/*
	 * Set private instance variables for current position and whether object is still usable
	 */
	private Position _curPos;
	
	private boolean _isAlive = true;

	//getters
	public Position getKey() {
		return _curPos;
	}
	public boolean isAlive() {
		return _isAlive;
	}

	//Setter
	public void killKey() {
		_isAlive= false;
		
	}

	//Constructor initializing the current position of the key
	public Key(Maze z) {
		_curPos = new Position(z.getKey().getRow(), z.getKey().getCol());
	}
	
	//Set the position to  a given position
	public void setPosition(Position p) {
		_curPos = p;
	}
	
	//the actual removing of the key by setting position to a wall
	public void deadKey() {
		_curPos= new Position(0,2);
		}

	//sets the position to a given row and column
	public void setPosition(int r, int c) {
		_curPos = new Position(r,c);
	}

}
