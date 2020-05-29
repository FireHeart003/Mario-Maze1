package Maze.mod;

import Maze.mod.*;

public class Cactus {
	//Declare private instance variables and initialize
	
	//Current position vars
	private Position _curPos1;
	private Position _curPos2;
	
	//Facing left to see direction of the Cactus
	private boolean _facingLeft = true;
	
	//To see if both cactus enemies are alive
	private boolean _isAlive1=true;
	private boolean _isAlive2=true;
	
	//getters
	public boolean getIsAlive1() { return _isAlive1; }
	public boolean getIsAlive2() { return _isAlive2; }
	
	
	public Position getCactus1() { return _curPos1;	}
	public Position getCactus2() { return _curPos2;	}
	
	
	//kills the cactus and removes it from the map by placing at a wall where 
	public void killCactus2() {
		_isAlive2 = false;
		_curPos2 = new Position(1,0);
	}

	//initializes the positions of cactus
	public Cactus(Maze z) {
		_curPos1 = new Position(z.getCactus1().getRow(), z.getCactus1().getCol());
		_curPos2 = new Position(z.getCactus2().getRow(), z.getCactus2().getCol());
		
	}
	
	//move method for the cactus
	public void move1(Maze z) {
		if (_facingLeft) {
			if (!z.getMaze()[_curPos1.getRow()][_curPos1.getCol() - 1]) {
				_curPos1 = new Position(_curPos1.getRow(), _curPos1.getCol() - 1);
			} else {
				_curPos1 = new Position(_curPos1.getRow(), _curPos1.getCol() + 1);
				_facingLeft = false;
			}
		} else {
			if (!z.getMaze()[_curPos1.getRow()][_curPos1.getCol() + 1]) {
				_curPos1 = new Position(_curPos1.getRow(), _curPos1.getCol() + 1);
			} else {
				_curPos1 = new Position(_curPos1.getRow(), _curPos1.getCol() - 1);
				_facingLeft = true;
			}
		}

		}
		public void move2(Maze z) {
			if (_facingLeft) {
				if (!z.getMaze()[_curPos2.getRow()][_curPos2.getCol() - 1]) {
					_curPos2 = new Position(_curPos2.getRow(), _curPos2.getCol() - 1);
				} else {
					_curPos2 = new Position(_curPos2.getRow(), _curPos2.getCol() + 1);
					_facingLeft = false;
				}
			} else {
				if (!z.getMaze()[_curPos2.getRow()][_curPos2.getCol() + 1]) {
					_curPos2 = new Position(_curPos2.getRow(), _curPos2.getCol() + 1);
				} else {
					_curPos2 = new Position(_curPos2.getRow(), _curPos2.getCol() - 1);
					_facingLeft = true;
				}

			}
	}
		//kills the cactus and moves it to a position that is a wall so it does not move and is not displayed
		public void killCactus1() {
			// TODO Auto-generated method stub
			_isAlive1 = false;
			_curPos1 = new Position(2,0);
		}
}
