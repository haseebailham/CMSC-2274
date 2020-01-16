package edu.ben.tests;

import org.junit.Test;

import edu.ben.human.Points;
import student.TestCase;

/**
 * Points Test Class
 * 
 * @author mraheem
 * @version 1.0
 */
public class PointsTest extends TestCase {

	/**
	 * This tests that the formula for the points works properly when no dinosaur
	 * egg was picked up (points are Double)
	 */
	@Test
	public void testNormalPoints() {
		Points p = new Points();
		int expected = 278;
		int actual = p.calculatePoints(59.64, false);
		assertEquals(expected, actual);
	}

	/**
	 * This tests that the formula for the points works properly if a dinosaur egg
	 * was picked up (points are Double)
	 */
	@Test
	public void testNormalPointsEgg() {
		Points p = new Points();
		int expected = 3586;
		int actual = p.calculatePoints(767.3, true);
		assertEquals(expected, actual);
	}

	/**
	 * This tests that the formula for the points works if you have a preset value
	 * for points and no dinosaur egg (points are Double)
	 */
	@Test
	public void testPresetPoints() {
		Points p = new Points();
		p.setPoints(62.1);
		int expected = 290;
		int actual = p.calculatePoints(p.getPoints(), false);
		assertEquals(expected, actual);
	}

	/**
	 * This tests that the formula for the points works if you have a preset value
	 * for points and a dinosaur egg (points are Double)
	 */
	@Test
	public void testPresetPointsEgg() {
		Points p = new Points();
		p.setPoints(295.4);
		int expected = 1384;
		int actual = p.calculatePoints(p.getPoints(), true);
		assertEquals(expected, actual);
	}

	/**
	 * This tests that the formula for the points works properly when no dinosaur
	 * egg was picked up (points are Integer)
	 */
	@Test
	public void testNormalPointsInt() {
		Points p = new Points();
		int expected = 341;
		int actual = p.calculatePoints(73, false);
		assertEquals(expected, actual);
	}

	/**
	 * This tests that the formula for the points works properly if a dinosaur egg
	 * was picked up (points are Integer)
	 */
	@Test
	public void testNormalPointsEggInt() {
		Points p = new Points();
		int expected = 476;
		int actual = p.calculatePoints(101, true);
		assertEquals(expected, actual);
	}

	/**
	 * This tests that the formula for the points works if you have a preset value
	 * for points and no dinosaur egg (points are Integer)
	 */
	@Test
	public void testPresetPointsInt() {
		Points p = new Points();
		p.setPoints(87);
		int expected = 406;
		int actual = p.calculatePoints(p.getPoints(), false);
		assertEquals(expected, actual);
	}

	/**
	 * This tests that the formula for the points works if you have a preset value
	 * for points and a dinosaur egg (points are Integer)
	 */
	@Test
	public void testPresetPointsEggInt() {
		Points p = new Points();
		p.setPoints(15);
		int expected = 75;
		int actual = p.calculatePoints(p.getPoints(), true);
		assertEquals(expected, actual);
	}

	/**
	 * This tests that the formula for the points works properly when no dinosaur
	 * egg was picked up (points are Integer value of a String)
	 */
	@Test
	public void testNormalPointsString() {
		Points p = new Points();
		int expected = 429;
		int actual = p.calculatePoints(Integer.valueOf("92"), false);
		assertEquals(expected, actual);
	}

	/**
	 * This tests that the formula for the points works properly if a dinosaur egg
	 * was picked up (points are Integer value of a String)
	 */
	@Test
	public void testNormalPointsEggString() {
		Points p = new Points();
		int expected = 182;
		int actual = p.calculatePoints(Integer.valueOf("38"), true);
		assertEquals(expected, actual);
	}

	/**
	 * This tests that the formula for the points works if you have a preset value
	 * for points and no dinosaur egg (points are Integer value of a String)
	 */
	@Test
	public void testPresetPointsString() {
		Points p = new Points();
		p.setPoints(Integer.valueOf("56"));
		int expected = 261;
		int actual = p.calculatePoints(p.getPoints(), false);
		assertEquals(expected, actual);
	}

	/**
	 * This tests that the formula for the points works if you have a preset value
	 * for points and a dinosaur egg (points are Integer value of a String)
	 */
	@Test
	public void testPresetPointsEggString() {
		Points p = new Points();
		p.setPoints(Integer.valueOf("24"));
		int expected = 117;
		int actual = p.calculatePoints(p.getPoints(), true);
		assertEquals(expected, actual);
	}

	/**
	 * This tests that the formula for the points works properly when no dinosaur
	 * egg was picked up (points are Double value of a String)
	 */
	@Test
	public void testNormalPointsStringDouble() {
		Points p = new Points();
		int expected = 267;
		int actual = p.calculatePoints(Double.valueOf("57.3"), false);
		assertEquals(expected, actual);
	}

	/**
	 * This tests that the formula for the points works properly if a dinosaur egg
	 * was picked up (points are Double value of a String)
	 */
	@Test
	public void testNormalPointsEggStringDouble() {
		Points p = new Points();
		int expected = 52;
		int actual = p.calculatePoints(Double.valueOf("10.10"), true);
		assertEquals(expected, actual);
	}

	/**
	 * This tests that the formula for the points works if you have a preset value
	 * for points and no dinosaur egg (points are Double value of a String)
	 */
	@Test
	public void testPresetPointsStringDouble() {
		Points p = new Points();
		p.setPoints(Double.valueOf("74.82"));
		int expected = 349;
		int actual = p.calculatePoints(p.getPoints(), false);
		assertEquals(expected, actual);
	}

	/**
	 * This tests that the formula for the points works if you have a preset value
	 * for points and a dinosaur egg (points are Double value of a String)
	 */
	@Test
	public void testPresetPointsEggStringDouble() {
		Points p = new Points();
		p.setPoints(Double.valueOf("31.96"));
		int expected = 154;
		int actual = p.calculatePoints(p.getPoints(), true);
		assertEquals(expected, actual);
	}
}
