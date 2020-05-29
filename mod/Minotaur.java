package Maze.mod;

import Maze.mod.Maze;
import Maze.mod.Player;
import Maze.mod.Position;

public class Minotaur {
	/*
	 * Another Class for an Enemy
	 * Would have been more efficient with polymorphism and having an abstract Enemy class with Inheritance etc
	 * Basically the same thing as other enemies such as Cactus and Enemy class
	 */
	
	//private var for current position and whether Minotaur is still alive
	private Position _curPos;
	private boolean _isAlive;
	
	//Getters
	public Position getPosition() { return _curPos;	}
	public boolean getIsAlive() { return _isAlive; }
	
	//Constructor that initializes the Minotaur to be alive and set a current position for it
	public Minotaur(Maze z) {
		_curPos = new Position( z.getMinotaur().getRow(), z.getMinotaur().getCol());
		_isAlive=true;
	}
	
	//Kills the Minotaur to a wall so that it can no longer move nor will be seen anymore(covered by a wall)
	public void killMinotaur() {
		_isAlive = false;
		_curPos = new Position(0,0);
	}
	
	//Sets the position when given a position in param
	public void setPosition(Position p) {
		_curPos = p;
	}
	
	//Move method for the minotaur that tracks the player so that the minotaur "chases" the player
	public void move(Maze z, Player p){
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
