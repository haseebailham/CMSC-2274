package edu.ben.dino;

import java.util.ArrayList;

import edu.ben.human.Node;

/**
 * Used to find the shortest path to the humans current location which allows a
 * dinosaur to follow the human
 * 
 * @author abdul
 *
 */
public class DinosaurPathing {
	/**
	 * 2 -d array of nodes
	 */
	private Node[][] grid; // 2-D node array
	/**
	 * board array
	 */
	private char[][] board; // char board
	/**
	 * char 2 - D array used for back end display
	 */
	char[][] test; // used for display
	/**
	 * list that stores the final path to target
	 */
	private ArrayList<int[]> path = new ArrayList<int[]>(); // holds the [x][y] from the target to start
	/**
	 * starting X
	 */
	private int startX = 0; // starting of X
	/**
	 * starting Y
	 */
	private int startY = 0; // starting of Y
	/**
	 * end X
	 */
	private int endX = 0; // end X
	/**
	 * target Y
	 */
	private int targetY = 0; // target Y
	/**
	 * a constant cost G
	 */
	private int G = 10; // G cost
	/**
	 * starting node
	 */
	private Node start; // node start point
	/**
	 * ending node
	 */
	private Node end; // end point node
	/**
	 * list that stores all the nodes to search
	 */
	private ArrayList<Node> open = new ArrayList<Node>(); // list to store all the searchable nodes
	/**
	 * list of nodes that have been searched
	 */
	private ArrayList<Node> closed = new ArrayList<>(); // list to store the nodes that have been searched

	/**
	 * Pathing algorithm for the dinosaur chasing movement
	 * 
	 * @param board
	 *            2-d char board array
	 * @param startX
	 *            starting X location for dinosaur
	 * @param startY
	 *            starting Y location for dinosaur
	 * @param endX
	 *            end location X
	 * @param endY
	 *            end location Y
	 */
	public DinosaurPathing(char[][] board, int endX, int endY, Dino temp) {

		grid = new Node[board.length][board[0].length];
		test = new char[board.length][board[0].length];
		this.board = board;
		this.startX = temp.getDinoX();
		this.startY = temp.getDinoY();
		this.endX = endX;
		this.targetY = endY;
		calcH(board, endX, endY); // find all H cost in the board
		// display();

		start = grid[startX][startY];
		end = grid[endX][endY];

		open.add(start); // add start to open list
	}

