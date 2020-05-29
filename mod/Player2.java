package Maze.mod;

public class Player2 {
	/*
	 * Player class with added function of key(ONLY used for Stage 5)
	 */
	
	//private variables for positions
	private int _row;
	private int _col;
	
	private Position _curPos;
	
	//private variable for sword, key, and whether Player is still alive
	private boolean _sword = false;
	private boolean _key = false;

	private boolean _isAlive = true;
	
	//Getters
	public int getRow() { return _row; }
	public int getCol() {return _col; }
	public Position getPosition() { return _curPos;	}	
	public boolean isAlive() { return _isAlive;	}
	public boolean giveSword() { return _sword; }
	public boolean giveKey() { return _key; }

	//Sets position given a position from param
	public void setPosition(Position p) {
		_curPos = p;
	}
	
	//Kills the player by setting isALive to false
	public void killPlayer2() {
		_isAlive = false;
	}
	
	//Gives the sword to the player and removes the sword from the map using the dead method from the Sword Class
	public boolean hasSword(Sword _s) {
		if(_curPos.getRow() == _s.getPosition().getRow() 
				&& _curPos.getCol() == _s.getPosition().getCol()) {
				_s.dead();
				_sword=true;
				return true;
			}
		return false;
	}
	
	//Same method but instead, gives key to the player and removes the key from the map using the deadKey() method from the Key Class
	public boolean hasKey(Key _k) {
		if(_curPos.getRow() == _k.getKey().getRow() 
				&& _curPos.getCol() == _k.getKey().getCol()) {
				_k.deadKey();
				_key=true;
				return true;
			}
		return false;
	}
	
	/*
	 * Method that is used when the player uses the key
	 * _key is set to false so the player does not have the key anymore
	 * Returns true since the player HAD the key
	 */
	public boolean hasKey1(Key _k) {
		_key = false;
		return true;
	}
	
	//Removes key by setting _key to false
	public void removeKey() {
		_key = false;
	}
	
	/*
	 * Method is used when the player uses the sword
	 * Same functionality as the hasKey1(Key _k) method
	 */
	public boolean hasSword1(Sword s) {
		_sword = false;
		return true;
	}
	
	//Removes the sword by 
	public void removeSword() {
		_sword = false;
	}
	
	//Constructor that initializes Player2's current position
	public Player2(Maze z) {
		_curPos = new Position(z.getStart().getRow(), z.getStart().getCol());
	}
	
	//The move method for the player that handles inputs and executes the direction the player can move
	public boolean move(Direction d, Maze z) {
		if (d == Direction.UP) {
			if (_curPos.getRow() - 1 >= 0) {
					//&& !z.getMaze()[_curPos.getRow() - 1][_curPos.getCol()]) {
				if(_curPos.getRow()-1>=0 && !z.getMaze()[_curPos.getRow()-1][_curPos.getCol()]) {
					_curPos = new Position(_curPos.getRow() - 1, _curPos.getCol());
				}
				else {
				_curPos = new Position(_curPos.getRow() - 1, _curPos.getCol());
				return true;
				}
			}
		} else if (d == Direction.DOWN) {
			if (_curPos.getRow() + 1 < z.getMaze().length ) {
					//&& !z.getMaze()[_curPos.getRow() + 1][_curPos.getCol()]) {
				_curPos = new Position(_curPos.getRow() + 1, _curPos.getCol());
				return true;
			}
		} else if (d == Direction.RIGHT) {
			if (_curPos.getCol() + 1 < z.getMaze()[_curPos.getRow()].length) {
					//&& !z.getMaze()[_curPos.getRow()][_curPos.getCol() + 1]) {
				_curPos = new Position(_curPos.getRow(), _curPos.getCol() + 1);
				return true;
			}
		} else {
			if (_curPos.getCol() - 1 >= 0 ) {
					//&& !z.getMaze()[_curPos.getRow()][_curPos.getCol() - 1]) {
				_curPos = new Position(_curPos.getRow(), _curPos.getCol() - 1);
				return true;
			}
		}
	
		return false;
		}
}
