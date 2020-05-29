package Maze.cont;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Maze.mod.*;
import Maze.mod.Minotaur;
import Maze.mod.Player;
import Maze.mod.Question3;
import Maze.mod.Rat;
import Maze.mod.Sword;
import Maze.mod.Teleport;
import Maze.view.StringMap5;
import Maze.view.Window;

	public class Overseer5 {
		
		//Declare all private instance variables
		private int cnt = 20;
		private static StringMap5 _s;
		private static Maze _z;
		private static Minotaur2 _m;
		private static Player2 _p;
		private static Rat2 _r1;
		private static Rat2 _r2;
		private static Sword _sword;
		private static Lava l1,l2,l3,l4,l5,l6,l7;
		private static Question3 _q;
		private static Lock d1,d2;
		private static Key _k;
		private static Enemy dry;
		static boolean Level5 = true;
		private static Exclamation _ex;
		private static boolean lava = false;
		private static final String[] INVITATION = {"Enter", "Leave"};

		private static JPanel scene = new JPanel();

		//setter
		public static void setLevel5False() {
			Level5 = false;
		}
		public static void setLavaTrue() {
			lava = true;
		}
		public static void setLevel5True() {
			Level5 = true;
		}
		
		//getter for lava variable
		public static boolean getLava() {
			return lava;
		}
		
		//Static method that can be accessed from other classes. Starts world 5
		public static void STAGE5() {
			Overseer5.setLevel5True();
			_z = new Maze(4);
			_s = new StringMap5();
			final JFrame fram = new JFrame();
			_p = new Player2(_z);
			_q = new Question3();
			_q.question3pick();
			
			/*
			 *UPDATES THE MAP TO WORLD 5
			 *Sets up the JFrame and JPanel and updates the Map layout
			 *Perform the required actions when there are inputs from keyboard
			 *Functions the same as Overseer's constructor but without the introductions and a different world layout
			 */
		    scene = _s.updateMap(_p, _z, "", _m, _r1, _r2, _sword,l1,l2,l3,l4,l5,l6,l7, _q, _ex, _k, d1, d2, dry);
		    fram.setTitle("World 5 ");
		    fram.setVisible(true);
		    fram.setSize(800,800);
		    fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    fram.setResizable(false);
		    fram.add(scene);
		    fram.add(_s.getMap());
		    fram.addKeyListener(new KeyListener() {
		    	public void keyTyped(KeyEvent e) {}
		    	
		    	public void keyReleased(KeyEvent e) { }

		    	public void keyPressed(KeyEvent e) { 
		    		int input = e.getKeyCode();
		    		
		    		//W- UP
		    		if(input == KeyEvent.VK_W) {
		    			scene = _s.updateMap(_p, _z, "NORTH", _m, _r1, _r2, _sword,l1,l2,l3,l4,l5,l6,l7, _q, _ex, _k, d1, d2, dry);
			    		fram.add(scene);
			    		fram.revalidate();
			    		
			    		//used to dispose frame to start a new level/world
			    		if(Level5 == false) {
			    			fram.dispose();
			    		}
		    		}
		    		
		    		//S - DOWN
		    		else if(input == KeyEvent.VK_S) {
		    			scene = _s.updateMap(_p, _z, "SOUTH", _m, _r1, _r2, _sword,l1,l2,l3,l4,l5,l6,l7, _q, _ex, _k, d1, d2, dry);
			    		fram.add(scene);
			    		fram.revalidate();
			    		
			    		//used to dispose frame to start a new level/world
			    		if(Level5 == false) {
			    			fram.dispose();
			    		}
		    		}
		    		
		    		//D - RIGHT
		    		else if(input == KeyEvent.VK_D) {
		    			scene = _s.updateMap(_p, _z, "EAST", _m, _r1, _r2, _sword,l1,l2,l3,l4,l5,l6,l7, _q, _ex, _k, d1, d2, dry);
			    		fram.add(scene);
			    		fram.revalidate();
			    		
			    		//used to dispose frame to start a new level/world
			    		if(Level5 == false) {
			    			fram.dispose();
			    		}
		    		}
		    		
		    		//A - LEFT
		    		else if(input == KeyEvent.VK_A) {
		    			scene = _s.updateMap(_p, _z, "WEST", _m, _r1, _r2, _sword,l1,l2,l3,l4,l5,l6,l7, _q, _ex, _k, d1, d2, dry);
			    		fram.add(scene); 
			    		fram.revalidate();
			    		
			    		//used to dispose frame to start a new level/world
			    		if(Level5 == false) {
			    			fram.dispose();
			    		}	
		    		}
		    		
		    		//EXIT BUTTON
		    		else if(input == KeyEvent.VK_E) {
		    			Window.msg("You left Princess Peach alone! \nBowser has won, keeping Peach forever...");
		    			System.exit(0);
		    		}
		    		
		    		//HELP BUTTON
		    		else if(input == KeyEvent.VK_H) {
		    			Window.msg("HELP:"
		    					+ "\nUse W A S D keys to help you move around the maze."
		    					+ "\n Clicking E will exit the game, h will allow you to access help screen, and c for some neat credits."
		    					+ "Your goal is to make it to princess peach by traveling through each world and staying alive."
		    					+ "\n\n EXCLAMATION BLOCKS: Triggering it will either help you or give you an disadvantage....BEWARE!"
		    					+ "\n\n QUESTION BLOCKS: Not just any ordinary block with the traditional coins and power-ups." + 
		    										 "\n		-These cause questions to pop up. Getting them correct gives you 20 extra turns," + 
		    										 "\n		 but getting them incorrect decreases the number of turns Mario has by 10." + 
		    										 "\n		 -Leaving the question block empty results in getting it automatically wrong!!" + 
		    										 "\n *The whole Mushroom Kingdom depends on you...You got this Mario!!!*");
		    				//	+ "Not answering a question correctly will lead to uncertain DOOM...");
		    			
		    			//END CREDITS
		    			Window.msg("END CREDITS"
					+ "\n Code Outline: Me"
					+ "\n Game Ideas: Me"
					+ "\n  All Other Code: Nathan"
					+ "\n And Mario and Peach Lived Happily Ever After!"
					+ "The End");
		    			
		    		}
		    	};
		    	});
		    
		    	//Revalidates the frame
		    	fram.revalidate();
		    	
		    	//used to dispose frame to start a new level/world
		    	if(Level5 == false) {
	    			fram.dispose();
	    		}
		    }{
			//Initializes all private instance variables
		    	_z = new Maze(4);
				_s = new StringMap5();
				_p = new Player2(_z);
				_m = new Minotaur2(_z);
				l1 = new Lava(_z);
				l2 = new Lava(_z);
				l3 = new Lava(_z);
				_ex = new Exclamation(_z);
				l4 = new Lava(_z);
				l5 = new Lava(_z);
				l6 = new Lava(_z);
				l7 = new Lava(_z);
				d1= new Lock(_z);
				d2= new Lock(_z);
				_k= new Key(_z);
				dry = new Enemy(_z);
				_r1= new Rat2(_z);
				_r2= new Rat2(_z);
				_sword= new Sword(_z);
		    }
}
