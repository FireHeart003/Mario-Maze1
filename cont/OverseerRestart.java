package Maze.cont;

	import java.awt.event.KeyEvent;
	import java.awt.event.KeyListener;

	import javax.swing.ImageIcon;
	import javax.swing.JFrame;
	import javax.swing.JPanel;

	import Maze.mod.Maze;
	import Maze.mod.Minotaur;
	import Maze.mod.Player;
	import Maze.mod.Question;
	import Maze.mod.Rat;
	import Maze.mod.Sword;
	import Maze.mod.*;
	import Maze.view.StringMap1;
	import Maze.view.Window;

		public class OverseerRestart {
			/*
			 * A repeat of the Overseer class without the additional story/introduction
			 */
						
			//Declares all private instance variables
			private int cnt = 20;
			private StringMap1 _s;
			private Maze _z;
			private Minotaur _m;
			private Player _p;
			private Question _q;
			private Rat _r1;
			private Rat _r2;
			private Rat _r3;
			private Sword _sword;
			private Exclamation _ex;
			private Teleport _teleport;
			static boolean Level1 = true;
			
			//Images to be used
			private ImageIcon home =  new ImageIcon((getClass().getResource("begin.jpg")));
			private ImageIcon world1 =  new ImageIcon((getClass().getResource("world1.jpg")));
			private ImageIcon bows =  new ImageIcon((getClass().getResource("bows.png")));
			private ImageIcon kidnap =  new ImageIcon((getClass().getResource("kidnap.png")));

			private static final String[] INVITATION = {"LET's GO!", "Ma ma Mia! I cannot do this! Mario: Leaves the Mushroom Kingdom..."};

			private static JPanel scene = new JPanel();
			
			static boolean restart = false;
			
			//setter
			public static void setLevelFalse1() {
				Level1 = false;
			}

			//Restart message
			public void restartHome() {
				Window.msg("Same RULES APPLY. You got this Mario. This is your ONLY chance to make things right!");
			}
			public static boolean restart(){
				return restart;
			}
			public static void setRestart() {
				restart = true;
			}
			
			/*
			 * Constructor to restart the game
			 */
			public OverseerRestart() {

				restartHome();
				_z = new Maze(0);
				_s = new StringMap1();
				final JFrame fram = new JFrame();
				_p = new Player(_z);
				_q = new Question();
				_q.questionpick();
				
				/*
				 *UPDATES THE MAP BACK TO WORLD 1
				 *Sets up the JFrame and JPanel and updates the Map layout
				 *Perform the required actions when there are inputs from keyboard
				 *Functions the same as Overseer's constructor but without the introductions and a different world layout
				 */
			    scene = _s.updateMap(_p, _z, "", _m, _r1, _r2, _r3, _sword, _teleport, _q, _ex);
			    fram.setTitle("World 1");
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
			    			scene = _s.updateMap(_p, _z, "NORTH", _m, _r1, _r2, _r3, _sword, _teleport, _q, _ex);
				    		fram.add(scene);
				    		fram.revalidate();
				    		
				    		//used to dispose frame to start a new level/world
				    		if(Level1 == false) {
				    			fram.dispose();
				    		}
			    		}
			    		
			    		//S - DOWN
			    		else if(input == KeyEvent.VK_S) {
			    			scene = _s.updateMap(_p, _z, "SOUTH", _m, _r1, _r2, _r3, _sword, _teleport, _q, _ex);
				    		fram.add(scene);
				    		fram.revalidate();
				    		
				    		//used to dispose frame to start a new level/world
				    		if(Level1 == false ) {
				    			fram.dispose();
				    		}
			    		}
			    		
			    		//D - RIGHT
			    		else if(input == KeyEvent.VK_D) {
			    			scene = _s.updateMap(_p, _z, "EAST", _m, _r1, _r2, _r3, _sword, _teleport, _q, _ex);
				    		fram.add(scene);
				    		fram.revalidate();
				    		
				    		//used to dispose frame to start a new level/world
				    		if(Level1 == false) {
				    			fram.dispose();
				    		}
			    		}
			    		
			    		//A - LEFT
			    		else if(input == KeyEvent.VK_A) {
			    			scene = _s.updateMap(_p, _z, "WEST", _m, _r1, _r2, _r3, _sword, _teleport, _q, _ex);
				    		fram.add(scene); 
				    		fram.revalidate();
				    		
				    		//used to dispose frame to start a new level/world
				    		if(Level1 == false) {
				    			fram.dispose();
				    		}
			    		}
			    		
			    		//EXIT BUTTON
			    		else if(input == KeyEvent.VK_E) {
			                Window.msg2("You left Princess Peach alone! \nBowser has won, keeping Peach forever...", bows);
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
			    //Revalidates the frame
			    	fram.revalidate();
			    	if(Level1 == false) {
		    			fram.dispose();
		    		}
			    }{
				//Initializes all the private isntance variables
			    	_z = new Maze(0);
					_s = new StringMap1();
					_p = new Player(_z);
					_m = new Minotaur(_z);
					_r1= new Rat(_z);
					_ex = new Exclamation(_z);
					_r2= new Rat(_z);
					_r3= new Rat(_z);
					_sword= new Sword(_z);
					_teleport = new Teleport(_z);
			    }
}
