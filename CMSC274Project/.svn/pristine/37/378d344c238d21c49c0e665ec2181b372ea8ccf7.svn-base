package edu.ben.dino;

import java.util.ArrayList;
import java.util.Random;

import edu.ben.model.Bubble;

/**
 * Herbivore class extends the class dino this is a subclass
 * 
 * @author abdul
 *
 */
public class Herbivore extends Dino {
	private String dinoDisplay;

	/**
	 * sets the varibles of Dino to match the herbivores needs
	 * 
	 * @param herbDinoName
	 *            The name of the herbivore
	 */
	public Herbivore(String herbDinoName) {
		setDinoDmg(10);
		setMovement(1);
		setDinoName(herbDinoName);
		setBubble(new Bubble(1));
		typeOfDino(getDinoName());
		setDinoX(getDinoX());
		setDinoY(getDinoY());
		setPrevLocation(getPrevLocation());
		setFoundHuman(false);
		setLevel(1);
	}

	@Override
	/**
	 * orverriden method of move dinosaur herbivorous only move randomly
	 * 
	 * @return a list the contains the starting location and ending location
	 */
	public ArrayList<int[]> moveDinosaur(char[][] board, int humanX, int humanY) {
		ArrayList<int[]> paths = new ArrayList<int[]>();
		boolean valid = false;
		Random rand = new Random();
		int movement = getMovement();
		int[] pos = new int[2];
		while (!valid) {
			boolean inBound = true;
			int newMove = rand.nextInt(8);
			int tempX = getDinoX();
			int tempY = getDinoY();

			if (newMove == 0) {
				tempX -= movement;
				tempY -= movement;
			} else if (newMove == 1) {
				tempX -= movement;
			} else if (newMove == 2) {
				tempX -= movement;
				tempY += movement;
			} else if (newMove == 3) {
				tempY -= movement;
			} else if (newMove == 4) {
				tempY += movement;
			} else if (newMove == 5) {
				tempX += movement;
				tempY -= movement;
			} else if (newMove == 6) {
				tempX += movement;
			} else if (newMove == 7) {
				tempX += movement;
				tempY += movement;
			}
			if (tempX < 0 || tempX >= board.length) { // X in bounds
				inBound = false;
			}
			if (tempY < 0 || tempY >= board[0].length) { // Y in bounds
				inBound = false;
			}
			if (inBound && board[tempX][tempY] == 0) { // in bounds and empty spot
				pos[0] = tempX;
				pos[1] = tempY;
				paths.add(pos); // end
				valid = true;
			}

		}
		return paths;
	}

	/**
	 * this method gives dinoDisplay a value based off class dinoName (need to still
	 * fiqure out display)
	 * 
	 * @param dinoName
	 *            the dinoName
	 */
	public void typeOfDino(String dinoName) {
		// this method needs to take a dino name then set the display, (pick of the
		// herbivore based off its name)
		if (dinoName.equalsIgnoreCase("ankylosaurus")) {
			dinoDisplay = "ankylosaurus";
			setCharName('A');
		} else if (dinoName.equalsIgnoreCase("brachiosaurus")) {
			dinoDisplay = "brachiosaurus";
			setCharName('B');
		}

	}

}
