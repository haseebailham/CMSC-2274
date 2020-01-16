package edu.ben.human;

import java.util.ArrayList;
import java.util.LinkedList;

import edu.ben.model.RandomGen;

/**
 * Riddle3 class, holds all the riddles for level 3 needed to help the human get
 * more health points
 * 
 * @author mraheem
 * @version 1.0
 *
 */
public class Riddles3 implements Riddle {
	/**
	 * The linked list that holds all the riddles
	 */
	private LinkedList<String> riddles = new LinkedList<String>();
	/**
	 * A possible riddle that the player can be asked
	 */
	private String riddle1 = "I have keys but no locks. I have a space but no room. You can enter, but can't go outside. What am I?";
	/**
	 * A possible riddle that the player can be asked
	 */
	private String riddle2 = "I have a head and tail but no body. What am I?";
	/**
	 * A possible riddle that the player can be asked
	 */
	private String riddle3 = "Yesterday comes before today and tomorrow everywhere in the world, except this place.  Where am I?";
	/**
	 * A possible riddle that the player can be asked
	 */
	private String riddle4 = "They are dark, and always on the run. Without the sun, there would be none. What are they?";
	/**
	 * A possible riddle that the player can be asked
	 */
	private String riddle5 = "If Friday the horse goes into the park at 7:00 and on Sunday the horse goes into the park at 8:00, what is the horse's name?";
	/**
	 * The array list that holds all the possible riddle numbers that are left to
	 * ask the player
	 */
	private ArrayList<Integer> possibleNums = new ArrayList<Integer>();

	/**
	 * Riddles3 constructor, which adds the possible numbers to the arraylist
	 */
	public Riddles3() {
		possibleNums.add(1);
		possibleNums.add(2);
		possibleNums.add(3);
		possibleNums.add(4);
		possibleNums.add(5);
	}

	/**
	 * Creates the riddle linked list that stores the riddles
	 * 
	 * @return riddles, the linked list holding all the riddles
	 */
	@Override
	public LinkedList<String> riddlesList() {
		riddles.add(riddle1);
		riddles.add(riddle2);
		riddles.add(riddle3);
		riddles.add(riddle4);
		riddles.add(riddle5);
		return riddles;
	}

	/**
	 * This method returns the possible answers for riddle 1
	 * 
	 * @return a linked list of the possible answers for riddle 1
	 */
	public LinkedList<String> riddle1Answers() {
		LinkedList<String> answers = new LinkedList<String>();
		String[] answerOptions = { "a keyboard", "keyboard", "the keyboard", "my keyboard", "your keyboard" };
		for (int i = 0; i < answerOptions.length; i++) {
			answers.add(answerOptions[i]);
		}
		return answers;
	}

	/**
	 * This method returns the possible answers for riddle 2
	 * 
	 * @return a linked list of the possible answers for riddle 2
	 */
	public LinkedList<String> riddle2Answers() {
		LinkedList<String> answers = new LinkedList<String>();
		String[] answerOptions = { "a coin", "coin", "your coin", "my coin", "the coin", "a penny", "penny",
				"your penny", "my penny", "the penny", "a quarter", "quarter", "your quarter", "my quarter",
				"the quarter", "a nickel", "nickel", "your nickel", "my nickel", "the nickel", "a dime", "dime",
				"your dime", "my dime", "the dime" };
		for (int i = 0; i < answerOptions.length; i++) {
			answers.add(answerOptions[i]);
		}
		return answers;
	}

	/**
	 * This method returns the possible answers for riddle 3
	 * 
	 * @return a linked list of the possible answers for riddle 3
	 */
	public LinkedList<String> riddle3Answers() {
		LinkedList<String> answers = new LinkedList<String>();
		String[] answerOptions = { "dictionary", "a dictionary", "the dictionary", "your dictionary", "my dictionary",
				"in the dictionary", "in a dictionary", "in the dictionary", "in your dictionary", "in my dictionary" };
		for (int i = 0; i < answerOptions.length; i++) {
			answers.add(answerOptions[i]);
		}
		return answers;
	}

