package Maze.mod;

public class Enemy {
	//This is for extra enemies, not specific
	//a current position, facing left, and isAlive ariable
	private Position _curPos1;
	
	private boolean _facingLeft = true;
	
	private boolean _isAlive1=true;
	
	//getter
	public boolean getIsAlive1() { return _isAlive1; }
	
	
	public Position getCactus1() { return _curPos1;	}
	
	//Enemy constructor for current position	
	public Enemy(Maze z) {
		_curPos1 = new Position(z.getEnemy().getRow(), z.getEnemy().getCol());
		
	}
	//Interchangeable move methods that function the same, just in different directions
	public void move2(Maze z) {
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
	public void move1(Maze z) {
		if (_facingLeft) {
			if (!z.getMaze()[_curPos1.getRow()-1][_curPos1.getCol() ]) {
				_curPos1 = new Position(_curPos1.getRow()-1, _curPos1.getCol() );
			} else {
				_curPos1 = new Position(_curPos1.getRow()+1, _curPos1.getCol() );
				_facingLeft = false;
			}
		} else {
			if (!z.getMaze()[_curPos1.getRow()+1][_curPos1.getCol()]) {
				_curPos1 = new Position(_curPos1.getRow()+1, _curPos1.getCol() );
			} else {
				_curPos1 = new Position(_curPos1.getRow()-1, _curPos1.getCol());
				_facingLeft = true;
			}
		}

		}
	
	//kills the enemy
		public void killCactus1() {
			// TODO Auto-generated method stub
			_isAlive1 = false;
			_curPos1 = new Position(2,0);
		}
}
