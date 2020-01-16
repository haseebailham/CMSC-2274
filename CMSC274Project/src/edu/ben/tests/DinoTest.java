package edu.ben.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import edu.ben.dino.Dino;
import edu.ben.dino.Herbivore;
import edu.ben.dino.Trex;
import edu.ben.dino.Velociraptor;

public class DinoTest {

	@Test
	/**
	 * test move dino for herbivore
	 */
	public void moveTest() {
		char[][] board = new char[10][17];
		Dino temp = new Herbivore("Ankylosaurus");
		temp.setDinoX(5);
		temp.setDinoY(5);
		ArrayList<int[]> actual = temp.moveDinosaur(board, 0, 0);
		boolean test = true;
		if (actual.get(0)[0] == 5 && actual.get(0)[1] == 5) {
			test = false;
		}
		assertTrue(test);
	}

	@Test
	/**
	 * test move dino for herbivore
	 */
	public void moveTest2() {
		char[][] board = new char[10][17];
		Dino temp = new Herbivore("Ankylosaurus");
		temp.setDinoX(4);
		temp.setDinoY(1);
		ArrayList<int[]> actual = temp.moveDinosaur(board, 0, 0);
		boolean test = true;
		if (actual.get(0)[0] == 4 && actual.get(0)[1] == 1) {
			test = false;
		}
		assertTrue(test);
	}

	@Test
	/**
	 * test move dino for lvl 2
	 */
	public void moveTestlvl2() {
		char[][] board = new char[10][17];
		Dino temp = new Velociraptor();
		temp.setDinoX(3);
		temp.setDinoY(1);
		ArrayList<int[]> actual = temp.moveDinosaur(board, 0, 0);
		boolean test = true;
		if (actual.get(0)[0] == 3 && actual.get(0)[1] == 1) {
			test = false;
		}
		assertTrue(test);
	}

	@Test
	/**
	 * test move dino for lvl 2
	 */
	public void moveTest2lvl2() {
		char[][] board = new char[10][17];
		Dino temp = new Velociraptor();
		temp.setDinoX(6);
		temp.setDinoY(9);
		ArrayList<int[]> actual = temp.moveDinosaur(board, 0, 0);
		boolean test = true;
		if (actual.get(0)[0] == 6 && actual.get(0)[1] == 9) {
			test = false;
		}
		assertTrue(test);
	}

	@Test
	/**
	 * test move dino for lvl 3
	 */
	public void moveTestlvl3() {
		char[][] board = new char[10][17];
		Dino temp = new Trex();
		temp.setDinoX(9);
		temp.setDinoY(0);
		ArrayList<int[]> actual = temp.moveDinosaur(board, 0, 0);
		boolean test = true;
		if (actual.get(0)[0] == 9 && actual.get(0)[1] == 0) {
			test = false;
		}
		assertTrue(test);
	}
}
