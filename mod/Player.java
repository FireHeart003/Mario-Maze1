package Maze.mod;

import Maze.mod.Sword;
import Maze.mod.Direction;
import Maze.mod.Maze;
import Maze.mod.Position;

public class Player {
	/*
	 * A player class without any Key Function
	 */
	
	//private variables that revolve around player's current position
	private int _row;
	private int _col;
	
	private Position _curPos;
	
	//Private Variables for a sword that a player can have and whether the player is still alive
	private boolean _sword = false;
	private boolean _isAlive = true;
	
	//Getters
	public int getRow() { return _row; }
	public int getCol() {return _col; }
	public Position getPosition() {	return _curPos;	}
	public boolean isAlive() { return _isAlive;	}
	public boolean giveSword() { return _sword; }
	
	//Setter for position of player
	public void setPosition(Position p) {
		_curPos = p;
	}
	
	//Kills the player by setting isAlive to false
	public void killPlayer() {
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
	
	//When called, means that the sword was used and thus, the sword would need to be removed from the player
	public boolean hasSword1(Sword s) {
		_sword = false;
		return true;
	}
	
	//Removes sword by setting _sword to false
	public void removeSword() {
		_sword = false;
	}
	
	//Constructor initializing player's current position
	public Player(Maze z) {
		_curPos = new Position(z.getStart().getRow(), z.getStart().getCol());
	}
	
	//The move method for the player that handles inputs and executes the direction the player can move
	public boolean move(Direction d, Maze z) {
		if (d == Direction.UP) {
			if (_curPos.getRow() - 1 >= 0
					&& !z.getMaze()[_curPos.getRow() - 1][_curPos.getCol()]) {
				_curPos = new Position(_curPos.getRow() - 1, _curPos.getCol());
				return true;
			}
		} else if (d == Direction.DOWN) {
			if (_curPos.getRow() + 1 < z.getMaze().length 
					&& !z.getMaze()[_curPos.getRow() + 1][_curPos.getCol()]) {
				_curPos = new Position(_curPos.getRow() + 1, _curPos.getCol());
				return true;
			}
		} else if (d == Direction.RIGHT) {
			if (_curPos.getCol() + 1 < z.getMaze()[_curPos.getRow()].length
					&& !z.getMaze()[_curPos.getRow()][_curPos.getCol() + 1]) {
				_curPos = new Position(_curPos.getRow(), _curPos.getCol() + 1);
				return true;
			}
		} else {
			if (_curPos.getCol() - 1 >= 0 
					&& !z.getMaze()[_curPos.getRow()][_curPos.getCol() - 1]) {
				_curPos = new Position(_curPos.getRow(), _curPos.getCol() - 1);
				return true;
			}
		}
	
		return false;
		}
}