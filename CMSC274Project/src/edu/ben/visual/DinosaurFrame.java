package edu.ben.visual;

import javax.swing.JButton;
import javax.swing.JFrame;

import edu.ben.model.DinosaurGame;

/**
 * An abstract class used by each frame of the game to gain methods all the
 * frames have similar
 * 
 * @author abdul
 *
 */
public abstract class DinosaurFrame extends JFrame {

	/**
	 * Dinosaur game object.
	 */
	protected DinosaurGame game;

	/**
	 * Public Constructor
	 * 
	 * @param game
	 *            DinosaurGame
	 */
	public DinosaurFrame(DinosaurGame game) {
		this.game = game;
	}

	/**
	 * default serial version UID
	 */
	private static final long serialVersionUID = -3878736530154561197L;

	/**
	 * method used to call the sound class which plays audio for the games current
	 * level
	 */
	public abstract void sound();

	/**
	 * adds the quit button to the frame
	 * 
	 * @return the quit button
	 */
	public abstract JButton setUpQuitLevelButton();

	/**
	 * adds a speaker button which controls the audio
	 * 
	 * @return the speaker button
	 */
	public abstract JButton addSpeakers();
}
