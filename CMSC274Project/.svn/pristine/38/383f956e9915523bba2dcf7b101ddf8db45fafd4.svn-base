package edu.ben.visual;

import java.awt.event.ActionListener;
import java.util.Queue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import edu.ben.model.ButtonListener;
import edu.ben.model.DinosaurGame;

/**
 * A frame class the extends DinosaurGameGui and uses that class to handle
 * creation
 * 
 * @author abdul;
 * @author mahrukhraheem;
 * @author haseebailham
 */
public class Lvl1Frame extends DinosaurGameGUI {
	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Content pane
	 */
	public JPanel contentPane;

	/**
	 * Public constructor for lvl 1 frame
	 * 
	 * @param game
	 *            the game object class which gets set to the DinosaurGameGui class
	 */
	public Lvl1Frame(DinosaurGame game) {
		super(game);
		level = 1;
		startActionListener(game);
		btns = setUpDefaultButtonIcons(game.getBoard().getBoard());
		addLevelIcons(game.getBoard().getBoard());
	}

	@Override
	/**
	 * action listener for lvl 1
	 */
	public void startActionListener(DinosaurGame game) {
		// uses the set up methods from DinosaurGui to set up the parts of the frame
		JPanel gameGridPanel = setUpGameGrid();
		JPanel healthBarPanel = setUpHealthBar();
		JButton quitLevelButton = setUpQuitLevelButton();
		JButton speakerButton = addSpeakers();
		JPanel pointsPanel = setUpPointsPanel();
		currPointsLabel.setText("0");
		JPanel keyPanel = setUpKeyPanel(game.getLevel());
		Queue<JLabel> lbls = setUpLabels();
		contentPane = setUpContentPane();
		contentPane.add(gameGridPanel);
		contentPane.add(healthBarPanel);
		contentPane.add(quitLevelButton);
		contentPane.add(speakerButton);
		// add points panel and key panel.
		contentPane.add(pointsPanel);
		contentPane.add(keyPanel);
		while (!lbls.isEmpty()) {
			JLabel curr = lbls.remove();
			contentPane.add(curr);
		}

		sound(); // used to play sound for lvl 1
		ActionListener soundAction = new ButtonListener(game, 0, 0, btns, progressBar, currPointsLabel);
		speakerButton.addActionListener(soundAction);
		ActionListener quitGameAction = new ButtonListener(game, 0, 0, btns, progressBar, currPointsLabel);
		quitLevelButton.addActionListener(quitGameAction);
		for (int i = 0; i < BOARD_ROW; i++) {
			for (int j = 0; j < BOARD_COL; j++) {
				btns[i][j] = new JButton("");
				btns[i][j].setIcon(grass);
				// add action listeners
				ActionListener actionListener = new ButtonListener(game, i, j, btns, progressBar, currPointsLabel);

				btns[i][j].addActionListener(actionListener);
				// add(btns[i][j]);
				gameGridPanel.add(btns[i][j]);
			}
		}

		// Add action Listener for Quit Level Button:
		// closes frame.
	}

	@Override
	/**
	 * adds the board icons
	 */
	public void addLevelIcons(char[][] board) {
		ImageIcon ank = new ImageIcon("ankyl.png");
		ImageIcon brach = new ImageIcon("brachGrass.PNG");

		for (int i = 0; i < BOARD_ROW; i++) {
			for (int j = 0; j < BOARD_COL; j++) {
				if (board[i][j] == 'A') {
					btns[i][j].setIcon(ank);
				} else if (board[i][j] == 'B') {
					btns[i][j].setIcon(brach);
				}
			}
		}
		JLabel something = new JLabel();
		something.setBounds(0, 0, 1200, 928);
		contentPane.add(something);
	}
}
