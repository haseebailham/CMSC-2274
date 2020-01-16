package edu.ben.tests;

import org.junit.Test;

import edu.ben.model.RandomGen;
import student.TestCase;

/**
 * RandomGenTest for RandomGen class
 * 
 * @author mraheem
 * @version 1.0
 */
public class RandomGenTest extends TestCase {

	/**
	 * This test makes sure that the number produced is not outside of the range
	 */
	@Test
	public void testAvailableWrongRange() {
		RandomGen r = new RandomGen();
		int actual = r.randomNum(4);
		assertNotSame(actual, 7);
	}

	/**
	 * This test makes sure that the number produced is not outside of the range
	 */
	@Test
	public void testAvailableWrongRange2P1() {
		RandomGen r = new RandomGen();
		int notPossible = 82;
		int actual = r.randomNum(5);
		assertTrue(notPossible > actual);
	}

	/**
	 * This test makes sure that the number produced is not outside of the range
	 */
	@Test
	public void testAvailableWrongRange2P2() {
		RandomGen r = new RandomGen();
		int notPossible = 82;
		int actual = r.randomNum(5);
		assertTrue(actual < notPossible);
	}

	/**
	 * This test makes sure that the number produced is not outside of the range
	 */
	@Test
	public void testAvailableWrongRange3P1() {
		RandomGen r = new RandomGen();
		int notPossible = 101;
		int actual = r.randomNum(100);
		assertTrue(notPossible > actual);
	}

	/**
	 * This test makes sure that the number produced is not outside of the range
	 */
	@Test
	public void testAvailableWrongRange3P2() {
		RandomGen r = new RandomGen();
		int notPossible = 101;
		int actual = r.randomNum(100);
		assertTrue(actual < notPossible);
	}

	/**
	 * This test makes sure that the number produced is not outside of the range
	 */
	@Test
	public void testAvailableWrongRange4P1() {
		RandomGen r = new RandomGen();
		int notPossible = 71;
		int actual = r.randomNum(20);
		assertTrue(notPossible > actual);
	}

	/**
	 * This test makes sure that the number produced is not outside of the range
	 */
	@Test
	public void testAvailableWrongRange4P2() {
		RandomGen r = new RandomGen();
		int notPossible = 71;
		int actual = r.randomNum(20);
		assertTrue(actual < notPossible);
	}

	/**
	 * This test makes sure that zero is not generated from random generator,
	 * because it is not used
	 */
	@Test
	public void testNotZero() {
		RandomGen r = new RandomGen();
		int notPossible = 0;
		int actual = r.randomNum(20);
		assertNotSame(notPossible, actual);
	}

	/**
	 * This test makes sure that zero is not generated from random generator,
	 * because it is not used
	 */
	@Test
	public void testNotZeroDiff() {
		RandomGen r = new RandomGen();
		int notPossible = 0;
		int actual = r.randomNum(20);
		assertTrue(notPossible < actual);
	}

	/**
	 * This test makes sure that the number produced is in the given range
	 */
	@Test
	public void testAvailableInRange() {
		RandomGen r = new RandomGen();
		int actual = r.randomNum(4);
		assertTrue(actual == 1 || actual == 2 || actual == 3 || actual == 4);
	}

}
