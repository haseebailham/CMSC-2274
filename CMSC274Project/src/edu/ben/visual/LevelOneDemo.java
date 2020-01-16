package edu.ben.visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import edu.ben.model.BackEndBoard;
import edu.ben.model.ButtonListener;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class LevelOneDemo extends JFrame {

	/**
	 * Board size global variable.
	 */
	private final int BOARD_ROW = 10;

	private final int BOARD_COL = 17;

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Content pane.
	 */
	private JPanel contentPane;

	/**
	 * Start of health value.
	 */
	private int healthValue = 100;

	/**
	 * Button for grid, 10 x 10.
	 */
	final JButton[][] btns = new JButton[BOARD_ROW][BOARD_COL];

	/**
	 * Human x position.
	 */
	public int humanX = 9;

	/**
	 * Human y position.
	 */
	public int humanY = 0;

	public JProgressBar progressBar;

	private LinkedList<JButton> rocks = new LinkedList<JButton>();
	private LinkedList<JButton> trees = new LinkedList<JButton>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LevelOneDemo frame = new LevelOneDemo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LevelOneDemo() {
		//		Level1 lvl = new Level1();
		BackEndBoard backEnd = new BackEndBoard(1);
		char[][] board = backEnd.getBoard();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setBounds(100, 100, 700, 500);
		setBounds(500, 20, 40, 40);
		setSize(new Dimension(1350, 815));
		contentPane = new JPanel();
		setContentPane(contentPane);
		// contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		// contentPane.setLayout(new BorderLayout(0, 0));

		contentPane.setBackground(Color.BLACK);
		contentPane.setLayout(null);

		JPanel gameGridPanel = new JPanel();
		gameGridPanel.setBounds(6, 6, 1088, 782);
		gameGridPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		gameGridPanel.setLayout(new BorderLayout(0, 0));
		gameGridPanel.setLayout(new GridLayout(0, 17, 1, 1));
		gameGridPanel.setBackground(new Color(0, 0, 0));
		contentPane.add(gameGridPanel);

		// HEALTH BAR:
		JPanel healthBarPanel = new JPanel();
		healthBarPanel.setBackground(new Color(0, 100, 0));
		healthBarPanel.setBounds(1106, 37, 237, 71);
		contentPane.add(healthBarPanel);
		healthBarPanel.setLayout(null);

		// Progress bar:
		progressBar = new JProgressBar(0, 100);
		progressBar.setBounds(6, 18, 213, 26);
		healthBarPanel.add(progressBar);


		// starting health
		progressBar.setMaximum(100);
		progressBar.setValue(healthValue);
		progressBar.setForeground(Color.WHITE);
		progressBar.setStringPainted(true);

		JLabel backgroundHlth = new JLabel("");
		backgroundHlth.setIcon(new ImageIcon("pointsBg.png"));
		backgroundHlth.setBounds(16, -13, 221, 84);
		healthBarPanel.add(backgroundHlth);
		// makes the whole board filled with grass
		ImageIcon grass = new ImageIcon("grass.jpg");
		for (int i = 0; i < BOARD_ROW; i++) {
			for (int j = 0; j < BOARD_COL; j++) {
				btns[i][j] = new JButton("");
				btns[i][j].setIcon(grass);
				// add action listeners
				//				ActionListener actionListener = new ButtonListenerLevel1(lvl, i, j, btns, progressBar);
				//				btns[i][j].addActionListener(actionListener);
				// add(btns[i][j]);
				gameGridPanel.add(btns[i][j]);
			}
		}

		// sets the exit (rightmost column of the board)
		for (int i = 0; i < BOARD_ROW; i++) {
			if (board[i][16] == 'E') {
				btns[i][16].setIcon(null);
				btns[i][16].setBackground(Color.DARK_GRAY);
				btns[i][16].setOpaque(true);
			}
		}
		ImageIcon human = new ImageIcon("humanGrass.PNG");
		btns[humanX][humanY].setIcon(human);

		// places the rocks and trees in the appropriate spots while adding them to the
		// respective linked lists
		ImageIcon rock = new ImageIcon("rockOnGrass.png");
		ImageIcon tree = new ImageIcon("treeGrass.PNG");
		// the dinosaurs pictures are only temporary, they will be better later
		ImageIcon ank = new ImageIcon("ankyl.png");
		ImageIcon brach = new ImageIcon("brachGrass.PNG");
		for (int i = 0; i < BOARD_ROW; i++) {
			for (int j = 0; j < BOARD_COL; j++) {
				if (board[i][j] == 'R') {
					btns[i][j].setIcon(rock);
					rocks.add(btns[i][j]);
				} else if (board[i][j] == 'T') {
					btns[i][j].setIcon(tree);
					trees.add(btns[i][j]);
				} else if (board[i][j] == 'B') {
					btns[i][j].setIcon(brach);
				} else if (board[i][j] == 'A') {
					btns[i][j].setIcon(ank);
				}
			}
		}
		// makes the rock buttons disabled since the player should not be able to stand
		// them
		for (int i = 0; i < rocks.size(); i++) {
			rocks.get(i).setDisabledIcon(rock);
			rocks.get(i).setEnabled(false);
		}

		ImageIcon dino = new ImageIcon("dinosaur.png");
		ImageIcon island = new ImageIcon("rsz_2islandpic.png");

		ImageIcon quit = new ImageIcon("quitLevel.png");
		JButton quitLevelButton = new JButton("");
		quitLevelButton.setBounds(1142, 709, 157, 71);
		quitLevelButton.setIcon(quit);
		quitLevelButton.setContentAreaFilled(false);
		quitLevelButton.setFocusPainted(false);
		quitLevelButton.setBorderPainted(false);

		quitLevelButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				SplashScreenGUI frame = new SplashScreenGUI(null);
				frame.setVisible(true);
			}
		});
		contentPane.add(quitLevelButton);

		// weird, moves picture around if this is not there.
		JLabel something = new JLabel();
		something.setBounds(0, 0, 1028, 788);
		contentPane.add(something);

		JLabel lblHealth = new JLabel("HEALTH");
		lblHealth.setForeground(Color.GREEN.brighter());
		lblHealth.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblHealth.setBounds(1183, 19, 79, 16);
		contentPane.add(lblHealth);

		JPanel pointsPanel = new JPanel();
		pointsPanel.setBackground(Color.BLACK);
		pointsPanel.setBounds(1106, 137, 237, 71);
		contentPane.add(pointsPanel);
		pointsPanel.setLayout(null);

		JLabel currPointsLabel = new JLabel("0");
		currPointsLabel.setFont(new Font("Avenir Next", Font.BOLD, 30));
		currPointsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		currPointsLabel.setForeground(Color.BLACK);
		currPointsLabel.setBounds(6, 6, 225, 59);
		pointsPanel.add(currPointsLabel);

		JLabel lblPoints = new JLabel("POINTS");
		lblPoints.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblPoints.setForeground(Color.ORANGE);
		lblPoints.setBounds(1183, 120, 61, 16);
		contentPane.add(lblPoints);

		JPanel keyPanel = new JPanel();
		keyPanel.setBackground(new Color(250, 235, 215));
		keyPanel.setBounds(1106, 237, 237, 384);
		contentPane.add(keyPanel);
		keyPanel.setLayout(null);

		JLabel berryL = new JLabel();
		berryL.setBounds(6, 6, 34, 31);
		berryL.setIcon(new ImageIcon("berryBushResize.PNG"));
		keyPanel.add(berryL);
		
		JLabel dinoL = new JLabel();
		dinoL.setBounds(6, 46, 34, 31);
		dinoL.setIcon(new ImageIcon("trexResize.png"));
		keyPanel.add(dinoL);

		JLabel lavaL = new JLabel();
		lavaL.setBounds(6, 89, 34, 31);
		lavaL.setIcon(new ImageIcon("lava.gif"));
		keyPanel.add(lavaL);

		JLabel exitL = new JLabel();
		exitL.setBounds(6, 220, 34, 31);
		exitL.setIcon(new ImageIcon("boat1Resize.PNG"));
		keyPanel.add(exitL);

		JLabel exit2L = new JLabel();
		exit2L.setBounds(52, 220, 34, 31);
		exit2L.setIcon(new ImageIcon("boat2Resize.PNG"));
		keyPanel.add(exit2L);

		JLabel eggLabel = new JLabel();
		eggLabel.setBounds(6, 132, 34, 31);
		eggLabel.setIcon(new ImageIcon("eggRoundResize.PNG"));
		keyPanel.add(eggLabel);

		JTextArea text = new JTextArea();
		text.setEditable(false);
		text.setFont(new Font("Verdana", Font.PLAIN, 12));
		text.setText("Woah, a T-Rex AND a volcano?!\nHurry and try to outrace"
				+ " the lava\n spilling and the dinosaur coming" + "\n after you reach the boat for safety.");
		text.setBackground(Color.LIGHT_GRAY);
		text.setBounds(6, 263, 225, 115);
		keyPanel.add(text);

		JLabel dinoD = new JLabel("- DINOSAUR");
		dinoD.setFont(new Font("Gurmukhi MT", Font.BOLD, 14));
		dinoD.setBounds(52, 46, 122, 31);
		keyPanel.add(dinoD);

		JLabel lavaD = new JLabel("- LAVA");
		lavaD.setFont(new Font("Gurmukhi MT", Font.BOLD, 14));
		lavaD.setBounds(52, 89, 168, 31);
		keyPanel.add(lavaD);

		JLabel exitD = new JLabel("- EXIT");
		exitD.setFont(new Font("Gurmukhi MT", Font.BOLD, 14));
		exitD.setBounds(91, 220, 167, 31);
		keyPanel.add(exitD);

		JLabel eggD = new JLabel("- EGG");
		eggD.setFont(new Font("Gurmukhi MT", Font.BOLD, 14));
		eggD.setBounds(52, 132, 168, 26);
		keyPanel.add(eggD);
		
		JLabel dinoBub3 = new JLabel();
		dinoBub3.setBounds(6, 175, 34, 31);
		dinoBub3.setIcon(new ImageIcon("groundRed.png"));
		keyPanel.add(dinoBub3);
		
		JLabel dinoL3 = new JLabel("- DINOSAUR SEARCH AREA");
		dinoL3.setFont(new Font("Gurmukhi MT", Font.PLAIN, 14));
		dinoL3.setBounds(52, 171, 179, 37);
		keyPanel.add(dinoL3);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("keyBg.png"));
		background.setBounds(0, 0, 237, 384);
		keyPanel.add(background);
	
		JLabel lblKey = new JLabel("KEY");
		lblKey.setForeground(new Color(153, 50, 204));
		lblKey.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblKey.setBounds(1193, 220, 61, 16);
		contentPane.add(lblKey);

		JButton speaker = new JButton("New button");
		speaker.setBounds(1186, 653, 58, 57);
		contentPane.add(speaker);

		JLabel lblSoundOnoff = new JLabel("Sound On/Off:");
		lblSoundOnoff.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblSoundOnoff.setForeground(new Color(211, 211, 211));
		lblSoundOnoff.setBounds(1158, 625, 127, 16);
		contentPane.add(lblSoundOnoff);

	}

	/**
	 * This method shows the riddle the user needs to answer
	 * 
	 * @param riddle
	 *            the riddle that needs to be answered
	 * @return the answer that the user gave
	 */
	public String treeRiddle(String riddle) {
		String answer = JOptionPane.showInputDialog(riddle);
		return answer;
	}

	/**
	 * This method determines if the answer the user gave was correct
	 * 
	 * @param correct
	 *            whether or not the answer was correct
	 */
	public void correctTreeAnswer(boolean correct) {
		if (correct) {
			JOptionPane.showMessageDialog(null, "You got the riddle right!");
		}
	}

	public void incorrectTreeAnswer() {
		JOptionPane.showMessageDialog(null, "Sorry, incorrect answer.");
	}
	/**
	 * This method displays a message to the user so they know they have passed this
	 * level
	 * 
	 * @param pass
	 *            whether or not the user passed the level
	 */
	public void passLevel() {
		ImageIcon confetti = new ImageIcon("confetti.png");
		JFrame box = new JFrame();
		JOptionPane.showMessageDialog(box,
				"Congratulations! You escaped the first part of the island! On to the next part...", "You did it!",
				JOptionPane.INFORMATION_MESSAGE, confetti);
	}

	/**
	 * Invalid move messsage to user.
	 */
	public void invalidMove() {
		JOptionPane.showMessageDialog(null, "Not a valid move. Try again...");
	}

	/**
	 * Lost game message
	 */
	public void lostGameMessage() {
		JOptionPane.showMessageDialog(null, "You died...");
	}

	/**
	 * The dinosaur damage because human was in their zone.
	 */
	public void dinosaurDamageMessage() {
		JOptionPane.showMessageDialog(null, "Oh no! The dinosaur got you!");
	}
}

