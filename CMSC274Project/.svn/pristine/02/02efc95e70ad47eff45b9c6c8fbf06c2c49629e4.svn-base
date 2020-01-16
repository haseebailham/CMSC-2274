package edu.ben.tests;

public class HumanBubbleTest {

	public static final char VALID = 'V';
	private static char[][] board = new char[10][10];

	public static void main(String[] args) {
		makeBubble(5, 4);
	}

	public static void makeBubble(int row, int column) {
		// 5, 4
		board[row][column] = 'H';
		int counter = 3;

		// 2
		int minRow = row - 3; 
		// 8
		int maxRow = row + 3;
		// 1
		int minCol = column - 3;
		// 7
		int maxCol = column + 3;

		while (counter >= 0) {
			// horizontal right 
			for (int i = column + 1; i <= column + counter; i++) {
				board[row][i] = 'V';
			}

			// horizontal left
			for (int i = column - 1; i >= column - counter; i--) {
				board[row][i] = 'V';
			}

			// vertical up
			for (int i = row - 1; i >= row - counter; i--) {
				board[i][column] = 'V';
			}

			// vertical down
			for (int i = row + 1; i <= row + counter; i++) {
				board[i][column] = 'V';
			}	
			counter--;
		}
	
		displayBoard();


	}

	public static void displayBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] != VALID && board[i][j] != 'H') {
					System.out.print("[ ]");
				} else
					System.out.print("[" + board[i][j] + "]");
			}

			System.out.println();
		}
		System.out.println();
	}

}

