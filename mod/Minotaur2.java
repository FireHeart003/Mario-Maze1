package Maze.mod;

public class Minotaur2 {
	//Another Minotaur class for the sake of GUI(displaying a different enemy but with the same function)
	
	//Declares private instance vars for currnet position and whether Minotaur2 is alive
	private Position _curPos;
	private boolean _isAlive;
	
	//Getters
	public Position getPosition() { return _curPos;	}
	public boolean getIsAlive() { return _isAlive; }
	
	//Constructor: initializes the private instance variables - Sets current position and sets the Minotaur2 to TRUE(ALIVE)
	public Minotaur2(Maze z) {
		_curPos = new Position( z.getMinotaur().getRow(), z.getMinotaur().getCol());
		_isAlive=true;
	}
	
	//Removes the Minotaur2
	public void killMinotaur() {
		_isAlive = false;
		_curPos = new Position(0,0);
	}
	
	//Sets position for Minotaur2
	public void setPosition(Position p) {
		_curPos = p;
	}
	
	//Move method for Minotaur2 with a tracking system to follow the Player
	public void move(Maze z, Player2 p){
        int distRow = _curPos.getRow() - p.getPosition().getRow();
        int distCol = _curPos.getCol() - p.getPosition().getCol();
        if(distRow > 0){
            if(!z.getMaze()[_curPos.getRow() - 1][_curPos.getCol()]){
                _curPos = new Position(_curPos.getRow()-1, _curPos.getCol());
            }
            else{
            	
                if(distCol > 0 && !z.getMaze()[_curPos.getRow()][_curPos.getCol()-1]){
                    _curPos = new Position(_curPos.getRow(), _curPos.getCol()-1);
                }
                else if(!z.getMaze()[_curPos.getRow()][_curPos.getCol() + 1]){
                    _curPos = new Position(_curPos.getRow(), _curPos.getCol()+1);
                }
                else if(!z.getMaze()[_curPos.getRow()][_curPos.getCol()-1]){
                    _curPos = new Position(_curPos.getRow(), _curPos.getCol()-1);
                }
                else{
                    _curPos = new Position(_curPos.getRow()+1, _curPos.getCol());
                }
            }
        }
        
        else if(distRow == 0){
        	
            if(distCol > 0 && !z.getMaze()[_curPos.getRow()][_curPos.getCol()-1]){
                _curPos = new Position(_curPos.getRow(), _curPos.getCol()-1);
            }
            else if(!z.getMaze()[_curPos.getRow()][_curPos.getCol() + 1]){
                _curPos = new Position(_curPos.getRow(), _curPos.getCol()+1);
            }
            else if(!z.getMaze()[_curPos.getRow()+1][ _curPos.getCol()]){
                _curPos = new Position(_curPos.getRow()+1, _curPos.getCol());
            }
            else if(!z.getMaze()[_curPos.getRow() - 1][_curPos.getCol()]){
                _curPos = new Position(_curPos.getRow()-1, _curPos.getCol());
            }
            else{
                _curPos = new Position(_curPos.getRow(), _curPos.getCol()-1);
            }
        }
		else{
            if(!z.getMaze()[_curPos.getRow()+1][_curPos.getCol()]){
                _curPos = new Position(_curPos.getRow()+1, _curPos.getCol());
            }
            else{
                if(distCol > 0 && !z.getMaze()[_curPos.getRow()][_curPos.getCol()-1]){
                    _curPos = new Position(_curPos.getRow(), _curPos.getCol()-1);
                }
                else if(!z.getMaze()[_curPos.getRow()][_curPos.getCol()+1]){
                    _curPos = new Position(_curPos.getRow(), _curPos.getCol()+1);
                }
                else if(!z.getMaze()[_curPos.getRow()][_curPos.getCol()-1]){
                    _curPos = new Position(_curPos.getRow(), _curPos.getCol()-1);
                }
                else{
                    _curPos = new Position(_curPos.getRow()-1, _curPos.getCol());
                }
            }
		}
	}
}
