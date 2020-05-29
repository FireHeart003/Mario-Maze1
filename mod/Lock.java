package Maze.mod;

public class Lock {
	//private variables to see if lock is still on the map and the current position of the lock
	private Position _curPos1;
	private Position _curPos2;
	
	private boolean _isAlive1=true;
	private boolean _isAlive2=true;

	
	//getters
	public boolean getIsAlive1() { return _isAlive1; }
	public boolean getIsAlive2() { return _isAlive2; }
	
	public Position getLock1() { return _curPos1;	}
	public Position getLock2() { return _curPos2;	}
	
	/*
	 * Sets the lock to a position that is a wall; removes the lock from the map
	 * Both kill methods function the same, one for each lock
	 */
	public void killLock1() {
		_isAlive1 = false;
		_curPos1 = new Position(0,0);
	}
	public void killLock2() {
		_isAlive2 = false;
		_curPos2 = new Position(0,0);
	}

	/*
	 * Constructor initializing current position variables for each lock
	 */
	public Lock(Maze z) {
		_curPos1 = new Position(z.getLock1().getRow(), z.getLock1().getCol());
		_curPos2 = new Position(z.getLock2().getRow(), z.getLock2().getCol());
	}
}
