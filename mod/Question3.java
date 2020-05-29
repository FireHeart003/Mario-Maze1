package Maze.mod;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;
import Maze.mod.*;
import Maze.view.Window;


public class Question3 {
	//Question3 Class ~ Same thing as the Question class but with RIDDLES
	
	/*
	 * Private isntance variables to be used:
	 * Images used in Questions
	 * ArrayList of positions
	 */
	private ArrayList<Position> positions = new ArrayList<Position>();

	//Method that adds the positiosn where each question/riddle will be
	public void add() {
		positions.add(new Position(3,13));
		positions.add(new Position(7,16));
		positions.add(new Position(10,16));//3
		positions.add(new Position(13,2));//4
		positions.add(new Position(19,2));//5
		positions.add(new Position(19,18));//6
		positions.add(new Position(14,9));//7
		//positions.add(new Position(4,11));//8
	}

	//ArrayList of numbers to be added
	private ArrayList<Integer> nums = new ArrayList<Integer>();
	
	//Method that adds the numbers of questions to the nums arraylist
	public void addNums() {
		nums.add(0);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(10);
		nums.add(11);
		nums.add(12);
		nums.add(13);
		nums.add(14);
		nums.add(15);
		nums.add(16);
		nums.add(17);
	}

	/*
	 * Adds first set of question positions, shuffles that arraylist
	 * Then adds the numbers, and then shuffles the numbers
	 * Used for World 5
	 * The title of the method should have a 5, my bad
	 */
	public void question3pick() {
        add();
        Collections.shuffle(positions);
        addNums();
        Collections.shuffle(nums);
    }
	
	
	//Given the parameter, the question would be asked and a boolean returned; true if correct and false if answered incorrect
	public boolean askQuestions(int num) {
		if(num == 0) {
	        Window Msg = new Window();
	        String b = Window.in( "What is green, but is related to red??");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 25");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Luigi")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 30 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 25");
	            return false;
	        }
		}
		if(num == 1) {
	        Window Msg = new Window();
	        String b = Window.in( "What has spikes, fiery breath, and a temper?");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 25");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Bowser")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 30 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 25");
	            return false;
	        }
		}
		if(num == 2) {
	        Window Msg = new Window();
	        String b = Window.in("What golfs, parties, and rides on a kart?");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 25");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Mario")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 30 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 25");
	            return false;
	        }
		}
		if(num == 3) {
	        Window Msg = new Window();
		        String b = Window.in("I am small, red with white circles. I help Mario and his friends grow big. What am I? \nHint: A PowerUP!");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 25");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Mushroom") || b.equalsIgnoreCase("Mega Mushroom")|| b.equalsIgnoreCase("Mega Mushrooms")|| b.equalsIgnoreCase("Mushrooms")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 30 more turns");
	            return true;
	        	}
	        else {
		        Window.msg("You got this wrong");
		        Window.msg("Your turns have decreased by 25");
	            return false;
	        }
	        

		}
		if(num == 4 ) {
	        Window Msg = new Window();
	        String b = Window.in( "I'd love to scare people\" Which Character am I?"
	        		+ "\nOne word will suffice");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 25");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Boo") || b.equalsIgnoreCase("Ghost") || b.equalsIgnoreCase("King Boo")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 30 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 25");
	            return false;
	        }
		}
		if(num == 5 ) {
	        Window Msg = new Window();
	        String b = Window.in( " I am made out of bones and have a turtle's shell."
	        		+ "\n I can shoot fireballs out, and I am not in the game much, I am only in 1 or 2 games.");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 25");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Dry Bowser") || b.equalsIgnoreCase("Dry Boned Bowser")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 30 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 25");
	            return false;
	        }
		}
		if(num == 6) {
	        Window Msg = new Window();
	        String b = Window.in( "I roam through the lands hoping to rescue my love, I search high and low, "
	        		+ "\nand will stomp on you if you get in my way! What/Who am i ??");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 25");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Mario")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 30 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 25");
	            return false;
	        }
		}
		if(num == 7) {
	        Window Msg = new Window();
	        String b = Window.in( "I look like a black ball with terrifying teeth! I have a chain holding me to the ground. Who am I?");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 25");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Chain Chomp")|| b.equalsIgnoreCase("Chain-Chomp")|| b.equalsIgnoreCase("Chomp") ||
	        		b.equalsIgnoreCase("Chain Chomps")|| b.equalsIgnoreCase("Chain-Chomps")|| b.equalsIgnoreCase("Chomps")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 30 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 25");
	            return false;
	        }
		}
		if(num == 8) {
	        Window Msg = new Window();
	        String b = Window.in( "NOKYDE NGKO -- Unscramble this; Who AM I? "
	        		+ "\n Hint: Name has 2 words");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 25");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Donkey Kong") || (b.equalsIgnoreCase("DonkeyKong")) || (b.equalsIgnoreCase("Donkey-Kong"))) {
	            Window.msg("Correct!");
	            Window.msg("You gained 30 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 25");
	            return false;
	        }
		}
		if(num == 9) {
	        Window Msg = new Window();
	        String b = Window.in( "Need some traction,\n" + 
	        		"and swimming precision?\n" + 
	        		"I live in the world where it's cool.\n" + 
	        		"Anyone who dislikes my powers is clearly a fool.\n" + 
	        		"WHat Item/PowerUP am I?");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 25");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Penguin") || b.equalsIgnoreCase("Penguin Suit")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 30 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 25");
	            return false;
	        }
		}
		if(num == 10) {
	        Window Msg = new Window();
	        String b = Window.in( "I got in the DS game.\n" + 
	        		"Everybody knows my name\n" + 
	        		"I wanted to be with Mario\n" + 
	        		"But in the DS version, I had to rescue Wario."
	        		+ "\nHINT: A Popular CHARACTER...");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 25");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Luigi")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 30 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 25");
	            return false;
	        }
		}
		if(num == 11) {
	        Window Msg = new Window();
	        String b = Window.in( "I am the Princess Peach for Luigi, who am I?");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 25");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Daisy") || (b.equalsIgnoreCase("Princess Daisy"))) {
	            Window.msg("Correct!");
	            Window.msg("You gained 30 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 25");
	            return false;
	        }
		}
		if(num == 12) {
	        Window Msg = new Window();
	        String b = Window.in( "What Mario Bros enemy was shaped to look like a mushroom?");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 25");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Goomba") || b.equalsIgnoreCase("Goombas")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 30 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 25");
	            return false;
	        }
		}
		if(num == 13) {
	        Window Msg = new Window();
	        String b = Window.in( "What is Mario's surname");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 25");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Mario")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 30 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 25");
	            return false;
	        }
		}
		if(num == 14) {
			 Window Msg = new Window();
		        String b = Window.in( "I am named after a mushroom. I am a large piece of land and Mario lives in me."
		        		+ "\n What am I?\n HINT: 2 Words shall suffice...");
		        if(b == null) {
		        	Window.msg("You left the box blank. You automatically get it wrong!");
		            Window.msg("Your turns have decreased by 25");
		        	return false;
		        }
		        if(b.equalsIgnoreCase("Mushroom Kingdom") || (b.equalsIgnoreCase("The Mushroom Kingdom"))) {
		            Window.msg("Correct!");
		            Window.msg("You gained 30 more turns");
		            return true;
		        }
		        else {
		            Window.msg("You got this wrong");
		            Window.msg("Your turns have decreased by 25");
		            return false;
		        }
		}
		if(num == 15) {
			Window Msg = new Window();
	        String b = Window.in( "What was Mario's first job/profession?"
	        		+ "\n HINT: Not a PLUMBER!");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 25");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Carpenter") || (b.equalsIgnoreCase("Woodworker"))) {
	            Window.msg("Correct!");
	            Window.msg("You gained 30 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 25");
	            return false;
	        }
		}
		if(num == 16) {
	        Window Msg = new Window();
	        String b = Window.in( "I was the first princess that Mario saved. Who am I?"
	        		+ "\n HINT: I am not who you think I am...");
	        
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 25");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Princess Pauline") || b.equalsIgnoreCase("Pauline")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 30 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 25");
	            return false;
	        }
		}
		if(num == 17) {
			Window Msg = new Window();
	        String b = Window.in( "I was Mario's first Rival. Who am I?"
	        		+ "\n What am I?\n HINT: _____ ____");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 25");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Donkey Kong") || (b.equalsIgnoreCase("DonkeyKong"))) {
	            Window.msg("Correct!");
	            Window.msg("You gained 30 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 25");
	            return false;
	        }
		}
		return false;
	}
	
	//GETTERS
	public Position getQuestPos1() {
        return positions.get(0);
    }
	public Position getQuestPos2() {
        return positions.get(1);
    }
	public Position getQuestPos3() {
        return positions.get(2);
    }
	public Position getQuestPos4() {
        return positions.get(3);
    }
	public Position getQuestPos5() {
        return positions.get(4);
    }
	public Position getQuestPos6() {
        return positions.get(5);
    }
	public Position getQuestPos7() {
        return positions.get(6);
    }
	public Position getQuestPos8() {
        return positions.get(7);
    }
	public Position getQuestPos9() {
        return positions.get(8);
    }
	public Position getQuestPos10() {
        return positions.get(9);
    }
	
	/*
	 * Grabs the random number from the shuffled numbers arrayList and asks the question
	 * returns whether the question was answered correctly or not
	 * Done for each question
	 */
	public boolean randomQuestion1() {
        int num1 = nums.get(0);
       return askQuestions(num1);
    }
	public boolean randomQuestion2() {
        int num2 = nums.get(1);
        return askQuestions(num2);
    }
	public boolean randomQuestion3() {
        int num3 = nums.get(2);
        return askQuestions(num3);
    }
	public boolean randomQuestion4() {
        int num4 = nums.get(3);
        return askQuestions(num4);
    }
	public boolean randomQuestion5() {
        int num5 = nums.get(4);
        return askQuestions(num5);
        
    }
	public boolean randomQuestion6() {
        int num6 = nums.get(5);
        return askQuestions(num6);
    }
	public boolean randomQuestion7() {
        int num7 = nums.get(6);
        return askQuestions(num7);
    }
	public boolean randomQuestion8() {
        int num8 = nums.get(7);
        return askQuestions(num8);
    }
	public boolean randomQuestion9() {
        int num9 = nums.get(8);
       return askQuestions(num9 );
    }
	public boolean randomQuestion10() {
        int num10 = nums.get(9);
        return askQuestions(num10);
    }
	public boolean randomQuestion11() {
        int num11 = nums.get(10);
        return askQuestions(num11);
    }

	//Given a question, after answering, the question would be removed by setting it to a position where there is a wall
	public void killQues(int s){
        if (s==1) {
            positions.set(0, new Position(0,0));
        }
        if (s==2) {
            positions.set(1, new Position(0,0));
        }
        if (s==3) {
            positions.set(2, new Position(0,0));
        }
        if (s==4) {
            positions.set(3, new Position(0,0));
        }
        if (s==5) {
            positions.set(4, new Position(0,0));
        }
        if (s==6) {
            positions.set(5, new Position(0,0));
        }
        if (s==7) {
            positions.set(6, new Position(0,0));
        }
        if (s==8) {
            positions.set(7, new Position(0,0));
        }
        if (s==9) {
            positions.set(8, new Position(0,0));
        }
        if (s==10) {
            positions.set(9, new Position(0,0));
        }
        if (s==11) {
            positions.set(10, new Position(0,0));
        }
        if (s==12) {
            positions.set(11, new Position(0,0));
        }
        if (s==13) {
            positions.set(12, new Position(0,0));
        }
        if (s==14) {
            positions.set(13, new Position(0,0));
        }
        if (s==15) {
            positions.set(14, new Position(0,0));
        }
        if (s==16) {
            positions.set(15, new Position(0,0));
        }
        if (s==17) {
            positions.set(16, new Position(0,0));
        }
        if (s==18) {
            positions.set(17, new Position(0,0));
        }
        if (s==19) {
            positions.set(18, new Position(0,0));
        }
        if (s==20) {
            positions.set(19, new Position(0,0));
        }
    }
}
