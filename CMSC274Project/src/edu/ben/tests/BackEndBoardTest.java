package edu.ben.tests;

import java.io.FileNotFoundException;

import org.junit.Test;

import edu.ben.model.BackEndBoard;
import edu.ben.dino.Herbivore;
import edu.ben.dino.Velociraptor;
import student.TestCase;

/**
 * Back end board tests for back end board class
 * 
 * @author akhan
 * @author mraheem
 * @version 1.0
 */
public class BackEndBoardTest extends TestCase {
	/**
	 * This tests that if you add a dino using the addDino method, it will be in the
	 * appropriate spot (level one)
	 */
	@Test
	public void testAddDinoALvl1() {
		BackEndBoard backEnd = new BackEndBoard(1);
		backEnd.createDino(6, 8, new Herbivore("Ankylosaurus"));
		char[][] board = backEnd.getBoard();
		char expected = 'A';
		char actual = board[6][8];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add a dino using the addDino method, it will be in the
	 * appropriate spot (level one)
	 */
	@Test
	public void testAddDinoBLvl1() {
		BackEndBoard backEnd = new BackEndBoard(1);
		backEnd.createDino(1, 5, new Herbivore("brachiosaurus"));
		char[][] board = backEnd.getBoard();
		char expected = 'B';
		char actual = board[1][5];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add the exit for level one, the appropriate spot will
	 * be labeled with an E
	 */
	@Test
	public void testAddExit1Lvl1() {
		BackEndBoard backEnd = new BackEndBoard(1);
		backEnd.addExit(1);
		char[][] board = backEnd.getBoard();
		char expected = 'E';
		char actual = board[0][16];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add the exit for level one, the appropriate spot will
	 * be labeled with an E
	 */
	@Test
	public void testAddExit2Lvl1() {
		BackEndBoard backEnd = new BackEndBoard(1);
		backEnd.addExit(1);
		char[][] board = backEnd.getBoard();
		char expected = 'E';
		char actual = board[1][16];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add the exit for level one, the appropriate spot will
	 * be labeled with an E
	 */
	@Test
	public void testAddExit3Lvl1() {
		BackEndBoard backEnd = new BackEndBoard(1);
		backEnd.addExit(1);
		char[][] board = backEnd.getBoard();
		char expected = 'E';
		char actual = board[2][16];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add the exit for level one, the appropriate spot will
	 * be labeled with an E
	 */
	@Test
	public void testAddExit4Lvl1() {
		BackEndBoard backEnd = new BackEndBoard(1);
		backEnd.addExit(1);
		char[][] board = backEnd.getBoard();
		char expected = 'E';
		char actual = board[3][16];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add the exit for level one, the appropriate spot will
	 * be labeled with an E
	 */
	@Test
	public void testAddExit5Lvl1() {
		BackEndBoard backEnd = new BackEndBoard(1);
		backEnd.addExit(1);
		char[][] board = backEnd.getBoard();
		char expected = 'E';
		char actual = board[4][16];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add the exit for level one, the appropriate spot will
	 * be labeled with an E
	 */
	@Test
	public void testAddExit6Lvl1() {
		BackEndBoard backEnd = new BackEndBoard(1);
		backEnd.addExit(1);
		char[][] board = backEnd.getBoard();
		char expected = 'E';
		char actual = board[5][16];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add the exit for level one, the appropriate spot will
	 * be labeled with an E
	 */
	@Test
	public void testAddExit7Lvl1() {
		BackEndBoard backEnd = new BackEndBoard(1);
		backEnd.addExit(1);
		char[][] board = backEnd.getBoard();
		char expected = 'E';
		char actual = board[6][16];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add the exit for level one, the appropriate spot will
	 * be labeled with an E
	 */
	@Test
	public void testAddExit8Lvl1() {
		BackEndBoard backEnd = new BackEndBoard(1);
		backEnd.addExit(1);
		char[][] board = backEnd.getBoard();
		char expected = 'E';
		char actual = board[7][16];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add the exit for level one, the appropriate spot will
	 * be labeled with an E
	 */
	@Test
	public void testAddExit9Lvl1() {
		BackEndBoard backEnd = new BackEndBoard(1);
		backEnd.addExit(1);
		char[][] board = backEnd.getBoard();
		char expected = 'E';
		char actual = board[8][16];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add the exit for level one, the appropriate spot will
	 * be labeled with an E
	 */
	@Test
	public void testAddExit10Lvl1() {
		BackEndBoard backEnd = new BackEndBoard(1);
		backEnd.addExit(1);
		char[][] board = backEnd.getBoard();
		char expected = 'E';
		char actual = board[9][16];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add the exit for level two, the appropriate spot will
	 * be labeled with an E
	 */
	@Test
	public void testAddExit1Lvl2() {
		BackEndBoard backEnd = new BackEndBoard(2);
		backEnd.addExit(2);
		char[][] board = backEnd.getBoard();
		char expected = 'E';
		char actual = board[2][16];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add the exit for level two, the appropriate spot will
	 * be labeled with an E
	 */
	@Test
	public void testAddExit2Lvl2() {
		BackEndBoard backEnd = new BackEndBoard(2);
		backEnd.addExit(2);
		char[][] board = backEnd.getBoard();
		char expected = 'E';
		char actual = board[3][16];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add the exit for level two, the appropriate spot will
	 * be labeled with an E
	 */
	@Test
	public void testAddExit3Lvl2() {
		BackEndBoard backEnd = new BackEndBoard(2);
		backEnd.addExit(2);
		char[][] board = backEnd.getBoard();
		char expected = 'E';
		char actual = board[4][16];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add the exit for level two, the appropriate spot will
	 * be labeled with an E
	 */
	@Test
	public void testAddExit4Lvl2() {
		BackEndBoard backEnd = new BackEndBoard(2);
		backEnd.addExit(2);
		char[][] board = backEnd.getBoard();
		char expected = 'E';
		char actual = board[5][16];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add the exit for level two, the appropriate spot will
	 * be labeled with an E
	 */
	@Test
	public void testAddExit5Lvl2() {
		BackEndBoard backEnd = new BackEndBoard(2);
		backEnd.addExit(2);
		char[][] board = backEnd.getBoard();
		char expected = 'E';
		char actual = board[6][16];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add the exit for level two, the appropriate spot will
	 * be labeled with an E
	 */
	@Test
	public void testAddExit6Lvl2() {
		BackEndBoard backEnd = new BackEndBoard(2);
		backEnd.addExit(2);
		char[][] board = backEnd.getBoard();
		char expected = 'E';
		char actual = board[7][16];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if a velociraptor is added to the board, it shows up in the
	 * appropriate spot
	 */
	@Test
	public void testAddDinoLvl2() {
		BackEndBoard backEnd = new BackEndBoard(2);
		backEnd.createDino(3, 2, new Velociraptor());
		char[][] board = backEnd.getBoard();
		char expected = 'V';
		char actual = board[3][2];
		assertEquals(expected, actual);
	}

	/**
	 * This test makes sure that when level one is generated, the human is in the
	 * right spot
	 * 
	 * @throws FileNotFoundException
	 *             if file does not exist
	 */
	@Test
	public void testAddHumanGenerateLvl1() throws FileNotFoundException {
		BackEndBoard backEnd = new BackEndBoard(1);
		backEnd.createLevel(1);
		char[][] board = backEnd.getBoard();
		char expected = 'H';
		char actual = board[9][0];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add a rock using the addRock method, it will be in the
	 * appropriate spot
	 */
	@Test
	public void testAddRock() {
		BackEndBoard backEnd = new BackEndBoard(1);
		char[][] board = backEnd.getBoard();
		backEnd.createRock(0, 3);
		char expected = 'R';
		char actual = board[0][3];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add a rock then the rockCounter will increase by one
	 */
	@Test
	public void testRockCounter() {
		BackEndBoard board = new BackEndBoard(1);
		board.createRock(0, 3);
		int expected = 33;
		int actual = board.getRockCounter();
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add rocks then the rockCounter will increase by the
	 * appropriate amount
	 */
	@Test
	public void testRockCounterMultiple() {
		BackEndBoard board = new BackEndBoard(1);
		board.createRock(1, 3);
		board.createRock(5, 4);
		board.createRock(3, 3);
		board.createRock(4, 8);
		int expected = 36;
		int actual = board.getRockCounter();
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add rocks then the rockCounter will increase by the
	 * appropriate amount
	 */
	@Test
	public void testRockCounterMultipleOneWrong() {
		BackEndBoard board = new BackEndBoard(1);
		board.createRock(0, 3);
		board.createRock(0, 3);// should not increase rock counter bc that spot would not be clear
		board.createRock(5, 2);
		board.createRock(3, 4);
		int expected = 35;
		int actual = board.getRockCounter();
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add a rock then the rockCounter will increase by one
	 */
	@Test
	public void testRockCounterPresetCounter() {
		BackEndBoard board = new BackEndBoard(2);
		board.setRockCounter(10);
		board.createRock(4, 5);
		int expected = 11;
		int actual = board.getRockCounter();
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add a tree using the addTree method, it will be in the
	 * appropriate spot
	 */
	@Test
	public void testAddTree() {
		BackEndBoard board = new BackEndBoard(2);
		board.createTree(5, 6);
		char expected = 'T';
		char actual = board.getBoard()[5][6];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add a tree then the treeCounter will increase by one
	 */
	@Test
	public void testTreeCounter() {
		BackEndBoard board = new BackEndBoard(2);
		board.createTree(1, 5);
		int expected = 8;
		int actual = board.getTreeCounter();
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add trees then the treeCounter will increase by the
	 * appropriate amount
	 */
	@Test
	public void testTreeCounterMultiple() {
		BackEndBoard board = new BackEndBoard(2);
		board.createTree(6, 5);
		board.createTree(4, 3);
		board.createTree(1, 9);
		board.createTree(0, 16);
		int expected = 11;
		int actual = board.getTreeCounter();
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add rocks then the treeCounter will increase by the
	 * appropriate amount
	 */
	@Test
	public void testTreeCounterMultipleOneWrong() {
		BackEndBoard board = new BackEndBoard(2);
		board.createTree(0, 5);
		board.createTree(0, 5);// should not increase tree counter bc that spot would not be clear
		board.createTree(0, 6);
		board.createTree(8, 4);
		board.createTree(8, 2);
		int expected = 11;
		int actual = board.getTreeCounter();
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add a tree then the treeCounter will increase by one
	 */
	@Test
	public void testTreeCounterPresetCounter() {
		BackEndBoard board = new BackEndBoard(1);
		board.setTreeCounter(25);
		board.createTree(8, 5);
		int expected = 26;
		int actual = board.getTreeCounter();
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add an egg using the addEgg method, it will be in the
	 * appropriate spot
	 */
	@Test
	public void testAddEgg() {
		BackEndBoard board = new BackEndBoard(2);
		board.createEgg(7, 4);
		char expected = 'P';
		char actual = board.getBoard()[7][4];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if you add a rock in a spot, it will not be considered clear
	 */
	@Test
	public void testClearFalse() {
		BackEndBoard board = new BackEndBoard(1);
		board.createRock(3, 9);
		assertFalse(board.clearSpot(3, 9));
	}

	/**
	 * This tests that if you don't add anything to a spot, it will be considered
	 * clear
	 */
	@Test
	public void testClearTrue() {
		BackEndBoard board = new BackEndBoard(3);
		assertTrue(board.clearSpot(8, 7));
	}

	/**
	 * This tests that the spot that has the human is not clear
	 */
	@Test
	public void testClearFalseHuman() {
		BackEndBoard board = new BackEndBoard(1);
		assertFalse(board.clearSpot(9, 0));
	}

	/**
	 * This tests that after generating a level(one), a rock is found in an intended
	 * spot
	 * 
	 * @throws FileNotFoundException
	 *             if file does not exist
	 */
	@Test
	public void testAfterGenLevelR1() throws FileNotFoundException {
		BackEndBoard board = new BackEndBoard(1);
		board.createLevel(board.getLevel());
		char expected = 'R';
		char actual = board.getBoard()[3][0];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that after generating a level(two), a rock is found in an intended
	 * spot
	 * 
	 * @throws FileNotFoundException
	 *             if file does not exist
	 */
	@Test
	public void testAfterGenLevelR2() throws FileNotFoundException {
		BackEndBoard board = new BackEndBoard(2);
		board.createLevel(board.getLevel());
		char expected = 'R';
		char actual = board.getBoard()[4][12];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that after generating a level(one), a tree is found in an intended
	 * spot
	 * 
	 * @throws FileNotFoundException
	 *             if file does not exist
	 */
	@Test
	public void testAfterGenLevelT1() throws FileNotFoundException {
		BackEndBoard board = new BackEndBoard(1);
		board.createLevel(board.getLevel());
		char expected = 'T';
		char actual = board.getBoard()[3][8];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that after generating a level(two), a tree is found in an intended
	 * spot
	 * 
	 * @throws FileNotFoundException
	 *             if file does not exist
	 */
	@Test
	public void testAfterGenLevelT2() throws FileNotFoundException {
		BackEndBoard board = new BackEndBoard(2);
		board.createLevel(board.getLevel());
		char expected = 'T';
		char actual = board.getBoard()[7][11];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that after generating a level(three), a tree is found in an
	 * intended spot
	 * 
	 * @throws FileNotFoundException
	 *             if file does not exist
	 */
	@Test
	public void testAfterGenLevelT3() throws FileNotFoundException {
		BackEndBoard board = new BackEndBoard(3);
		board.createLevel(board.getLevel());
		char expected = 'T';
		char actual = board.getBoard()[8][9];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that after generating a level(two), an egg is found in an intended
	 * spot
	 * 
	 * @throws FileNotFoundException
	 *             if file does not exist
	 */
	@Test
	public void testAfterGenLevelE2() throws FileNotFoundException {
		BackEndBoard board = new BackEndBoard(2);
		board.createLevel(board.getLevel());
		char expected = 'P';
		char actual = board.getBoard()[8][15];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that after generating a level(three), an egg is found in an
	 * intended spot
	 * 
	 * @throws FileNotFoundException
	 *             if file does not exist
	 */
	@Test
	public void testAfterGenLevelE3() throws FileNotFoundException {
		BackEndBoard board = new BackEndBoard(3);
		board.createLevel(board.getLevel());
		char expected = 'P';
		char actual = board.getBoard()[4][7];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that after generating a level (one), a dino is found in an
	 * intended spot
	 * 
	 * @throws FileNotFoundException
	 *             if file does not exist
	 */
	@Test
	public void testAfterGenLevelDA1() throws FileNotFoundException {
		BackEndBoard board = new BackEndBoard(1);
		board.createLevel(board.getLevel());
		char expected = 'A';
		char actual = board.getBoard()[1][2];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that after generating a level (one), a dino is found in an
	 * intended spot
	 * 
	 * @throws FileNotFoundException
	 *             if file does not exist
	 */
	@Test
	public void testAfterGenLevelDB1() throws FileNotFoundException {
		BackEndBoard board = new BackEndBoard(1);
		board.createLevel(board.getLevel());
		char expected = 'B';
		char actual = board.getBoard()[6][11];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that after generating a level (two), a dino is found in an
	 * intended spot
	 * 
	 * @throws FileNotFoundException
	 *             if file does not exist
	 */
	@Test
	public void testAfterGenLevelD2() throws FileNotFoundException {
		BackEndBoard board = new BackEndBoard(2);
		board.createLevel(board.getLevel());
		char expected = 'V';
		char actual = board.getBoard()[5][4];
		assertEquals(expected, actual);
	}

	/**
	 * This tests that after generating a level (three), a dino is found in an
	 * intended spot
	 * 
	 * @throws FileNotFoundException
	 *             if file does not exist
	 */
	@Test
	public void testAfterGenLevelD3() throws FileNotFoundException {
		BackEndBoard board = new BackEndBoard(3);
		board.createLevel(board.getLevel());
		char expected = 'X';
		char actual = board.getBoard()[0][11];
		assertEquals(expected, actual);
	}
}
