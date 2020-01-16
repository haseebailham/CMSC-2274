package edu.ben.model;

import java.util.Stack;

/**
 * Lava Movement class. 
 * Spread method which moves lava in game grid from volcano
 * @author haseebailham
 * @version 1.0
 */
public class LavaMovement {

	/**
	 * Number of columns
	 */
	public static final int NUM_COL = 12;

	/**
	 * Volcano X position
	 */
	private int volcanoX;

	/**
	 * Counter
	 */
	private int counter = 1;
	
	/**
	 * new lava positions
	 */
	private Stack<int[]> newLavaPos = new Stack<int[]>();
	
	/**
	 * New positions
	 */
	private Stack<int[]> positions = new Stack<int[]>();

	/**
	 * Public constructor for Lava Movement class
	 * @param board
	 * 				Board
	 * @param volcanoX
	 * 				volcano position x
	 * @param volcanoY
	 * 				volcano position y
	 */
	public LavaMovement(int volcanoX) {
		this.volcanoX = volcanoX;
	}

	/**
	 * Spread method, spreads lava from volcano every time its called.
	 * @return
	 * 			True - Human was in position where lava spread
	 * 			False - No Human, just other obstacles (Tree, Rock)
	 */
	public boolean spread(char[][] board, int[] dinoPrevPosition) {
		// clears every time so it only stores the new positions:
		newLavaPos.clear();
		
		// if dinosaur was in lava, updates the dinosaur position to lava.
		if (checkForDino(dinoPrevPosition)) {
			board[dinoPrevPosition[0]][dinoPrevPosition[1]] = 'L';
		}
		
		boolean noHuman = true;
		if (counter <= NUM_COL - 2) {
			// do spreading algorithm here:

			for (int i = volcanoX; i >= volcanoX - counter; i--) {
				int[] arr = {i, counter};
				if (i >= 0) {
					if (board[i][counter] == 'H') {
						noHuman = false;
						newLavaPos.push(arr);
					} else {
						board[i][counter] = 'L';
						newLavaPos.push(arr);
					}
				}
			}

			// get rows:
			for (int i = 0; i < counter; i++) {
				int[] arr = {volcanoX - counter, i};
				if (counter < 10) {
					if (board[volcanoX - counter][i] == 'H') {
						noHuman = false;
						newLavaPos.push(arr);
					} else {
						board[volcanoX - counter][i] = 'L';
						newLavaPos.push(arr);
					}
				}
			}
		}
		counter++;
		positions.addAll(newLavaPos);
		return noHuman;
	}
	
	
	/**
	 * Checks for dinosaur position in data structure that stores all the lava positions.
	 * @param dinoPos
	 * 					Dinosaur positions
	 * @return True - If the dinosaur position is in the lava.
	 * 		   False - If the dinosaur position is not in lava.
	 */
	public boolean checkForDino(int[] dinoPos) {
		return positions.contains(dinoPos);
	}

	/**
	 * Prints board
	 * @param board
	 * 				Board
	 */
	public void printBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] != '\u0000') {
					System.out.print("[" + board[i][j] + "]");
				} else {
					System.out.print("[ ]");
				}
			}
			System.out.println();
		}
	}

	/**
	 * Gets stack which holds new lava positions
	 * @return
	 * 			Stack<Integer>
	 */
	public Stack<int[]> getLavaPos() {
		return newLavaPos;
	}
}
