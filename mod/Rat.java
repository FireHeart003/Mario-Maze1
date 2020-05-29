package Maze.mod;

import Maze.mod.Maze;
import Maze.mod.Position;

public class Rat {
	/*
	 * Another Rat class which is for enemies; where there is going to be 3 Enemies "produced" in the Class
	 */
	private Position _curPos1;
	private Position _curPos2;
	private Position _curPos3;
	
	private boolean _facingLeft = true;
	
	private boolean _isAlive1=true;
	private boolean _isAlive2=true;
	private boolean _isAlive3=true;
	
	//Getters for Each "Rat"
	public boolean getIsAlive1() { return _isAlive1; }
	public boolean getIsAlive2() { return _isAlive2; }
	public boolean getIsAlive3() { return _isAlive3; }
	public Position getPosition1() { return _curPos1;	}
	public Position getPosition2() { return _curPos2;	}
	public Position getPosition3() { return _curPos3;	}
	
	//Kill methods that set each rats positions to a wall so in a sense, killing them
	public void killRat1() {
		_isAlive1 = false;
		_curPos1 = new Position(2,0);
	}
	public void killRat2() {
		_isAlive2 = false;
		_curPos2 = new Position(1,0);
	}
	public void killRat3() {
		_isAlive3 = false;
		_curPos3 = new Position(0,1);
	}
	
	//Constructor initializign the rat's position
	public Rat(Maze z) {
		_curPos1 = new Position(z.getRat1().getRow(), z.getRat1().getCol());
		_curPos2 = new Position(z.getRat2().getRow(), z.getRat2().getCol());
		_curPos3 = new Position(z.getRat3().getRow(), z.getRat3().getCol());
		
	}
	