	/**
	 * This method returns the possible answers for riddle 4
	 * 
	 * @return a linked list of the possible answers for riddle 4
	 */
	public LinkedList<String> riddle4Answers() {
		LinkedList<String> answers = new LinkedList<String>();
		String[] answerOptions = { "shadows", "shadow", "my shadow", "my shadows", "your shadow", "your shadows",
				"the shadow", "the shadows", "a shadow" };
		for (int i = 0; i < answerOptions.length; i++) {
			answers.add(answerOptions[i]);
		}
		return answers;
	}

	/**
	 * This method returns the possible answers for riddle 5
	 * 
	 * @return a linked list of the possible answers for riddle 5
	 */
	public LinkedList<String> riddle5Answers() {
		LinkedList<String> answers = new LinkedList<String>();
		String[] answerOptions = { "Friday" };
		for (int i = 0; i < answerOptions.length; i++) {
			answers.add(answerOptions[i]);
		}
		return answers;
	}

	/**
	 * This method checks if the answer the player gave is correct
	 * 
	 * @param riddle
	 *            the riddle array holding both the question and answer
	 * @param playerAnswer
	 *            the answer the player gives
	 * @return true if the player's answer is correct, false if it is incorrect
	 */
	@Override
	public boolean correctRiddleAnswer(String riddle, String playerAnswer) {
		/*
		 * checks which riddle the player was asked and checks the appropriate list of
		 * correct answers to see if the player answered correctly
		 */
		if (riddle.equals(riddle1)) {
			for (int i = 0; i < riddle1Answers().size(); i++) {
				if (riddle1Answers().get(i).equalsIgnoreCase(playerAnswer)) {
					return true;
				}
			}
		} else if (riddle.equals(riddle2)) {
			for (int i = 0; i < riddle2Answers().size(); i++) {
				if (riddle2Answers().get(i).equalsIgnoreCase(playerAnswer)) {
					return true;
				}
			}
		} else if (riddle.equals(riddle3)) {
			for (int i = 0; i < riddle3Answers().size(); i++) {
				if (riddle3Answers().get(i).equalsIgnoreCase(playerAnswer)) {
					return true;
				}
			}
		} else if (riddle.equals(riddle4)) {
			for (int i = 0; i < riddle4Answers().size(); i++) {
				if (riddle4Answers().get(i).equalsIgnoreCase(playerAnswer)) {
					return true;
				}
			}
		} else if (riddle.equals(riddle5)) {
			for (int i = 0; i < riddle5Answers().size(); i++) {
				if (riddle5Answers().get(i).equalsIgnoreCase(playerAnswer)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * This will give the riddle corresponding to the number being passed in
	 * 
	 * @param num
	 *            the number for the riddle
	 * @return proper riddle
	 */
	@Override
	public String giveRiddle() {
		int num = generateNum();
		possibleNums.remove(Integer.valueOf(num));
		if (num == 1) {
			return riddle1;
		} else if (num == 2) {
			return riddle2;
		} else if (num == 3) {
			return riddle3;
		} else if (num == 4) {
			return riddle4;
		} else if (num == 5) {
			return riddle5;
		}
		return null;
	}

	/**
	 * This method generates a random number so the class can output the right
	 * riddle
	 * 
	 * @return a number that will correspond to a riddle
	 */
	public int generateNum() {
		RandomGen r = new RandomGen();
		int num = r.randomNum(7);
		while (!possibleNums.contains(num)) {
			num = r.randomNum(7);
		}
		return num;
	}

	/**
	 * @return the possibleNums the array holding the riddle numbers that have not
	 *         been asked yet
	 */
	public ArrayList<Integer> getPossibleNums() {
		return possibleNums;
	}

	/**
	 * @param possibleNums
	 *            the possibleNums to set, which are the array holding the riddle
	 *            numbers that have not been asked yet
	 */
	public void setPossibleNums(ArrayList<Integer> possibleNums) {
		this.possibleNums = possibleNums;
	}
}
