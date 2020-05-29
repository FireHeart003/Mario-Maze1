package Maze.mod;

public class Position {
	//Declare private instance variables for a row and col, which are what make up a position
	private int _row;
	private int _col;
	 
	//Getters
	public int getRow() { return _row; }
	public int getCol() { return _col; }
	
	//Constructor that intializes the row and column to the given parameters
	public Position(int r, int c) {
		_row = r;
		_col = c;
	}

}
