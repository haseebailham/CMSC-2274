package edu.ben.model;

import java.util.Random;

/**
 * RandomGen class, responsible for producing random integers within a certain
 * range
 * 
 * @author mraheem
 * @version 1.0
 */
public class RandomGen {
	/**
	 * Random, which helps with generating numbers in the methods of this class
	 */
	private Random r = new Random();

	/**
	 * This method will generate a random number from 1-the number passed in
	 * 
	 * @param available
	 *            the number of riddles that will be available for the particular
	 *            level or the number of messages that are available to display
	 * @return a randomly generated number within the appropriate range
	 */
	public int randomNum(int available) {
		int num = r.nextInt(available) + 1;
		return num;
	}

	/**
	 * This method will return a random number in the range 1-16
	 * 
	 * @return true if the number mod 16 is equal to three, which determines if a
	 *         pterodactyl will harm the player
	 */
	public boolean randomNumber() {
		int num = r.nextInt(16) + 1;
		if (num % 16 == 3) {
			return true;
		}
		return false;
	}
}
