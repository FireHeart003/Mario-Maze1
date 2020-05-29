package Maze.mod;

import Maze.mod.Position;

public class Maze {
	
	/*
	 * The class where all positions for player, enemies, and any other features are set up
	 */

	//Maze made of booleans, false = space, true = wall
	private boolean[][] _maze;
	
	//The below are all positions for the first world/level
	private Position _aPlayer= new Position(19,13);
			
	private Position _aExit= new Position(6,1);
	
	private Position _aMinotaur=new Position(1,19);
	
	private Position _aRat1= new Position(19,2);
	
	private Position _aRat2= new Position(19,11);
	
	private Position _aRat3= new Position(10,15);
	
	private Position _aSword= new Position(13,17);
	
	private Position _aTeleport = new Position(19,19);
	
	//Getters
	public Position getTeleport() { return _aTeleport; }
	
	public Position getStart() { return _aPlayer; }
	
	public Position getEnd() { return _aExit; }
	
	public Position getMinotaur() { return _aMinotaur;}
	
	public Position getRat1() { return _aRat1; }
	
	public Position getRat2() { return _aRat2; }
	
	public Position getRat3() { return _aRat3; }
	
	public Position getSword() {return _aSword; }
		
	public boolean[][] getMaze() { return _maze; }
	
	/*
	 * The things that do not appear in world 1 are only declared since they may be used again
	 */
	private Position _aEx = new Position(13,7);
	public Position getEx() { return _aEx; }
	
	private Position _aCactus;
	public Position getCactus1() { return _aCactus; }
	
	private Position _aCactus2;
	public Position getCactus2() { return _aCactus2; }
	
	private Position _aEnemy;
	public Position getEnemy() { return _aEnemy; }
	
	//Lava Positions and their getters
	private Position _aLava1;
	private Position _aLava2;
	private Position _aLava3;
	private Position _aLava4;
	private Position _aLava5;
	private Position _aLava6;
	private Position _aLava7;
	
	public Position getLava1() { return _aLava1; }
	public Position getLava2() { return _aLava2; }
	public Position getLava3() { return _aLava3; }
	public Position getLava4() { return _aLava4; }
	public Position getLava5() { return _aLava5; }
	public Position getLava6() { return _aLava6; }
	public Position getLava7() { return _aLava7; }
	
	//Same thing but for key and doors ~ Declare the Private instance variables and their Getters
	private Position _aKey;
	private Position _aDoor1;
	private Position _aDoor2;
	
	public Position getKey() {
		return _aKey;
	}
	
	public Position getLock1() {
		return _aDoor1;
	}
	public Position getLock2() {
		return _aDoor2;
	}
	
