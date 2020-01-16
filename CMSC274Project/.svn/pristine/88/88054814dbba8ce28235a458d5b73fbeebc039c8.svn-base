package edu.ben.model;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * A static class that any class can call which controls the audio heard in the
 * game
 * 
 * @author abdul
 *
 */
public enum Sounds {
	SPLASH(0), Level1(1), Level2(2), Level3(3), DIE_SOUND(4), ESCAPE(5);

	/**
	 * constructor for volume
	 * 
	 * @author abdul
	 *
	 */
	public static enum Volume {
		MUTE, ON;
	}

	/**
	 * constructor for sound state helper to sound class
	 * 
	 * @author abdul
	 *
	 */
	private static enum SoundState {
		MENU, LEVEL1, LEVEL2, LEVEL3, DIE_SOUND, ESCAPE;
	}

	/**
	 * used for volume control
	 */
	public static Volume volume = Volume.ON;
	/**
	 * enum for switching auido for level
	 */
	public static SoundState state = SoundState.MENU;
	/**
	 * used to hold audio
	 */
	private static Clip clip;
	/**
	 * level
	 */
	private int level;

	/**
	 * constructor for Sound class
	 * 
	 * @param level
	 *            game level
	 */
	Sounds(int level) {
		this.level = level;
	}

	/**
	 * method used to set the audio file to soundState and start play back
	 */
	public void play() {
		try {
			File sound = null;
			if (level == 0) {
				sound = new File("splashScreen.wav");
				state = SoundState.MENU;
			} else if (level == 1) {
				sound = new File("lvl1.wav");
				state = SoundState.LEVEL1;
			} else if (level == 2) {
				sound = new File("lvl2.wav");
				state = SoundState.LEVEL2;
			} else if (level == 3) {
				sound = new File("level3.wav");
				state = SoundState.LEVEL3;
			} else if (level == 4) {
				sound = new File("dieSound.wav");
				state = SoundState.DIE_SOUND;
			} else if (level == 5) {
				sound = new File("VictorySound.wav");
				state = SoundState.ESCAPE;
			}
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(sound);
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);

		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}

		volume = Volume.ON;
		if (volume != Volume.MUTE) {
			if (clip.isRunning())
				clip.stop();
			clip.setFramePosition(0);
			clip.start();
			if (level != 4) {
				clip.loop(Clip.LOOP_CONTINUOUSLY);
			}
		}

	}

	/**
	 * This method is used to kill audio
	 */
	public void mute() {
		volume = Volume.MUTE;
		if (volume == Volume.MUTE) {
			if (clip.isRunning())
				clip.stop();
			clip.setFramePosition(0); // to the beginning
		}
	}

	public static void init() {
		values();
	}

	/**
	 * start the method if muted
	 */
	public static void start() {
		clip.setFramePosition(0);
		clip.start(); // Start playing
		clip.loop(Clip.LOOP_CONTINUOUSLY);

	}

	/**
	 * shuts audio off when button press
	 */
	public static void off() {
		clip.stop();
	}

	/**
	 * @return the clip
	 */
	public Clip getClip() {
		return clip;
	}

	/**
	 * @param clip
	 *            the clip to set
	 */
	public void setClip(Clip clip) {
		this.clip = clip;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

}