	/**
	 * find a path from start to end then sees if the path is less then the dinosaur
	 * movement amount
	 * 
	 * @return the path to the human
	 */
	public ArrayList<int[]> findPath() {
		if (isVaildMove(board, endX, targetY)) { // check to see if a vaild move first
			while (true) {
				Node temp = findSmallestF();
				// open.remove(temp);
				// -> used for display
				// displayMovement(temp.getX(), temp.getY());

				if (temp == null) { // empty Node
					break;
				}

				if (temp == end) { // node reached target
					closed.add(temp); // temp is end
					break;
				}

				closed.add(temp); // removes the Node with the currently smallest F value
				// left node
				try {
					if (grid[temp.getX()][temp.getY() - 1].getH() != -1.0
							&& !open.contains(grid[temp.getX()][temp.getY() - 1])
							&& !closed.contains(grid[temp.getX()][temp.getY() - 1])) {
						double tempF = temp.getF() + G;
						double compareCost = grid[temp.getX()][temp.getY() - 1].getH() + tempF;
						grid[temp.getX()][temp.getY() - 1].setG(G); // sets G
						if (grid[temp.getX()][temp.getY() - 1].getF() > compareCost
								|| !open.contains(grid[temp.getX()][temp.getY() - 1])) {

							grid[temp.getX()][temp.getY() - 1].setF(compareCost);
						}
						grid[temp.getX()][temp.getY() - 1].setParent(temp);
						open.add(grid[temp.getX()][temp.getY() - 1]);

					}
				} catch (IndexOutOfBoundsException e) {

				}
				// right node
				try {
					if (grid[temp.getX()][temp.getY() + 1].getH() != -1.0
							&& !open.contains(grid[temp.getX()][temp.getY() + 1])
							&& !closed.contains(grid[temp.getX()][temp.getY() + 1])) {
						double tempF = temp.getF() + G;
						double compareCost = grid[temp.getX()][temp.getY() + 1].getH() + tempF;
						grid[temp.getX()][temp.getY() + 1].setG(G); // sets G
						if (grid[temp.getX()][temp.getY() + 1].getF() > compareCost
								|| !open.contains(grid[temp.getX()][temp.getY() + 1])) {

							grid[temp.getX()][temp.getY() + 1].setF(compareCost);
						}
						grid[temp.getX()][temp.getY() + 1].setParent(temp);
						open.add(grid[temp.getX()][temp.getY() + 1]);

					}

				} catch (IndexOutOfBoundsException e) {

				}
				// up node
				try {
					if (grid[temp.getX() - 1][temp.getY()].getH() != -1.0
							&& !open.contains(grid[temp.getX() - 1][temp.getY()])
							&& !closed.contains(grid[temp.getX() - 1][temp.getY()])) {
						double tempF = temp.getF() + G;
						double compareCost = grid[temp.getX() - 1][temp.getY()].getH() + tempF;
						grid[temp.getX() - 1][temp.getY()].setG(G); // sets G
						if (grid[temp.getX() - 1][temp.getY()].getF() > compareCost
								|| !open.contains(grid[temp.getX() - 1][temp.getY()])) {

							grid[temp.getX() - 1][temp.getY()].setF(compareCost);
						}
						grid[temp.getX() - 1][temp.getY()].setParent(temp);
						open.add(grid[temp.getX() - 1][temp.getY()]);

					}
				} catch (IndexOutOfBoundsException e) {

				}
				// down node
				try {
					if (grid[temp.getX() + 1][temp.getY()].getH() != -1.0
							&& !open.contains(grid[temp.getX() + 1][temp.getY()])
							&& !closed.contains(grid[temp.getX() + 1][temp.getY()])) {
						double tempF = temp.getF() + G;
						double compareCost = grid[temp.getX()][temp.getY() + 1].getH() + tempF;
						grid[temp.getX() + 1][temp.getY()].setG(G); // sets G
						if (grid[temp.getX() + 1][temp.getY()].getF() > compareCost
								|| !open.contains(grid[temp.getX() + 1][temp.getY()])) {
							grid[temp.getX() + 1][temp.getY()].setF(compareCost);
						}
						grid[temp.getX() + 1][temp.getY()].setParent(temp);
						open.add(grid[temp.getX() + 1][temp.getY()]);

					}
				} catch (IndexOutOfBoundsException e) {

				}
				// up left
				try {
					if (grid[temp.getX() - 1][temp.getY() - 1].getH() != -1.0
							&& !open.contains(grid[temp.getX() - 1][temp.getY() - 1])
							&& !closed.contains(grid[temp.getX() - 1][temp.getY() - 1])) {
						double tempF = temp.getF() + G;
						double compareCost = grid[temp.getX() - 1][temp.getY() - 1].getH() + tempF;
						grid[temp.getX() - 1][temp.getY() - 1].setG(G); // sets G
						if (grid[temp.getX() - 1][temp.getY() - 1].getF() > compareCost
								|| !open.contains(grid[temp.getX() - 1][temp.getY() - 1])) {

							grid[temp.getX() - 1][temp.getY() - 1].setF(compareCost);
						}
						grid[temp.getX() - 1][temp.getY() - 1].setParent(temp);
						open.add(grid[temp.getX() - 1][temp.getY() - 1]);

					}
				} catch (IndexOutOfBoundsException e) {

				}
				// up right
				try {
					if (grid[temp.getX() - 1][temp.getY() + 1].getH() != -1.0
							&& !open.contains(grid[temp.getX() - 1][temp.getY() + 1])
							&& !closed.contains(grid[temp.getX() - 1][temp.getY() + 1])) {
						double tempF = temp.getF() + G;
						double compareCost = grid[temp.getX() - 1][temp.getY() + 1].getH() + tempF;
						grid[temp.getX() - 1][temp.getY() + 1].setG(G); // sets G
						if (grid[temp.getX() - 1][temp.getY() + 1].getF() > compareCost
								|| !open.contains(grid[temp.getX() - 1][temp.getY() + 1])) {

							grid[temp.getX() - 1][temp.getY() + 1].setF(compareCost);
						}
						grid[temp.getX() - 1][temp.getY() + 1].setParent(temp);
						open.add(grid[temp.getX() - 1][temp.getY() + 1]);

					}
				} catch (IndexOutOfBoundsException e) {

				}

				// down left
				try {
					if (grid[temp.getX() + 1][temp.getY() - 1].getH() != -1.0
							&& !open.contains(grid[temp.getX() + 1][temp.getY() - 1])
							&& !closed.contains(grid[temp.getX() + 1][temp.getY() - 1])) {
						double tempF = temp.getF() + G;
						double compareCost = grid[temp.getX()][temp.getY() - 1].getH() + tempF;
						grid[temp.getX() + 1][temp.getY() - 1].setG(G); // sets G
						if (grid[temp.getX() + 1][temp.getY() - 1].getF() > compareCost
								|| !open.contains(grid[temp.getX() + 1][temp.getY() - 1])) {
							grid[temp.getX() + 1][temp.getY() - 1].setF(compareCost);
						}
						grid[temp.getX() + 1][temp.getY() - 1].setParent(temp);
						open.add(grid[temp.getX() + 1][temp.getY() - 1]);

					}
				} catch (IndexOutOfBoundsException e) {

				}
				// down right
				try {
					if (grid[temp.getX() + 1][temp.getY() + 1].getH() != -1.0
							&& !open.contains(grid[temp.getX() + 1][temp.getY() + 1])
							&& !closed.contains(grid[temp.getX() + 1][temp.getY() + 1])) {
						double tempF = temp.getF() + G;
						double compareCost = grid[temp.getX()][temp.getY() + 1].getH() + tempF;
						grid[temp.getX() + 1][temp.getY() + 1].setG(G); // sets G
						if (grid[temp.getX() + 1][temp.getY() + 1].getF() > compareCost
								|| !open.contains(grid[temp.getX() + 1][temp.getY() + 1])) {
							grid[temp.getX() + 1][temp.getY() + 1].setF(compareCost);
						}
						grid[temp.getX() + 1][temp.getY() + 1].setParent(temp);
						open.add(grid[temp.getX() + 1][temp.getY() + 1]);

					}
				} catch (IndexOutOfBoundsException e) {

				}

			}
			Node targetNode = closed.get(closed.size() - 1);
			Node currentNode = targetNode;
			while (currentNode.getParent() != null) {
				int[] pathXY = { currentNode.getX(), currentNode.getY() };
				path.add(pathXY);
				currentNode = currentNode.getParent();
			}
			open.clear();
			// displayPath();
			return path;
		}
		return path;
	}