	/*
	 * Constructor that creates a different map depending on the int parameter
	 * The first map came from the first maze project so it uses getters
	 * The rest of the maps have positions accordingly to the 2d boolean maze created for that map
	 * All vars are initialized with a position 
	 */
	public Maze(int x) {
		// true is a wall.21x21
		//WORLD 1
		if(x==0) {
		boolean[][] maze = {
		
		{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true},
		 {true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true},
		 {true, false, true, true, true, false, true, true, true, false, true, false, true, true, true, true, true, false, true, false, true},
		 {true, false, true, false, false, false, false, false, true, false, true, false, false, false, false, false, true, false, false, false, true},
		 {true, false, true, false, true, false, true, true, true, true, true, false, true, false, true, false, true, false, true, true, true},
		 {true, false, true, false, true, false, false, false, true, true, true, false, true, false, true, false, true, false, false, false, true},
		 {true, false, true, false, true, false, true, false, false, false, true, false, true, false, true, true, true, false, true, false, true},
		 {true, true, true, false, true, false, true, false, true, false, true, false, true, false, false, false, true, false, true, false, true},
		 {true, false, false, false, true, false, true, false, true, false, true, false, true, false, false, false, true, false, true, false, true},
		 {true, false, true, true, true, true, true, false, true, false, true, false, true, true, true, true, true, false, true, false, true},
		 {true, false, false, false, true, false, false, false, true, false, true, false, false, false, true, false, true, false, true, false, true},
		 {true, false, false, false, true, false, true, false, true, false, true, false, false, true, true, false, true, false, true, false, true},
		 {true, false, true, true, true, false, true, false, true, false, true, false, false, false, false, false, true, true, true, false, true},
		 {true, false, true, false, true, false, true, false, true, false, true, false, false, false, false, true, true, false, true, false, true},
		 {true, false, true, false, true, false, true, true, true, false, true, true, true, true, true, true, true, false, true, false, true},
		 {true, false, false, false, true, false, false, false, false, false, false, false, true, true, true, false, false, false, true, false, true},
		 {true, false, true, true, true, true, true, true, true, true, true, false, true, true, true, false, false, false, true, false, true},
		 {true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, true, false, true},
		 {true, false, true, true, false, true, true, true, true, false, true, false, true, true, true, true, true, false, true, false, true},
		 {true, false, false, true, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, true},
		 {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true}}
		;
		_maze = maze;
		_aPlayer= new Position(_aPlayer.getRow(), _aPlayer.getCol());
		_aExit= new Position(_aExit.getRow(), _aExit.getCol());
		
		_aMinotaur= new Position(_aMinotaur.getRow(), _aMinotaur.getCol());
		
		_aRat1= new Position(_aRat1.getRow(), _aRat1.getCol());
		_aRat2= new Position(_aRat2.getRow(), _aRat2.getCol());
		_aRat3= new Position(_aRat3.getRow(), _aRat3.getCol());
		
		_aSword= new Position(_aSword.getRow(), _aSword.getCol());
		_aTeleport = new Position(_aTeleport.getRow(), _aTeleport.getCol());
		_aEx = new Position(_aEx.getRow(), _aEx.getCol());
		}
		
		//WORLD 2
		if(x==1) {
		boolean[][] maze2 =
			{{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true},
				 {true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true},
				 {true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true},
				 {true, true, true, true, true, false, true, true, true, false, false, true, true, true, true, true, true, false, false, false, true},
				 {true, false, false, false, true, false, false, false, true, false, false, false, false, true, true, false, false, false, false, false, true},
				 {true, true, true, false, true, false, false, false, true, true, true, true, false, true, true, false, false, false, true, true, true},
				 {true, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, true, false, true},
				 {true, false, false, false, false, false, false, false, false, false, true, false, false, true, true, true, true, false, true, false, true},
				 {true, false, false, false, true, true, true, true, true, false, true, false, false, true, true, false, false, false, true, false, true},
				 {true, false, false, false, true, false, true, false, true, false, true, false, false, false, false, false, false, false, true, false, true},
				 {true, false, false, false, true, false, true, false, false, false, true, true, true, false, false, false, false, false, false, false, true},
				 {true, true, true, true, true, false, true, false, true, false, false, false, true, true, true, true, true, true, true, false, true},
				 {true, false, false, false, false, false, true, false, false, false, true, true, true, false, false, false, false, false, true, false, true},
				 {true, false, false, true, true, true, true, true, false, false, true, false, false, false, false, false, true, false, false, false, true},
				 {true, false, false, true, false, false, false, false, false, false, true, false, false, false, true, false, true, false, false, false, true},
				 {true, false, false, true, false, false, false, false, false, false, true, false, false, false, true, false, true, true, true, true, true},
				 {true, false, false, true, true, false, true, true, true, true, true, true, true, true, true, false, true, false, false, false, true},
				 {true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true},
				 {true, false, false, true, true, true, true, true, true, true, false, true, true, false, false, true, false, false, false, false, true},
				 {true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, true, false, false, false, false, true},
				 {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true}
		};
		_maze = maze2;
		_aPlayer= new Position(1,1);
		_aExit= new Position(9,5);
		
		_aMinotaur= new Position(1,19);
		
		_aRat1= new Position(15,11);
		_aRat2= new Position(19,8);
		_aRat3= new Position(19,19);
		
		_aSword=new Position(9,11);
		_aCactus=new Position(14,4);
		_aCactus2 = new Position (6,1);

		}
		
		//WORLD 3
		if(x==2) {
			boolean[][] maze3 = {{true, true, true, true, true, true, true, false, false, true, false, true, true, true, true, true, true, true, true, true, true},
					 {true, false, false, false, false, false, true, false, false, true, false, true, false, true, false, false, false, false, false, false, true},
					 {true, false, true, false, true, false, true, true, true, true, true, true, false, true, true, true, false, false, true, false, true},
					 {true, false, true, false, true, false, false, false, false, true, true, true, false, false, false, false, false, false, true, false, true},
					 {true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, true, true, false, true},
					 {true, false, true, false, true, true, true, true, true, false, true, true, true, false, true, false, false, false, true, false, true},
					 {true, false, true, false, false, false, false, true, false, false, false, false, false, false, true, false, false, false, true, false, true},
					 {true, false, true, false, true, false, false, true, false, true, true, true, false, true, false, false, false, false, false, false, true},
					 {true, false, false, false, true, false, false, false, false, true, false, true, false, true, false, true, false, true, false, false, true},
					 {true, true, true, true, true, true, true, true, false, false, false, true, false, true, false, true, true, true, false, false, true},
					 {true, true, true, true, true, true, true, true, false, false, false, true, false, true, false, true, false, false, false, false, true},
					 {true, false, false, false, true, false, false, false, false, true, false, true, false, true, false, true, true, true, false, false, true},
					 {true, false, false, false, true, false, false, true, false, true, true, true, false, true, false, true, false, true, false, false, true},
					 {true, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true},
					 {true, false, true, false, true, true, true, true, true, false, true, true, true, false, true, false, false, false, true, false, true},
					 {true, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, true, false, true},
					 {true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, true, true, false, true},
					 {true, false, true, false, true, false, false, false, false, true, true, true, false, false, false, false, false, false, true, false, true},
					 {true, false, true, false, true, false, true, true, true, true, true, true, false, true, true, true, false, false, true, false, true},
					 {true, false, false, false, false, false, true, false, false, true, false, true, false, true, false, false, false, false, false, false, true},
					 {true, true, true, true, true, true, true, false, false, true, false, true, true, true, true, true, true, true, true, true, true}
		};
			_maze = maze3;
			_aPlayer= new Position(1,19);
			_aExit= new Position(11,10);
			
			_aMinotaur= new Position(6,1);
			
			_aRat1= new Position(2,3);
			_aRat2= new Position(19,14);
			_aCactus= new Position(11,5);
			_aCactus2 = new Position(15,3);
			_aSword=new Position(18,3);
		}
		
		//WORLD 4
		if(x==3) {
			boolean[][] maze4 = {
					{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true},
						 {true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, true},
						 {true, false, true, true, true, true, true, true, false, true, true, true, true, true, true, true, false, true, true, true, true},
						 {true, false, true, false, false, false, false, true, false, true, true, true, true, true, true, true, false, false, true, false, true},
						 {true, false, true, false, true, true, false, true, false, false, false, false, false, false, true, true, true, false, true, false, true},
						 {true, true, true, false, true, true, false, false, false, false, true, true, true, false, true, true, false, false, true, false, true},
						 {true, false, false, false, true, true, true, true, true, true, true, false, false, false, true, false, false, true, true, false, true},
						 {true, false, true, true, true, true, false, false, false, true, true, false, true, true, true, false, true, true, false, false, true},
						 {true, false, true, false, false, false, false, true, false, false, false, false, true, true, true, false, true, false, false, false, true},
						 {true, false, true, true, true, true, false, true, false, true, true, true, true, true, false, false, false, false, true, true, true},
						 {true, false, true, true, true, true, false, true, false, false, false, false, false, true, true, true, true, false, false, false, true},
						 {true, false, false, false, false, false, false, true, true, true, true, true, false, true, false, false, true, false, true, true, true},
						 {true, false, true, true, true, true, true, true, false, false, false, true, false, true, true, false, true, false, true, false, true},
						 {true, false, true, true, true, true, false, true, false, true, false, true, false, false, false, false, true, false, true, false, true},
						 {true, false, false, false, false, true, false, true, false, true, false, true, false, true, false, true, true, false, true, false, true},
						 {true, false, true, true, false, true, false, false, false, true, false, true, false, true, false, false, true, false, true, false, true},
						 {true, true, true, true, false, true, false, true, true, true, false, true, false, true, true, false, true, false, false, false, true},
						 {true, false, false, false, false, true, false, true, false, false, false, true, false, true, true, false, true, false, false, false, true},
						 {true, false, true, true, true, true, false, true, false, true, true, true, false, true, true, false, true, true, true, false, true},
						 {true, false, false, false, false, false, false, true, false, false, false, false, false, true, false, false, false, false, false, false, true},
						 {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true}
			};
			_maze = maze4;
			_aPlayer= new Position(10,19);
			_aExit= new Position(8,3);
			
			_aMinotaur= new Position(6,15);
			
			_aRat1= new Position(19,8);
			_aRat2= new Position(1,19);
			_aRat3= new Position(1,1);
			
			_aEnemy = new Position(15,1);
			_aSword=new Position(11,14);
			_aEx = new Position(10,12);
			
		}
		
		//WORLD 5
		if(x==4) {
			boolean[][] maze5 = {{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true},
					 {true, true, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, true, true},
					 {true, true, false, true, false, true, false, true, true, true, true, true, true, true, true, true, true, true, false, true, true},
					 {true, true, false, true, false, true, false, true, true, true, true, true, false, false, false, false, false, true, false, true, true},
					 {true, true, false, true, false, true, false, true, true, true, true, true, true, true, true, true, false, true, false, true, true},
					 {true, true, false, true, false, true, false, false, false, false, false, false, false, true, true, true, false, true, false, true, true},
					 {true, true, false, true, true, true, true, true, false, true, true, true, false, true, true, true, false, true, false, true, true},
					 {true, true, false, false, false, false, false, true, false, true, true, true, false, true, true, true, false, false, false, true, true},
					 {true, true, false, true, true, true, false, true, false, true, true, true, false, true, true, true, false, true, true, true, true},
					 {true, true, false, true, false, true, false, false, false, true, true, true, false, true, true, true, false, false, false, false, true},
					 {true, true, false, true, false, true, true, true, false, false, false, false, true, true, false, true, false, true, true, true, true},
					 {true, true, false, true, false, true, true, true, true, true, true, false, true, true, false, true, false, false, false, true, true},
					 {true, true, false, true, false, true, true, true, true, true, true, false, true, true, false, true, false, true, false, true, true},
					 {true, false, false, true, false, true, true, true, true, true, true, false, true, true, false, true, false, true, false, true, true},
					 {true, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, true},
					 {true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true},
					 {true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, true},
					 {true, true, false, true, true, false, true, true, false, true, true, false, true, true, false, true, true, true, false, true, true},
					 {true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true},
					 {true, true, false, false, false, false, false/*true*/, false, false, false, false, false, false, false, false, false, false, false, false, true, true},
					 {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true}
			};
			
			_maze = maze5;
			_aPlayer= new Position(9,19);
			_aExit= new Position(13,1);
			
			_aMinotaur= new Position(19,7);
			
			_aRat1= new Position(16,16);
			_aEnemy= new Position(5,6);
			_aRat2= new Position(1,15);
			
			_aSword=new Position(3,12);
			 _aLava1 = new Position(10,8);
			 _aLava2 = new Position(10,9);
			 _aLava3 = new Position(10,10);
			 _aLava4 = new Position(10,11);
			 _aLava5 = new Position(11,11);
			 _aLava6 = new Position(12,11);
			 _aLava7 = new Position(13,11);
			 _aEx = new Position(14,10);
			 
			 _aKey = new Position(6,12);
			 _aDoor1 = new Position(11,2);
			_aDoor2 = new Position(15,2);	 
				
			
		}
	}
}