package edu.ben.dino;

import edu.ben.model.Bubble;

/**
 * A sub class trex which changes variables of dino
 * 
 * @author abdul
 *
 */
public class Trex extends Dino {
	/**
	 * sets the varibles
	 */
	public Trex() {
		setDinoDmg(50);
		setMovement(3);
		setDinoName("Trex");
		setCharName('X');
		setBubble(new Bubble(3));
		setDinoX(getDinoX());
		setDinoY(getDinoY());
		setPrevLocation(getPrevLocation());
	}

}