	/**
	 * checks to see if end target is a valid location
	 * 
	 * @return true if a valid location
	 */
	public boolean isVaildMove(char[][] board, int endX, int endY) {
		return board[endX][endY] == 'H';

	}

	/**
	 * calulates the H cost of array, Nodes in the grid get H set in this method
	 * when invalid it is H is set to -1 and it wont consider it a vaild index
	 * 
	 * @param board
	 *            dinosaur bubble
	 * @param endX
	 *            end X spot
	 * @param endY
	 *            end Y spot
	 */
	public void calcH(char[][] board, int endX, int endY) {
		Node human = new Node(endX, endY);

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				Node temp = new Node(i, j);

				if (board[i][j] != 0 && board[i][j] != 'H') {
					double hTemp = -1;
					temp.setH(hTemp);
				} else {
					double hTemp = Math.abs((endX - i)) + Math.abs(j - endY);
					temp.setH(hTemp);
				}

				grid[i][j] = temp;
			}
		}
		grid[endX][endY] = human;
	}

	// used for testing
	// displays F vaules
	public void display() {
		System.out.println("-------------------------");
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == null) {
					System.out.print("[ X ]");
				} else {
					System.out.print("[" + grid[i][j].getH() + "]");
				}
			}
			System.out.println();
		}
	}

	// track the movment per move in teh findPath method used for testing
	public void displayMovement(int x, int y) {
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");
		test[x][y] = 'O';
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				if (test[i][j] == 0) {
					System.out.print("[S]");
				} else {
					System.out.print("[" + test[i][j] + "]");
				}
			}
			System.out.println();
		}
	}

	// displays the X,Y of the path
	public void displayPath() {
		for (int i = 0; i < path.size(); i++) {
			System.out.println("[" + path.get(i)[0] + "]" + "[" + path.get(i)[1] + "]");
		}
		System.out.println("-------------------------");
	}

	/**
	 * looks in open for the Node with the smallest F value
	 * 
	 * @return Node With smallest F value
	 */
	public Node findSmallestF() {
		Node min = open.get(0);
		for (int i = 0; i < open.size(); i++) {
			if (min.getF() > open.get(i).getF()) {
				min = open.get(i);

			}
		}
		open.remove(min);
		return min;
	}

	/**
	 * @return the path
	 */
	public ArrayList<int[]> getPath() {
		return path;
	}

	/**
	 * @param path
	 *            the path to set
	 */
	public void setPath(ArrayList<int[]> path) {
		this.path = path;
	}
}
