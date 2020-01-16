package edu.ben.human;

import java.util.ArrayList;

/**
 * Human Bubble class
 * 
 * @author haseebailham
 * @author abdul
 * @version 1.0
 */
public class HumanBubble {
	/**
	 * size of the bubble for human
	 */
	private int bubbleSize = 6; // this is the amount of steps the human can take
	/**
	 * the array which stores the arrays
	 */
	private char[][] bubble;
	/**
	 * the human movement amount
	 */
	private int MAX_MOVES = 6;
	/**
	 * a list to index which contain dinosaurs
	 */
	private ArrayList<int[]> rangeIndex = new ArrayList<int[]>(); // list for storing Dinosaur index if its in bubble

	/**
	 * Public constructor for HumanBubble class.
	 * 
	 * @param level
	 *            Level number
	 */
	public HumanBubble(int level) {
		bubble = new char[(bubbleSize * 2) + 1][(bubbleSize * 2) + 1]; // 13x13
	}

	/**
	 * method to call to make a bubble around the human creates a sub
	 * 
	 * @param board
	 *            the board array
	 * @param i
	 *            the human X
	 * @param j
	 *            the human Y
	 * @return the sub array bubble
	 */
	public char[][] makeBubble(char[][] board, int i, int j) {
		rangeIndex.clear();
		// diamond shape human bubble.
		int rowCounter = 0; // keeps track of which row to add to
		int columnCounter = 0; // keeps track of which column to add to
		for (int x = i - bubbleSize; x <= i + bubbleSize; x++) { // this makes the full 13x13 array around human
			if (x < 0 || x >= board.length) {
				for (int k = 0; k < bubble[0].length; k++) {
					bubble[rowCounter][k] = 'F';
				}
				rowCounter++;
				continue; // out of bounds
			}
			for (int y = j - bubbleSize; y <= j + bubbleSize; y++) {
				if (y < 0 || y >= board[i].length) {

					bubble[rowCounter][columnCounter] = 'F';
					columnCounter++;
					continue; // out of bounds
				}

				bubble[rowCounter][columnCounter] = board[x][y];
				columnCounter++;
			}
			columnCounter = 0;
			rowCounter++;

		}
		int counter = 1; // how many index in bubble
		int index = 0; // starting point of row
		for (int x = 0; x < bubble.length; x++) { // makes diamond shape // fills every valid location with a Z

			if (x >= bubbleSize) {
				index = x - bubbleSize;
			} else {
				index = bubbleSize - x;
			}

			for (int y = 0; y < counter; y++) { // adds a Z at every valid spot
				if (bubble[x][index] == 'P') {
					bubble[x][index] = 'P';
					index++;
				} else if (bubble[x][index] == 'T') {
					bubble[x][index] = 'T';
					index++;
				} else if (bubble[x][index] == 0 || bubble[x][index] == 'E') {
					// ^^^^^^ tree removed here || bubble[x][index] == 'T

					bubble[x][index] = 'Z';
					index++;
				} else if (bubble[x][index] == 'A' || bubble[x][index] == 'B' || bubble[x][index] == 'V'
						|| bubble[x][index] == 'X') {

					int[] temp = { x, index };
					addToList(temp, i, j);
					// rangeIndex.add(temp);
					bubble[x][index] = 'D';
					index++;
				} else {

					index++;
				}
			}

			if (x >= bubbleSize) {
				index = x - bubbleSize;
			} else {
				index = bubbleSize - x;
			}
			// reset index to set non - valid indexs
			int temp = index;
			for (int z = 0; z < bubble[x].length; z++) { // adds F to every non-valid location
				if (z == index) {
					// in bubble
					for (int w = 0; w < counter; w++) {

						if (bubble[x][temp] != 'Z' && bubble[x][temp] != 'T' && bubble[x][temp] != 'P') {
							bubble[x][temp] = 'F';
						}
						temp++;
					}
					z += counter - 1;
					// loop counter times then z + index
				} else {
					// out bubble
					bubble[x][z] = 'F';

				}

			}
			if (x >= bubbleSize) {
				counter -= 2;
			} else {
				counter += 2;
			}

		}
		for (int x = 0; x < bubble.length; x++) {
			for (int y = 0; y < bubble[x].length; y++) {
				if (bubble[x][y] == 0) {
					bubble[x][y] = 'F';
				}
			}
		}
		return bubble;

	}

	/**
	 * Method for changing type of board from character to boolean.
	 * 
	 * @param bubble
	 *            bubble character 2D array.
	 * @return Boolean 2D array of board.
	 */

	public boolean[][] changeTypeBoard(char[][] bubble) {
		boolean[][] boardBoolean = new boolean[bubble.length][bubble[0].length];

		for (int i = 0; i < bubble.length; i++) {
			for (int j = 0; j < bubble[i].length; j++) {
				// if the char board has an F, it's because it is not part of the bubble
				if (bubble[i][j] == 'F') {
					boardBoolean[i][j] = false;
				} else if (bubble[i][j] == 'Z') {
					// if the char board has a X, it represents a spot the human is allowed to go on
					boardBoolean[i][j] = true;
				} else if (bubble[i][j] == 'D') {
					// if the char board has a t (lower case), it represents a tree, which is
					// something the human should be allowed to click on
					boardBoolean[i][j] = false;
				} else if (bubble[i][j] == 'R') {
					// if the char board has an R, it is a rock, something the human cannot click on
					// or pass through
					boardBoolean[i][j] = false;
				}
			}
		}

		return boardBoolean;
	}

	/**
	 * if a dinosaur is in the human bubble, the index gets added to a list
	 * 
	 * @param index
	 *            int[] the index of the dinosaur
	 * @param humanX
	 *            human`s X
	 * @param humanY
	 *            human`s Y
	 */
	public void addToList(int[] index, int humanX, int humanY) {
		int x = index[0];
		int y = index[1];
		int endX = 0;
		int endY = 0;
		if (x < MAX_MOVES) {
			endX = x + humanX;
			endX = endX - MAX_MOVES;
		} else if (x > MAX_MOVES) {
			endX = x - MAX_MOVES;
			endX = endX + humanX;
		} else {
			endX = humanX;
		}
		if (y < MAX_MOVES) {
			endY = y + humanY;
			endY = endY - MAX_MOVES;
		} else if (y > MAX_MOVES) {

			endY = y - MAX_MOVES;
			endY = endY + humanY;
		} else {
			endY = humanY;
		}
		int[] temp = { endX, endY };
		rangeIndex.add(temp);
	}

	/**
	 * @return the rangeIndex
	 */
	public ArrayList<int[]> getRangeIndex() {
		return rangeIndex;
	}

	/**
	 * @param rangeIndex
	 *            the rangeIndex to set
	 */
	public void setRangeIndex(ArrayList<int[]> rangeIndex) {
		this.rangeIndex = rangeIndex;
	}

	/**
	 * @return the bubble
	 */
	public char[][] getBubble() {
		return bubble;
	}

	/**
	 * @param bubble
	 *            the bubble to set
	 */
	public void setBubble(char[][] bubble) {
		this.bubble = bubble;
	}

}
