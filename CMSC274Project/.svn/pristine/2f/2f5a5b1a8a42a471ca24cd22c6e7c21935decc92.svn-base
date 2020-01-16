package edu.ben.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.ben.model.BackEndBoard;
import edu.ben.human.Human;
import edu.ben.human.HumanBubble;
import edu.ben.human.Pathing;

public class PathingTest {

	@Test
	public void testTree() {
		BackEndBoard backEnd = new BackEndBoard(1);
		char[][] board = backEnd.getBoard();
		board[8][0] = 'T';
		// backEnd.displayBoard();
		Human human = backEnd.getHuman();
		human.makeBubble();
		Pathing move = new Pathing(human.getBubble().getBubble(), 6, 6, 7, 6);
		move.findPath();
		boolean actual = move.isStuck();
		assertFalse(actual);
	}

	@Test
	/**
	 * test a not being stuck by trees
	 */
	public void test4x4() {
		char[][] board = new char[4][4];
		board[2][0] = 'T';
		board[2][1] = 'T';
		board[2][2] = 'T';
		HumanBubble bubb = new HumanBubble(1);
		char[][] bubble = bubb.makeBubble(board, 1, 2);

		

		Pathing move = new Pathing(bubble, 3, 0, 1, 2);
		move.findPath();
		boolean actual = move.isStuck();
		assertFalse(actual);
	}

	@Test
	/**
	 * test first level 1 human start invaild move
	 */
	public void testHumanlvl1False() {

		HumanBubble bubb = new HumanBubble(1);
		BackEndBoard backEnd = new BackEndBoard(1);
		bubb.makeBubble(backEnd.getBoard(), 9, 0); // human is at 6,6
		Pathing move = new Pathing(bubb.getBubble(), 6, 6, 1, 6);
		boolean actual = move.findPath();
		assertFalse(actual);
	}

	@Test
	/**
	 * test first level 1 human start under MAX_MOVES
	 */
	public void testHumanlvl1True() {
		HumanBubble bubb = new HumanBubble(1);
		BackEndBoard backEnd = new BackEndBoard(1);
		bubb.makeBubble(backEnd.getBoard(), 9, 0); // human is at 6,6 (center
													// of bubble

		Pathing move = new Pathing(bubb.getBubble(), 6, 6, 3, 8);
		boolean actual = move.findPath();
		assertTrue(actual);
	}
	@Test
	public void testPathing() { // if human not stuck
		BackEndBoard backEnd = new BackEndBoard(1);
		char[][] board = new char[8][8];
		board[6][1] = 'H';
		board[5][0] = 'R';
		board[7][1] = 'R';
		board[6][2] = 'B';
		board[5][1] = 'A';
		Human human = new Human(1, board);
		human.addNewPosition(6, 1);
		human.setTarget(5, 3);
		human.moveHuman();
		boolean actual = human.isStuck();
		assertFalse(actual);

	}

	@Test
	public void testStuckPathing() { // if human is stuck
		BackEndBoard backEnd = new BackEndBoard(1);
		char[][] board = new char[8][8];
		board[7][1] = 'H';
		board[7][0] = 'R';
		board[7][2] = 'R';
		board[6][1] = 'B';
		Human human = new Human(1, board);
		human.addNewPosition(7, 1);
		human.setTarget(5, 3);
		human.moveHuman();
		boolean actual = human.isStuck();
		assertTrue(actual);

	}

	@Test
	public void testPathingByTree() {
		BackEndBoard backEnd = new BackEndBoard(1);
		char[][] board = backEnd.getBoard();

		Human human = backEnd.getHuman();
		human.addNewPosition(9, 7);
		human.setTarget(6, 10);
		boolean actual = human.moveHuman();
		assertFalse(actual);

	}

	@Test
	public void testStuckPathing2() {
		BackEndBoard backEnd = new BackEndBoard(1);
		char[][] board = backEnd.getBoard();
		backEnd.display(board);

		Human human = backEnd.getHuman();
		human.addNewPosition(9, 7);
		human.setTarget(6, 10);
		human.moveHuman();
		human.addNewPosition(9, 7);
		human.setTarget(9, 8);
		boolean actual = human.isStuck();
		assertFalse(actual);

	}

