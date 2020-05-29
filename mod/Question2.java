package Maze.mod;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;
import Maze.view.Window;


public class Question2 {
	//Question2 Class ~ Same thing as the Question class but with more questions
	
	/*
	 * Private isntance variables to be used:
	 * Images used in Questions
	 * ArrayList of positions
	 */
	private ImageIcon goomba =  new ImageIcon((getClass().getResource("goomba.png")));
	private ImageIcon koopalings =  new ImageIcon((getClass().getResource("koopalings.png")));
	private ImageIcon birdo =  new ImageIcon((getClass().getResource("birdo.png")));
	private ImageIcon wario =  new ImageIcon((getClass().getResource("wario.png")));
	
	private ArrayList<Position> positions = new ArrayList<Position>();

	//Adds the positions where a question CAN appear for World 1
	public void add() {
		positions.add(new Position(1,5));
		positions.add(new Position(2,11));
		positions.add(new Position(10,9));//3
		positions.add(new Position(8,1));//4
		positions.add(new Position(9,19));//5
		positions.add(new Position(17,13));//6
		positions.add(new Position(5,1));//7
		positions.add(new Position(15,5));//8
	}
	
	//Adds the positions where a question CAN appear for World 2
	public void addL2() {
		positions.add(new Position(3,5));
		positions.add(new Position(7,9));
		positions.add(new Position(8,11));//3
		positions.add(new Position(12,5));//4
		positions.add(new Position(13,17));//5
		positions.add(new Position(16,5));//6
		positions.add(new Position(16,15));//7
		positions.add(new Position(9,12));//8
	}
	
	//Adds the positions where a question CAN appear for World 3
	public void addL3() {
		positions.add(new Position(6,19));
		positions.add(new Position(10,9));
		positions.add(new Position(10,10));//3
		positions.add(new Position(13,8));//4
		positions.add(new Position(13,14));//5
		positions.add(new Position(16,15));//6
		positions.add(new Position(16,3));//7
		positions.add(new Position(17,3));//8
		positions.add(new Position(17,1));//9
		positions.add(new Position(17,5));//10
		positions.add(new Position(19,1));//11
		positions.add(new Position(19,5));//12
	}
	
	//Adds the positions where a question CAN appear for World 4
	public void addL4() {
		positions.add(new Position(4,13));
		positions.add(new Position(8,6));
		positions.add(new Position(8,11));//3
		positions.add(new Position(11,4));//4
		positions.add(new Position(13,15));//5
		positions.add(new Position(15,8));//6
		positions.add(new Position(16,17));//7
		positions.add(new Position(19,6));//8
		positions.add(new Position(19,12));//9
	}
	
	//Adds the positions where a question CAN appear for World 5
	public void addL5() {
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
		nums.add(18);
		nums.add(19);
	}

	/*
	 * Adds first set of question positions, shuffles that arraylist
	 * Then adds the numbers, and then shuffles the numbers
	 * Used for World 1
	 */
	public void questionpick() {
        add();
        Collections.shuffle(positions);
        addNums();
        Collections.shuffle(nums);
    }
	
	/*
	 * Adds first set of question positions, shuffles that arraylist
	 * Then adds the numbers, and then shuffles the numbers
	 * Used for World 2
	 */
	public void questionpickL2() {
        addL2();
        Collections.shuffle(positions);
        addNums();
        Collections.shuffle(nums);
    }
	
	/*
	 * Adds first set of question positions, shuffles that arraylist
	 * Then adds the numbers, and then shuffles the numbers
	 * Used for World 3
	 */
	public void questionpickL3() {
        addL3();
        Collections.shuffle(positions);
        addNums();
        Collections.shuffle(nums);
    }
	
	/*
	 * Adds first set of question positions, shuffles that arraylist
	 * Then adds the numbers, and then shuffles the numbers
	 * Used for World 4
	 */
	public void questionpickL4() {
        addL4();
        Collections.shuffle(positions);
        addNums();
        Collections.shuffle(nums);
    }
	
	/*
	 * Adds first set of question positions, shuffles that arraylist
	 * Then adds the numbers, and then shuffles the numbers
	 * Used for World 5
	 */
	public void questionpickL5() {
        addL5();
        Collections.shuffle(positions);
        addNums();
        Collections.shuffle(nums);
    }
	
