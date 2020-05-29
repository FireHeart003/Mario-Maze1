package Maze.mod;

public class Exclamation {
	//For exclamation item
	//Current position and whether it is still on map(isAlive)
	private Position _curPos;
	
	private boolean _isAlive = true;
	//getter
	public Position getPosition() {
		return _curPos;
	}
	public boolean isAlive() {
		return _isAlive;
	}
	
	//setter
	public void setFalse1() {
		_isAlive = false;
	}

	//Constructor initializes the current position of the exclmaation block
	public Exclamation(Maze z) {
		_curPos = new Position(z.getEx().getRow(), z.getEx().getCol());
	}
	
	//setter for position given a position
	public void setPosition(Position p) {
		_curPos = p;
	}
	
	//basically removes the exclamation
	public void dead() {
		_curPos= new Position(0,0);
		}
	
	//sets it to alive and sets it to a position
	public void setAlive1() {
		_isAlive = true;
		_curPos = new Position(16,7);
	}
	//set position with specific row and column
	public void setPosition(int r, int c) {
		_curPos = new Position(r,c);
	}
}
