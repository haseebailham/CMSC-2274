package edu.ben.human;

/**
 * Points class
 * 
 * @author mraheem
 * @version 1.0
 */
public class Points {
	/**
	 * The current points that will be used in the formula
	 */
	private double points;

	public Points() {
		// empty
	}

	/**
	 * This method calculates the points of the player, which should be constantly
	 * displayed
	 * 
	 * @param currentPoints
	 *            the amount of points the player currently has
	 * @return the points the player has after calculations
	 */
	public int calculatePoints(double currentPoints, boolean egg) {
		points = (currentPoints * 14) / 3;
		if (egg) {
			points += 5;
		}
		return (int) Math.round(points);
	}

	/**
	 * @return the points the player has at the moment
	 */
	public double getPoints() {
		return points;
	}

	/**
	 * @param points
	 *            the points the of player has to set
	 */
	public void setPoints(double points) {
		this.points = points;
	}
}
