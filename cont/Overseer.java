package Maze.cont;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Maze.mod.Exclamation;
import Maze.mod.Maze;
import Maze.mod.Minotaur;
import Maze.mod.Player;
import Maze.mod.Question;
import Maze.mod.Rat;
import Maze.mod.Sword;
import Maze.mod.Teleport;
import Maze.view.StringMap;
import Maze.view.Window;

	public class Overseer {
		/*
		 * World, level, and stage are used interchangeably
		 */
		
		//declares private instance variables
		private int cnt = 20;
		private StringMap _s;
		private Maze _z;
		private Minotaur _m;
		private Player _p;
		private Question _q;
		private Rat _r1;
		private Rat _r2;
		private Rat _r3;
		private Sword _sword;
		private Teleport _teleport;
		private Exclamation _ex;
		static boolean Level1 = true;
		private ImageIcon home =  new ImageIcon((getClass().getResource("begin.jpg")));
		private ImageIcon world1 =  new ImageIcon((getClass().getResource("world1.jpg")));
		private ImageIcon bows =  new ImageIcon((getClass().getResource("bows.png")));
		private ImageIcon kidnap =  new ImageIcon((getClass().getResource("kidnap.png")));
		private ImageIcon lings =  new ImageIcon((getClass().getResource("lings.png")));

		private static final String[] INVITATION = {"LET's GO!", "Ma ma Mia! I cannot do this! Mario: Leaves the Mushroom Kingdom..."};

		private static JPanel scene = new JPanel();
		
		//private static boolean variables to be used for going to the next level
		static boolean restart = true;
		static boolean ex = false;
		
		//setter
		public static void setLevelFalse() {
			Level1 = false;
		}
		public static void setExTrue() {
			ex = true;
		}
		//getter
		public static boolean getEx() {
			return ex;
		}
		

		/*
		 * Starts the whole game with a welcome message to be displayed
		 */
		public void welcome() {
			int x = Window.option1(INVITATION, "SUPER MARIO MAZE 3.0"
					+ "\n Bowser has kidnapped Princess Peach once again. He has created another maze which is bigger, badder, and better than the previous one!"
					+ "\n He keeps Princess Peach in his own personal private castle in TERRA ENVIRONMENTAL INSTITUTE Room 4110. "
					+ "\n Save PRINCESS PEACH! You are our only hope!", home);
			if(x==0) {
			Window.msg2("You are entering World 1!", world1);
			Window.msg2("The Koopa Kids and their friends have  assembled in an attempt to help Bowser and destroy Mario!", lings);
			}
			if(x==1) {
				Window.msg2("How could you do this to the princess, Mario!?!?!?", kidnap);
				System.exit(0);
			}
		}
		/*
		 * Method goes through the rules of the game
		 */
		public void rules() {
			Window.msg("The pipe transported Mario to Bowser's Maze2.0. Mario only has 50 turns and gains 20 or loses 10 turns from QUESTION blocks."
					+ "\n Get to the pipe before those turns are up."
					+ "\n W: UP"
					+ "\n A: LEFT"
					+ "\n S: DOWN"
					+ "\n D: RIGHT"
					+ "\n H: Help------->STRONGLY ADVISE"
					+ "\n C: Credits");
		}
		/*
		 * Constructor initializing private instance variables and sets up the JFrame, JPanel, and KeyListener
		 * Execute inputs of WASD and E/C
		 */
		public Overseer() {
			welcome();
			rules();
			_z = new Maze(0);
			_s = new StringMap();
			final JFrame fram = new JFrame();
			_p = new Player(_z);
			_q = new Question();
			_q.questionpick();
			
			//updates the map and JFrame & JPanel
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

		    	/*
		    	 * Method takes in inputs from the keyboard and uses the input to execute the action specified.
		    	 * For each input, the frame and map is updated accordingly.
		    	 * Basically manages KeyBoard inputs and is repeated throughout the Overseer classes
		    	 */
		    	public void keyPressed(KeyEvent e) { 
		    		int input = e.getKeyCode();
		    		
		    		//W - UP
		    		if(input == KeyEvent.VK_W) {
		    			scene = _s.updateMap(_p, _z, "NORTH", _m, _r1, _r2, _r3, _sword, _teleport, _q, _ex);
		    		fram.add(scene);
		    		fram.revalidate();
		    			//used to dispose frame to start a new level/world
			    		if(Level1 == false && restart==false) {
			    			fram.dispose();
			    		}
		    		}
		    		
		    		//S - DOWN
		    		else if(input == KeyEvent.VK_S) {
		    			scene = _s.updateMap(_p, _z, "SOUTH", _m, _r1, _r2, _r3, _sword, _teleport, _q, _ex);
		    		fram.add(scene);
		    		fram.revalidate();
	    			//used to dispose frame to start a new level/world
		    		if(Level1 == false) {
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
		    //revalidates the frame, updating any new components
		    	fram.revalidate();
		    	
		    //if statement used to determine whether or not to go to the next level
		    	//will dispose the frame to create a new one for a new world in a sense
		    	if(Level1 == false) {
	    			fram.dispose();
	    		}
		    }{
			//initializes all instance variables and sets the map to map 1, which would be Maze(0)
		    	_z = new Maze(0);
				_s = new StringMap();
				_p = new Player(_z);
				_m = new Minotaur(_z);
				_r1= new Rat(_z);
				_r2= new Rat(_z);
				_r3= new Rat(_z);
				
				//extra add ons
				_sword= new Sword(_z);
				_teleport = new Teleport(_z);
				_ex = new Exclamation(_z);
		    }
	}