	@Test
	public void testPathing2() {
		BackEndBoard backEnd = new BackEndBoard(1);
		Human human = backEnd.getHuman(); // gets human from lvl 1
		human.setTarget(9, 3);
		boolean actual = human.moveHuman();
		assertTrue(actual);

	}

	@Test
	public void testPathing3() {
		BackEndBoard backEnd = new BackEndBoard(1);
		Human human = backEnd.getHuman(); // gets human from lvl 1
		human.addNewPosition(7, 1);
		human.setTarget(8, 0);

		boolean actual = human.moveHuman();
		assertTrue(actual);

	}

	@Test
	public void testPathing4() {
		BackEndBoard backEnd = new BackEndBoard(1);
		char[][] board = new char[8][8];
		board[6][0] = 'H';
		board[5][0] = 'R';
		board[7][1] = 'R';
		board[6][1] = 'B';
		board[5][1] = 'A';
		Human human = new Human(1, board);
		human.addNewPosition(6, 0);
		human.setTarget(7, 0);
		boolean actual = human.moveHuman();
		assertTrue(actual);

	}

	@Test
	public void testPathing5() {
		BackEndBoard backEnd = new BackEndBoard(1);
		char[][] board = new char[8][8];
		board[6][0] = 'H';
		board[5][0] = 'R';
		board[7][1] = 'R';
		board[6][1] = 'T';
		board[5][1] = 'A';
		Human human = new Human(1, board);
		human.addNewPosition(6, 0);
		human.setTarget(6, 1);
		boolean actual = human.moveHuman();
		assertTrue(actual);

	}

	@Test
	public void testEndingOnEgg() {
		BackEndBoard backEnd = new BackEndBoard(1);
		char[][] board = new char[8][8];
		board[6][0] = 'H';
		board[5][0] = 'R';
		board[7][1] = 'R';
		board[6][1] = 'P';
		board[5][1] = 'A';
		Human human = new Human(1, board);
		human.addNewPosition(6, 0);
		human.setTarget(6, 1);
		boolean actual = human.moveHuman();
		assertTrue(actual);

	}

	@Test
	public void testPassingEgg() {
		BackEndBoard backEnd = new BackEndBoard(1);
		char[][] board = new char[8][8];
		board[6][0] = 'H';
		board[5][0] = 'R';
		board[7][1] = 'R';
		board[6][1] = 'P';
		board[5][1] = 'A';
		Human human = new Human(1, board);
		human.addNewPosition(6, 0);
		human.setTarget(6, 1);
		backEnd.display(board);
		human.makeBubble();
		backEnd.display(human.getBubble().getBubble());
		human.moveHuman();
		boolean actual = human.moveHuman();
		assertTrue(actual);

	}

	@Test
	public void testPathingTrue() {
		BackEndBoard backEnd = new BackEndBoard(1);
		Human human = backEnd.getHuman(); // gets human from lvl 1
		human.setTarget(8, 1);
		boolean actual = human.moveHuman();

		backEnd.removeIndex(human.removePrevPosition());
		backEnd.placeCharBoard(8, 1, 'H');
		human.setTarget(9, 0);
		actual = human.moveHuman();
		backEnd.removeIndex(human.removePrevPosition());
		backEnd.placeCharBoard(9, 0, 'H');

		assertTrue(actual);
	}

	@Test
	public void testPathingExit() {
		BackEndBoard backEnd = new BackEndBoard(1);
		Human human = backEnd.getHuman(); // gets human from lvl 1
		human.setTarget(9, 16);
		human.addNewPosition(9, 15);

		boolean actual = human.moveHuman();

		backEnd.removeIndex(human.removePrevPosition());
		backEnd.placeCharBoard(human.getHumanX(), human.getHumanY(), 'H');
		assertTrue(actual);
	}

}