	//Given the parameter, the question would be asked and a boolean returned; true if correct and false if answered incorrect
	public boolean askQuestions(int num) {
		if(num == 0) {
	        Window Msg = new Window();
	        String b = Window.in( "Which country did Nintendo originate from?");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 15");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Japan")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 20 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 15");
	            return false;
	        }
		}
		if(num == 1) {
	        Window Msg = new Window();
	        String b = Window.in( "Who is Mario's brother");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 15");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Luigi")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 20 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 15");
	            return false;
	        }
		}
		if(num == 2) {
	        Window Msg = new Window();
	        String b = Window.in("What realm does Princess Peach rule? \n Hint: ________ Kingdom");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 15");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("The Mushroom Kingdom") || b.equalsIgnoreCase("Mushroom Kingdom") || b.equalsIgnoreCase("Mushroom")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 20 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 15");
	            return false;
	        }
		}
		if(num == 3) {
	        Window Msg = new Window();
	        try {
	        String b = Window.showInputDialoggoomba("Who is this Mario enemy?", goomba);
	        //(fram,"Who is this Mario enemy?* \n *Enter only one word.", goomba, null, "");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 15");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Goomba") || b.equalsIgnoreCase("Goombas")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 20 more turns");
	            return true;
	        	}
	        else {
		        Window.msg("You got this wrong");
		        Window.msg("Your turns have decreased by 15");
	            return false;
	        }
	        }
	        catch(Exception e) {System.out.println(e.getStackTrace());
	        }
		}
		if(num == 4) {
	        Window Msg = new Window();
	        
	        String b = Window.in( "If Mario sees that he is against two koopas on the left side "
	        		+ "\n and two koopas on the right, how many koopas does he have to fight?"
	        		+ "\nHint: input a number.");
	        try {
		        int x = Integer.parseInt(b);
		        if(b == null) {
		        	Window.msg("You left the box blank. You automatically get it wrong!");
		            Window.msg("Your turns have decreased by 15");
		        	return false;
		        }
		        if(b.equalsIgnoreCase("Four") || x == 4) {
		            Window.msg("Correct!");
		            Window.msg("You gained 20 more turns");
		            return true;
		        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 15");
	            return false;
	        	}
	        }
	        	catch(NumberFormatException e){
		        	System.out.println("invalid input " + e.getStackTrace());
		        	}
		}
		if(num == 5 ) {
	        Window Msg = new Window();
	        String b = Window.in( "Is Yoshi an allie or enemy?* \n*One word shall suffice.");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 15");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Allie") || b.equalsIgnoreCase("Allies") || b.equalsIgnoreCase("An Allie")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 20 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 15");
	            return false;
	        }
		}
		if(num == 6) {
	        Window Msg = new Window();
	        String b = Window.in( "What Mario Character is a living mushroom? \n Hint: _ _ _ _");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 15");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Toad")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 20 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 15");
	            return false;
	        }
		}
		if(num == 7) {
	        Window Msg = new Window();
	        String b = Window.in( "True or false; Does Mario and Luigi have another brother?");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 15");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("False")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 20 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 15");
	            return false;
	        }
		}
		if(num == 8) {
	        Window Msg = new Window();
	        String b = Window.in( "What is the name of the carnivorous flower that is one of Bowser's henchmen? "
	        		+ "\n Hint: __________ ________");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 15");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Piranha Plant")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 20 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 15");
	            return false;
	        }
		}
		if(num == 9) {
	        Window Msg = new Window();
	        String b = Window.in( "Who created Mario? \n Hint: _ _ _ _ _ _ _ Miyamoto");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 15");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Shigeru Miyamoto") || b.equalsIgnoreCase("Shigeru")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 20 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 15");
	            return false;
	        }
		}
		if(num == 10) {
	        Window Msg = new Window();
	        String b = Window.in( "What was Mario's original name when introduced in Donkey Kong?"
	        		+ "\n Hint: _ _ _ _man");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 15");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Jumpman") || b.equalsIgnoreCase("Jump")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 20 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 15");
	            return false;
	        }
		}
		if(num == 11) {
	        Window Msg = new Window();
	        String b = Window.in( "Who is the big bad that always kidnaps Princess Peach from Mario");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 15");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Bowser")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 20 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 15");
	            return false;
	        }
		}
		if(num == 12) {
	        Window Msg = new Window();
	        String b = Window.in( "What are the soldiers in Bowser's army called? \n Hint: _ _ _ _ _ troopas");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 15");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Koopa Troopas") || b.equalsIgnoreCase("Koopa") || b.equalsIgnoreCase("Koopas")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 20 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 15");
	            return false;
	        }
		}
		if(num == 13) {
	        Window Msg = new Window();
	        String b = Window.in( "What is Mario's surname");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 15");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Mario")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 20 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 15");
	            return false;
	        }
		}
		if(num == 14) {
	        Window Msg = new Window();
	        try {
	        String b = Window.showInputDialogling("What is this group of characters called?.", koopalings);
	        //(fram,"What is this group of characters called?* \n *Enter only one word.", koopalings, null, "");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 15");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Koopalings")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 20 more turns");
	            return true;
	        }else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 15");
	            return false;
		        }
	        }   catch(Exception e) {System.out.println(e.getStackTrace());}
	               
		}
		if(num == 15) {
	        Window Msg = new Window();
	        String b = Window.in( "Bowser has 600 coins after playing the game. He wants to give each kid an equal amount of coins. "
	        		+ "\n If he has 8 kids, how many coins does each kid get?*"
	        		+ "\n* Input number only");
	        try {
		        int x = Integer.parseInt(b);
		        if(b == null) {
		        	Window.msg("You left the box blank. You automatically get it wrong!");
		            Window.msg("Your turns have decreased by 15");
		        	return false;
		        }
		        if( x == 75) {
		        	Window.msg("Correct!");
			            Window.msg("You gained 20 more turns");
		            return true;
		        }
		        else {
		            Window.msg("You got this wrong");
		            Window.msg("Your turns have decreased by 15");
		            return false;
		        }
	        }catch(NumberFormatException e){
	        	System.out.println("invalid input " + e.getStackTrace());
	        	}
		}
		if(num == 16) {
	        Window Msg = new Window();
	        String b = Window.in( "What type of mushroom makes you mega big?"
	        		+ "\n Hint: _ _ _ _ mushroom");
	        
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 15");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Mega mushroom") || b.equalsIgnoreCase("mega")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 20 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 15");
	            return false;
	        }
		}
		if(num == 17) {
	        Window Msg = new Window();
	        try {
	        String b = Window.showInputDialogbird("Who is this obscure Mario character?", birdo);
	        //(fram,"Who is this obscure Mario character? \n Hint: _ _ _ _ _.", birdo, null, "");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 15");
	        	return false;
	        }    
	        if(b.equalsIgnoreCase("Birdo")) {
		            Window.msg("Correct!");
		            Window.msg("You gained 20 more turns");
		            return true;
		        }
		        else {
		            Window.msg("You got this wrong");
		            Window.msg("Your turns have decreased by 15");
		            return false;
		        
		        }
	        }   catch(Exception e) {System.out.println(e.getStackTrace());
	       }
		}
		if(num == 18) {
	        Window Msg = new Window();
	        String b = Window.in( "What game console was the original Super Mario Bros for? \nHint: Acrononym is 3 letters.");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 15");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("NES") || b.equalsIgnoreCase("Nintendo Entertainment System")) {
	            Window.msg("Correct!");
	            Window.msg("YYou gained 20 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 15");
	            return false;
	        }
		}
		if(num == 19) {
	        Window Msg = new Window();
	        String b = Window.in( "Which Mario game features the infamous Blue Shell? \n Hint: 2 words.");
	        if(b == null) {
	        	Window.msg("You left the box blank. You automatically get it wrong!");
	            Window.msg("Your turns have decreased by 15");
	        	return false;
	        }
	        if(b.equalsIgnoreCase("Mario Kart")) {
	            Window.msg("Correct!");
	            Window.msg("You gained 20 more turns");
	            return true;
	        }
	        else {
	            Window.msg("You got this wrong");
	            Window.msg("Your turns have decreased by 15");
	            return false;
	        }
		}

		if(num == 20) {
	        Window Msg = new Window();
	        try {
		        String b = Window.showInputDialogwar("Who is this mustachioed miscreant?", wario);
		        if(b == null) {
		        	Window.msg("You left the box blank. You automatically get it wrong!");
		            Window.msg("Your turns have decreased by 15");
		        	return false;
		        }
		        if(b.equalsIgnoreCase("Wario")) {
		            Window.msg("Correct!");
		            Window.msg("You gained 20 more turns");
		            return true;
		        }
		        else{
		            Window.msg("You got this wrong");
		            Window.msg("Your turns have decreased by 15");
		            return false;
		        
		        }
	        }   catch(Exception e) {System.out.println(e.getStackTrace());
	        }
		}
		return false;
	}
	
	//Getters for the position of each question
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
