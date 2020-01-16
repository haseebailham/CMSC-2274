package edu.ben.tests;

import org.junit.Test;

import edu.ben.human.HealthBar;
import student.TestCase;

/**
 * This is the HealthBar test class
 * 
 * @author haseebailham
 * @author mraheem
 * @version 1.0
 */
public class HealthBarTest extends TestCase {

	/**
	 * This tests that if a veloicraptor, then herbivore, then velociraptor did
	 * damage, then the health bar would be at 20
	 */
	@Test
	public void healthBarTestCarnHerb() {
		HealthBar hb = new HealthBar();
		hb.changeHealth("carnivore");
		hb.changeHealth("herbivore");
		hb.changeHealth("carnivore");
		int expected = 20;
		assertEquals(expected, hb.getHealthBar());

	}

	/**
	 * This tests that if a t-rex did damage, and then the player ate fruit, they
	 * would have 60 as health bar
	 */
	@Test
	public void healthBarTestTrexFruit() {
		HealthBar hb = new HealthBar();
		hb.changeHealth("trex");
		hb.changeHealth("fruit");
		hb.changeHealth("fruit");
		int expected = 70;
		assertEquals(expected, hb.getHealthBar());

	}

	/**
	 * This tests that if a human had total health, and ate fruit, they would have
	 * no effect on the health-it would stay at 100
	 */
	@Test
	public void healthBarTestTotalHealth() {
		HealthBar hb = new HealthBar();
		hb.changeHealth("fruit");
		int expected = 100;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if a human had 99 as health and ate fruit, it would only go
	 * to 100, not above
	 */
	@Test
	public void healthBarTestOneFromTotalHealth() {
		HealthBar hb = new HealthBar();
		hb.setHealthBar(99);
		hb.changeHealth("fruit");
		int expected = 100;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if a human had nearly total health after eating fruit, they
	 * would have the right amount of health and that it would not go to 100
	 */
	@Test
	public void healthBarTestAlmostTotalHealth() {
		HealthBar hb = new HealthBar();
		hb.setHealthBar(89);
		hb.changeHealth("fruit");
		int expected = 99;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if a t-rex did damage, and then the player ate fruit, they
	 * have the correct amount of health (70)
	 */
	@Test
	public void healthBarTestTrexDmgAndFruit() {
		HealthBar hb = new HealthBar();
		hb.changeHealth("trex");
		hb.changeHealth("fruit");
		int expected = 60;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * Tests if health is updated correctly when there has been previous damage to
	 * the human's health. Sets current health status to 40, so after damage is
	 * inflicted on human, assuming riddle is answered correctly, player will attain
	 * 20 points for health.
	 */
	@Test
	public void testPreviousDamageForHuman() {
		HealthBar hb = new HealthBar();
		hb.setHealthBar(40);
		hb.changeHealth("fruit");
		int expected = 50;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * Tests if health is updated correctly when there is carnivore (level 2
	 * dinosaurs) near human. Player will lose 30 points for health.
	 */
	@Test
	public void testCarnivoreDamageForHuman() {
		HealthBar hb = new HealthBar();
		hb.changeHealth("carnivore");
		int expected = 70;
		assertEquals(expected, hb.getHealthBar());
	}

	/**
	 * Tests if health is empty, if empty, then player is dead.
	 */
	@Test
	public void testHealthBelow10InflictedHerbivoreDamage() {
		HealthBar hb = new HealthBar();
		hb.setHealthBar(10);
		hb.changeHealth("herbivore");
		int expected = 0;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);

	}

	/**
	 * This tests that the pterodactyl effect works properly
	 */
	@Test
	public void testHealthPterodactyl() {
		HealthBar hb = new HealthBar();
		hb.changeHealth("pterodactyl");
		int expected = 90;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests that the pterodactyl effect works properly
	 */
	@Test
	public void testHealthPterodactylPreset() {
		HealthBar hb = new HealthBar();
		hb.setHealthBar(40);
		hb.changeHealth("pterodactyl");
		int expected = 30;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests that after being attacked by a trex, velociraptor, and herbivore,
	 * the human would have the right amount of health (0)
	 */
	@Test
	public void testHealthTrexCarnHerb() {
		HealthBar hb = new HealthBar();
		hb.changeHealth("trex");
		hb.changeHealth("carnivore");
		hb.changeHealth("herbivore");
		int expected = 0;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests that after being attacked by a trex, velociraptor, pterodactyl,
	 * herbivore, and eating fruit, the human would have the right amount of health
	 * (10)
	 */
	@Test
	public void testHealthAllEffects() {
		HealthBar hb = new HealthBar();
		hb.changeHealth("trex");
		hb.changeHealth("carnivore");
		hb.changeHealth("pterodactyl");
		hb.changeHealth("herbivore");
		hb.changeHealth("fruit");
		int expected = 10;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests for an outcome in level one by putting in a preset value for
	 * health, and making sure that the health is the correct number afterwards (50)
	 */
	@Test
	public void testPresetLevel1() {
		HealthBar hb = new HealthBar();
		hb.setHealthBar(60);
		hb.changeHealth("herbivore");
		hb.changeHealth("fruit");
		int expected = 50;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests for a possible outcome in level 1, and makes sure that the health
	 * is 40 afterwards
	 */
	@Test
	public void testPossibleLevel1() {
		HealthBar hb = new HealthBar();
		hb.changeHealth("fruit");
		for (int i = 0; i < 4; i++) {
			hb.changeHealth("herbivore");
		}
		hb.changeHealth("fruit");
		hb.changeHealth("fruit");
		int expected = 40;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests for a possible outcome in level 1, and makes sure that the health
	 * is 50 afterwards
	 */
	@Test
	public void test2PossibleLevel1() {
		HealthBar hb = new HealthBar();
		for (int i = 0; i < 3; i++) {
			hb.changeHealth("herbivore");
		}
		hb.changeHealth("fruit");
		int expected = 50;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests for a possible outcome in level 1, and makes sure that the health
	 * is 70 afterwards
	 */
	@Test
	public void test3PossibleLevel1() {
		HealthBar hb = new HealthBar();
		hb.changeHealth("herbivore");
		for (int i = 0; i < 2; i++) {
			hb.changeHealth("herbivore");
			hb.changeHealth("fruit");
		}
		hb.changeHealth("fruit");
		int expected = 70;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests for an outcome in level two by putting in a preset value for
	 * health, and making sure that the health is the correct number afterward (70)
	 */
	@Test
	public void testPresetLevel2() {
		HealthBar hb = new HealthBar();
		hb.setHealthBar(40);
		hb.changeHealth("carnivore");
		hb.changeHealth("pterodactyl");
		hb.changeHealth("fruit");
		int expected = 10;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests for a possible outcome in level 2, and makes sure that the health
	 * is 10 afterwards
	 */
	@Test
	public void testPossibleLevel2() {
		HealthBar hb = new HealthBar();
		hb.changeHealth("pterodactyl");
		for (int i = 0; i < 3; i++) {
			hb.changeHealth("carnivore");
		}
		hb.changeHealth("fruit");
		int expected = 10;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests for a possible outcome in level 2, and makes sure that the health
	 * is 30 afterwards
	 */
	@Test
	public void test2PossibleLevel2() {
		HealthBar hb = new HealthBar();
		for (int i = 0; i < 2; i++) {
			hb.changeHealth("pterodactyl");
			hb.changeHealth("carnivore");
		}
		hb.changeHealth("fruit");
		int expected = 30;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests for a possible outcome in level 2, and makes sure that the health
	 * is 50 afterwards
	 */
	@Test
	public void test3PossibleLevel2() {
		HealthBar hb = new HealthBar();
		hb.changeHealth("pterodactyl");
		for (int i = 0; i < 2; i++) {
			hb.changeHealth("carnivore");
			hb.changeHealth("fruit");
		}
		int expected = 50;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests for an outcome in level three by putting in a preset value for
	 * health, and making sure that the health is the correct number afterward (10)
	 */
	@Test
	public void testPresetLevel3() {
		HealthBar hb = new HealthBar();
		hb.setHealthBar(60);
		hb.changeHealth("trex");
		int expected = 10;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests for a possible outcome in level 3, and makes sure that the health
	 * is 10 afterwards
	 */
	@Test
	public void testPossibleLevel3() {
		HealthBar hb = new HealthBar();
		for (int i = 0; i < 2; i++) {
			hb.changeHealth("trex");
		}
		hb.changeHealth("fruit");
		int expected = 10;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests for a possible outcome in level 3, and makes sure that the health
	 * is 0 afterwards
	 */
	@Test
	public void test2PossibleLevel3() {
		HealthBar hb = new HealthBar();
		hb.changeHealth("fruit");
		for (int i = 0; i < 3; i++) {
			hb.changeHealth("trex");
		}
		int expected = 0;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests for a possible outcome in level 3, and makes sure that the health
	 * is 10 afterwards
	 */
	@Test
	public void test3PossibleLevel3() {
		HealthBar hb = new HealthBar();
		hb.changeHealth("trex");
		hb.changeHealth("fruit");
		hb.changeHealth("trex");
		int expected = 10;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if the health dips below zero, the health bar just shows zero
	 */
	@Test
	public void testBelowZero() {
		HealthBar hb = new HealthBar();
		hb.changeHealth("carnivore");
		hb.changeHealth("trex");
		hb.changeHealth("carnivore");
		hb.changeHealth("herbivore");
		int expected = 0;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if the health is set below zero, even with eating fruit, the
	 * health bar just shows zero
	 * 
	 */
	@Test
	public void testBelowZeroFruitPreset() {
		HealthBar hb = new HealthBar();
		hb.setHealthBar(-15);
		hb.changeHealth("fruit");
		hb.changeHealth("herbivore");
		int expected = 0;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests that if the health is preset to below zero and dinosaurs attack,
	 * the health bar just shows zero
	 *
	 */
	@Test
	public void testBelowZeroPreset() {
		HealthBar hb = new HealthBar();
		hb.setHealthBar(-100);
		hb.changeHealth("herbivore");
		hb.changeHealth("carnivore");
		hb.changeHealth("pterodactyl");
		hb.changeHealth("trex");
		int expected = 0;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests that the only thing that affects the health are Strings that are
	 * checked for, so a ranodm String will not affect the health in any way
	 */
	@Test
	public void testStringEffect() {
		HealthBar hb = new HealthBar();
		hb.changeHealth("fake");
		int expected = 100;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}

	/**
	 * This tests that the only thing that affects the health originally starts with
	 * 100
	 */
	@Test
	public void testOriginalHealth() {
		HealthBar hb = new HealthBar();
		int expected = 100;
		int actual = hb.getHealthBar();
		assertEquals(expected, actual);
	}
}
