package Maze.cont;

	import java.awt.event.KeyEvent;
	import java.awt.event.KeyListener;

	import javax.swing.ImageIcon;
	import javax.swing.JFrame;
	import javax.swing.JPanel;

import Maze.mod.Cactus;
import Maze.mod.Maze;
	import Maze.mod.Minotaur;
	import Maze.mod.Player;
import Maze.mod.Question2;
import Maze.mod.Rat;
	import Maze.mod.Sword;
	import Maze.mod.Teleport;
	import Maze.view.StringMap3;
	import Maze.view.Window;

		public class Overseer3 {
			
			//declares all private instance variables for world 3
			private int cnt = 20;
			private static StringMap3 _s;
			private static Maze _z;
			private static Minotaur _m;
			private static Player _p;
			private static Rat _r1;
			private static Rat _r2;
			private static Cactus _cact1;
			private static Cactus _cact2;
			private static Sword _sword;
			private static Question2 _q;
			static boolean Level3 = true;


			private static final String[] INVITATION = {"Enter", "Leave"};

			private static JPanel scene = new JPanel();
			
			//setters
			public static void setLevel3False() {
				Level3 = false;
			}
			public static void setLevel3True() {
				Level3 = true;
			}
			
			/*
			 * Static method so that this stage can be started from another class
			 * Starts world 3
			 */
			public static void STAGE3() {
				Overseer3.setLevel3True();
				_z = new Maze(2);
				_s = new StringMap3();
				final JFrame fram = new JFrame();
				_p = new Player(_z);
				_q = new Question2();
				_q.questionpickL3();
				
		    	/*
				 *UPDATES THE MAP TO WORLD 3
				 *Sets up the JFrame and JPanel; updates the map layout
				 *Perform the required actions when there are inputs from keyboard
				 *Functions the same as Overseer's constructor but without the introductions and a different world layout
				 */
			    scene = _s.updateMap(_p, _z, "", _m, _r1, _r2, _sword, _q, _cact1, _cact2);
			    fram.setTitle("World 3");
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
			    		
			    		//W - UP
			    		if(input == KeyEvent.VK_W) {
			    			scene = _s.updateMap(_p, _z, "NORTH", _m, _r1, _r2, _sword, _q, _cact1, _cact2);
				    		fram.add(scene);
				    		fram.revalidate();
				    		
				    		//used to dispose frame to start a new level/world
				    		if(Level3==false) {
				    			fram.dispose();
				    		}
			    		}
			    		
			    		//S - DOWN
			    		else if(input == KeyEvent.VK_S) {
			    			scene = _s.updateMap(_p, _z, "SOUTH", _m, _r1, _r2, _sword, _q, _cact1, _cact2);
				    		fram.add(scene);
				    		fram.revalidate();
				    		
				    		//used to dispose frame to start a new level/world
				    		if(Level3==false) {
				    			fram.dispose();
				    		}
			    		}
			    		
			    		//D - RIGHT
			    		else if(input == KeyEvent.VK_D) {
			    			scene = _s.updateMap(_p, _z, "EAST", _m, _r1, _r2, _sword, _q, _cact1, _cact2);
				    		fram.add(scene);
				    		fram.revalidate();
				    		
				    		//used to dispose frame to start a new level/world
				    		if(Level3==false) {
				    			fram.dispose();
				    		}
			    		}
			    		
			    		//A - LEFT
			    		else if(input == KeyEvent.VK_A) {
			    			scene = _s.updateMap(_p, _z, "WEST", _m, _r1, _r2, _sword, _q, _cact1, _cact2);
				    		fram.add(scene); 
				    		fram.revalidate();
				    		
				    		//used to dispose frame to start a new level/world
				    		if(Level3==false) {
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
			    		}
			    	
			    	//CREDITS BUTTON
			    	else if(input == KeyEvent.VK_C) {
			    			Window.msg("END CREDITS"
						+ "\n Code Outline: Me"
						+ "\n Game Ideas: Me"
						+ "\n  All Other Code: Nathan"
						+ "\n And Mario and Peach Lived Happily Ever After!"
						+ "The End");
			    			
			    		}
			    	};
			    	});
			    	fram.revalidate();
			    	
			    	//used to dispose frame to start a new level/world
			    	if(Level3==false) {
		    			fram.dispose();
		    		}
			    }{
				
			    	//Initializes the instance variables
			    	_z = new Maze(2);
					_s = new StringMap3();
					_p = new Player(_z);
					_m = new Minotaur(_z);
					_r1= new Rat(_z);
					_r2= new Rat(_z);
					_cact1= new Cactus(_z);
					_cact2= new Cactus(_z);
					_sword= new Sword(_z);
			    }
}
