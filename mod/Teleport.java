package Maze.mod;

public class Teleport {
	/*
	 * Teleport object to a different world
	 */
	
	//Declare private variables current position and isALive
	private Position _curPos;
	
	private boolean _isAlive = true;

	//Getters
	public Position getPosition() {	return _curPos; }
	public boolean isAlive() { return _isAlive; }

	//Sets isAlive to false
	public void killSword() {
		_isAlive= false;
	}

	//Constructor initializing the current position of the teleport
	public Teleport(Maze z) {
		_curPos = new Position(z.getTeleport().getRow(), z.getTeleport().getCol());
	}
	
	/*
	 * Setters
	 * Set position given a position
	 */
	public void setPosition(Position p) {
		_curPos = p;
	}

	//Sets position given a row and column
	public void setPosition(int r, int c) {
		_curPos = new Position(r,c);
	}
	
	//Dead method that sets the current position to a wall, removing it from the map
	public void dead() {
		_curPos= new Position(0,2);
		}

}
