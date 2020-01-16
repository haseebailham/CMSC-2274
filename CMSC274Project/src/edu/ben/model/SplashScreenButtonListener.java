package edu.ben.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Button Listener for Buttons in Splash Screen of Dinosaur Game.
 * 
 * @author haseebailham
 * @version 1.0
 */
public class SplashScreenButtonListener implements ActionListener {

	/**
	 * JButton clicked
	 */
	private JButton btnClicked;
	
	/**
	 * Dinosaur game object
	 */
	private DinosaurGame game;

	/**
	 * Public constructor
	 * @param btnClicked
	 * 					current button clicked
	 * @param game
	 * 					game object
	 */
	public SplashScreenButtonListener(JButton btnClicked, DinosaurGame game) {
		this.btnClicked = btnClicked;
		this.game = game;
	}

	/**
	 * Overridden method
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String event = e.getActionCommand();
		if (event.equals("speaker")) { // turns off speaker
			Sounds.SPLASH.mute();
			ImageIcon speakerOff = new ImageIcon("speakerOff.png");
			btnClicked.setIcon(speakerOff);
			btnClicked.setActionCommand("speakerOff");
		}

		if (event.equals("speakerOff")) { // turns speaker back on
			Sounds.SPLASH.play();
			ImageIcon speakerOn = new ImageIcon("speaker.png");
			btnClicked.setIcon(speakerOn);
			btnClicked.setActionCommand("speaker");
		}

		if (event.equals("start")) {
			game.closeFrame();
			game.nextLevel();
		}

		if (event.equals("quit")) {
			game.quitGame();
		}
	}
}
