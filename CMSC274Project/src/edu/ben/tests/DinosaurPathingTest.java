package edu.ben.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import edu.ben.model.BackEndBoard;
import edu.ben.dino.Dino;
import edu.ben.dino.DinoList;
import edu.ben.dino.Trex;
import edu.ben.dino.Velociraptor;

/**
 * test class for the dinosaur pathing class
 * 
 * @author abdul
 *
 */
public class DinosaurPathingTest {
	@Test
	/**
	 * test path for lvl 2
	 */
	public void testPath() {
		char[][] board = new char[10][17];
		board[0][0] = 'V';
		board[1][2] = 'H';
		Dino temp = new Velociraptor();
		temp.setFoundHuman(true);
		temp.setDinoX(0);
		temp.setDinoY(0);
		ArrayList<int[]> actual = temp.moveDinosaur(board, 1, 2);
		int expected = 1;
		assertEquals(expected, actual.size());
	}

	@Test
	/**
	 * test path for lvl 3
	 */
	public void testPathlvl3() {
		char[][] board = new char[10][17];
		board[0][9] = 'X';
		board[1][2] = 'H';
		Dino temp = new Trex();
		temp.setFoundHuman(true);
		temp.setDinoX(0);
		temp.setDinoY(9);
		ArrayList<int[]> actual = temp.moveDinosaur(board, 1, 2);
		int expected = 6;
		assertEquals(expected, actual.size());
	}

	@Test
	/**
	 * test path for a dinosaur on lvl 2
	 */
	public void testlvl2Moves() {
		BackEndBoard backEnd = new BackEndBoard(2);
		DinoList dl = backEnd.getDl();
		Dino temp = dl.getIndex(0);
		temp.setFoundHuman(true);
		ArrayList<int[]> actual = temp.moveDinosaur(backEnd.getBoard(), 0, 0);
		int[] expected = { 0, 2 };

		assertArrayEquals(expected, actual.get(1));
	}

	@Test
	/**
	 * test path for a dinosaur on lvl 2
	 */
	public void testlvl2Moves2() {
		BackEndBoard backEnd = new BackEndBoard(2);
		DinoList dl = backEnd.getDl();
		Dino temp = dl.getIndex(1);
		temp.setFoundHuman(true);
		ArrayList<int[]> actual = temp.moveDinosaur(backEnd.getBoard(), 0, 0);
		int[] expected = { 2, 2 };

		assertArrayEquals(expected, actual.get(1));
	}

	@Test
	/**
	 * test path for a dinosaur on lvl 2
	 */
	public void testlvl2Moves3() {
		BackEndBoard backEnd = new BackEndBoard(2);
		DinoList dl = backEnd.getDl();
		Dino temp = dl.getIndex(2);
		temp.setFoundHuman(true);
		ArrayList<int[]> actual = temp.moveDinosaur(backEnd.getBoard(), 0, 0);
		int[] expected = { 1, 2 };

		assertArrayEquals(expected, actual.get(1));
	}
}
