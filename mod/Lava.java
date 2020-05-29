package Maze.mod;

public class Lava {
	
	//For each lava positions that are in World 5
	//Declare all private instance variable for each lava position: current position and whether it is still on the map(isAlive)
	private Position _curPos1;
	private Position _curPos2;
	private Position _curPos3;
	private Position _curPos4;
	private Position _curPos5;
	private Position _curPos6;
	private Position _curPos7;

	private boolean _isAlive1=true;
	private boolean _isAlive2=true;
	private boolean _isAlive3=true;
	private boolean _isAlive4=true;
	private boolean _isAlive5=true;
	private boolean _isAlive6=true;
	private boolean _isAlive7=true;

	//getters
	public boolean getIsAlive1() { return _isAlive1; }
	public boolean getIsAlive2() { return _isAlive2; }
	public boolean getIsAlive3() { return _isAlive3; }
	public boolean getIsAlive4() { return _isAlive4; }
	public boolean getIsAlive5() { return _isAlive5; }
	public boolean getIsAlive6() { return _isAlive6; }
	public boolean getIsAlive7() { return _isAlive7; }

	
	public Position getLava1() { return _curPos1;	}
	public Position getLava2() { return _curPos2;	}
	public Position getLava3() { return _curPos3;	}
	public Position getLava4() { return _curPos4;	}
	public Position getLava5() { return _curPos5;	}
	public Position getLava6() { return _curPos6;	}
	public Position getLava7() { return _curPos7;	}

	//"Deaders" - Basically causes the lava to dissapear by setting the lava to a position that is a wall so it is not visible
	public void dead1() {
		_curPos1= new Position(0,0);
		}
	public void dead2() {
		_curPos2= new Position(0,0);
		}
	public void dead3() {
		_curPos3= new Position(0,0);
		}
	public void dead4() {
		_curPos4= new Position(0,0);
		}
	public void dead5() {
		_curPos5= new Position(0,0);
		}
	public void dead6() {
		_curPos6= new Position(0,0);
		}
	public void dead7() {
		_curPos7= new Position(0,0);
		}
	
	//setters
	public void setFalse1() {
		_isAlive1 = false;
	}

	public void setFalse2() {
		_isAlive2 = false;
	}

	public void setFalse3() {
		_isAlive3 = false;
	}

	public void setFalse4() {
		_isAlive4 = false;
	}

	public void setFalse5() {
		_isAlive5 = false;
	}

	public void setFalse6() {
		_isAlive6 = false;
	}

	public void setFalse7() {
		_isAlive7 = false;
	}
	
	//Constructor setting the position for each "tile" of lava
	public Lava(Maze z) {
		_curPos1 = new Position(z.getLava1().getRow(), z.getLava1().getCol());
		_curPos2 = new Position(z.getLava2().getRow(), z.getLava2().getCol());
		_curPos3 = new Position(z.getLava3().getRow(), z.getLava3().getCol());
		_curPos4 = new Position(z.getLava4().getRow(), z.getLava4().getCol());
		_curPos5= new Position(z.getLava5().getRow(), z.getLava5().getCol());
		_curPos6 = new Position(z.getLava6().getRow(), z.getLava6().getCol());
		_curPos7 = new Position(z.getLava7().getRow(), z.getLava7().getCol());


	}
}