	/*
	 * Move method for the rat that allows it to move side to side, patrolling the hallways
	 * 3 Move method that corresponds with each rat
	 */
	public void move1(Maze z,  Player p) {
	        int distRow = _curPos1.getRow() - p.getPosition().getRow();
	        int distCol = _curPos1.getCol() - p.getPosition().getCol();
	        if(distRow > 0){
	            if(!z.getMaze()[_curPos1.getRow() - 1][_curPos1.getCol()]){
	                _curPos1 = new Position(_curPos1.getRow()-1, _curPos1.getCol());
	            }
	            else{
	            	
	                if(distCol > 0 && !z.getMaze()[_curPos1.getRow()][_curPos1.getCol()-1]){
	                    _curPos1 = new Position(_curPos1.getRow(), _curPos1.getCol()-1);
	                }
	                else if(!z.getMaze()[_curPos1.getRow()][_curPos1.getCol() + 1]){
	                    _curPos1 = new Position(_curPos1.getRow(), _curPos1.getCol()+1);
	                }
	                else if(!z.getMaze()[_curPos1.getRow()][_curPos1.getCol()-1]){
	                    _curPos1 = new Position(_curPos1.getRow(), _curPos1.getCol()-1);
	                }
	                else{
	                    _curPos1 = new Position(_curPos1.getRow()+1, _curPos1.getCol());
	                }
	            }
	        }
	        
	        else if(distRow == 0){
	        	
	            if(distCol > 0 && !z.getMaze()[_curPos1.getRow()][_curPos1.getCol()-1]){
	                _curPos1 = new Position(_curPos1.getRow(), _curPos1.getCol()-1);
	            }
	            else if(!z.getMaze()[_curPos1.getRow()][_curPos1.getCol() + 1]){
	            	_curPos1 = new Position(_curPos1.getRow(), _curPos1.getCol()+1);
	            }
	            else if(!z.getMaze()[_curPos1.getRow()+1][ _curPos1.getCol()]){
	            	_curPos1 = new Position(_curPos1.getRow()+1, _curPos1.getCol());
	            }
	            else if(!z.getMaze()[_curPos1.getRow() - 1][_curPos1.getCol()]){
	            	_curPos1 = new Position(_curPos1.getRow()-1, _curPos1.getCol());
	            }
	            else{
	            	_curPos1 = new Position(_curPos1.getRow(), _curPos1.getCol()-1);
	            }
	        }
			else{
	            if(!z.getMaze()[_curPos1.getRow()+1][_curPos1.getCol()]){
	            	_curPos1 = new Position(_curPos1.getRow()+1, _curPos1.getCol());
	            }
	            else{
	                if(distCol > 0 && !z.getMaze()[_curPos1.getRow()][_curPos1.getCol()-1]){
	                	_curPos1 = new Position(_curPos1.getRow(), _curPos1.getCol()-1);
	                }
	                else if(!z.getMaze()[_curPos1.getRow()][_curPos1.getCol()+1]){
	                	_curPos1 = new Position(_curPos1.getRow(), _curPos1.getCol()+1);
	                }
	                else if(!z.getMaze()[_curPos1.getRow()][_curPos1.getCol()-1]){
	                	_curPos1 = new Position(_curPos1.getRow(), _curPos1.getCol()-1);
	                }
	                else{
	                	_curPos1 = new Position(_curPos1.getRow()-1, _curPos1.getCol());
	                }
	            }
			}
		}
		public void move2(Maze z, Player p) {
		        int distRow = _curPos2.getRow() - p.getPosition().getRow();
		        int distCol = _curPos2.getCol() - p.getPosition().getCol();
		        if(distRow > 0){
		            if(!z.getMaze()[_curPos2.getRow() - 1][_curPos2.getCol()]){
		            	_curPos2 = new Position(_curPos2.getRow()-1, _curPos2.getCol());
		            }
		            else{
		            	
		                if(distCol > 0 && !z.getMaze()[_curPos2.getRow()][_curPos2.getCol()-1]){
		                	_curPos2 = new Position(_curPos2.getRow(), _curPos2.getCol()-1);
		                }
		                else if(!z.getMaze()[_curPos2.getRow()][_curPos2.getCol() + 1]){
		                	_curPos2 = new Position(_curPos2.getRow(), _curPos2.getCol()+1);
		                }
		                else if(!z.getMaze()[_curPos2.getRow()][_curPos2.getCol()-1]){
		                	_curPos2 = new Position(_curPos2.getRow(), _curPos2.getCol()-1);
		                }
		                else{
		                	_curPos2 = new Position(_curPos2.getRow()+1, _curPos2.getCol());
		                }
		            }
		        }
		        
		        else if(distRow == 0){
		        	
		            if(distCol > 0 && !z.getMaze()[_curPos2.getRow()][_curPos2.getCol()-1]){
		            	_curPos2 = new Position(_curPos2.getRow(), _curPos2.getCol()-1);
		            }
		            else if(!z.getMaze()[_curPos2.getRow()][_curPos2.getCol() + 1]){
		            	_curPos2 = new Position(_curPos2.getRow(), _curPos2.getCol()+1);
		            }
		            else if(!z.getMaze()[_curPos2.getRow()+1][ _curPos2.getCol()]){
		            	_curPos2 = new Position(_curPos2.getRow()+1, _curPos2.getCol());
		            }
		            else if(!z.getMaze()[_curPos2.getRow() - 1][_curPos2.getCol()]){
		            	_curPos2 = new Position(_curPos2.getRow()-1, _curPos2.getCol());
		            }
		            else{
		            	_curPos2 = new Position(_curPos2.getRow(), _curPos2.getCol()-1);
		            }
		        }
				else{
		            if(!z.getMaze()[_curPos2.getRow()+1][_curPos2.getCol()]){
		            	_curPos2 = new Position(_curPos2.getRow()+1, _curPos2.getCol());
		            }
		            else{
		                if(distCol > 0 && !z.getMaze()[_curPos2.getRow()][_curPos2.getCol()-1]){
		                	_curPos2 = new Position(_curPos2.getRow(), _curPos2.getCol()-1);
		                }
		                else if(!z.getMaze()[_curPos2.getRow()][_curPos2.getCol()+1]){
		                	_curPos2 = new Position(_curPos2.getRow(), _curPos2.getCol()+1);
		                }
		                else if(!z.getMaze()[_curPos2.getRow()][_curPos2.getCol()-1]){
		                	_curPos2 = new Position(_curPos2.getRow(), _curPos2.getCol()-1);
		                }
		                else{
		                	_curPos2 = new Position(_curPos2.getRow()-1, _curPos2.getCol());
		                }
		            }
				}
			}
		public void move3(Maze z, Player p) {
		        int distRow = _curPos3.getRow() - p.getPosition().getRow();
		        int distCol = _curPos3.getCol() - p.getPosition().getCol();
		        if(distRow > 0){
		            if(!z.getMaze()[_curPos3.getRow() - 1][_curPos3.getCol()]){
		            	_curPos3 = new Position(_curPos3.getRow()-1, _curPos3.getCol());
		            }
		            else{
		            	
		                if(distCol > 0 && !z.getMaze()[_curPos3.getRow()][_curPos3.getCol()-1]){
		                	_curPos3 = new Position(_curPos3.getRow(), _curPos3.getCol()-1);
		                }
		                else if(!z.getMaze()[_curPos3.getRow()][_curPos3.getCol() + 1]){
		                	_curPos3 = new Position(_curPos3.getRow(), _curPos3.getCol()+1);
		                }
		                else if(!z.getMaze()[_curPos3.getRow()][_curPos3.getCol()-1]){
		                	_curPos3 = new Position(_curPos3.getRow(), _curPos3.getCol()-1);
		                }
		                else{
		                	_curPos3 = new Position(_curPos3.getRow()+1, _curPos3.getCol());
		                }
		            }
		        }
		        
		        else if(distRow == 0){
		        	
		            if(distCol > 0 && !z.getMaze()[_curPos3.getRow()][_curPos3.getCol()-1]){
		            	_curPos3 = new Position(_curPos3.getRow(), _curPos3.getCol()-1);
		            }
		            else if(!z.getMaze()[_curPos3.getRow()][_curPos3.getCol() + 1]){
		            	_curPos3 = new Position(_curPos3.getRow(), _curPos3.getCol()+1);
		            }
		            else if(!z.getMaze()[_curPos3.getRow()+1][ _curPos3.getCol()]){
		            	_curPos3 = new Position(_curPos3.getRow()+1, _curPos3.getCol());
		            }
		            else if(!z.getMaze()[_curPos3.getRow() - 1][_curPos3.getCol()]){
		            	_curPos3 = new Position(_curPos3.getRow()-1, _curPos3.getCol());
		            }
		            else{
		            	_curPos3 = new Position(_curPos3.getRow(), _curPos3.getCol()-1);
		            }
		        }
				else{
		            if(!z.getMaze()[_curPos3.getRow()+1][_curPos3.getCol()]){
		            	_curPos3 = new Position(_curPos3.getRow()+1, _curPos3.getCol());
		            }
		            else{
		                if(distCol > 0 && !z.getMaze()[_curPos3.getRow()][_curPos3.getCol()-1]){
		                	_curPos3 = new Position(_curPos3.getRow(), _curPos3.getCol()-1);
		                }
		                else if(!z.getMaze()[_curPos3.getRow()][_curPos3.getCol()+1]){
		                	_curPos3 = new Position(_curPos3.getRow(), _curPos3.getCol()+1);
		                }
		                else if(!z.getMaze()[_curPos3.getRow()][_curPos3.getCol()-1]){
		                	_curPos3 = new Position(_curPos3.getRow(), _curPos3.getCol()-1);
		                }
		                else{
		                	_curPos3 = new Position(_curPos3.getRow()-1, _curPos3.getCol());
		                }
		            }
				}
			}
}
