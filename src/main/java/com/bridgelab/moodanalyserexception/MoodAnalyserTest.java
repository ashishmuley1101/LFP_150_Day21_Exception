package com.bridgelab.moodanalyserexception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void analyzeSadMood() throws MoodAnalyserException {
		MoodAnalyser analyser = new MoodAnalyser();
		String actualResult = analyser.analyseMood("I am in sad mood");
		assertEquals("SAD", actualResult);
	}

	@Test
	public void analyseHappyMood() throws MoodAnalyserException {
		MoodAnalyser analyser = new MoodAnalyser();
		String actualResult = analyser.analyseMood("I am in happy mood");
		assertEquals("HAPPY", actualResult);
	}

	@Test
	public void analyzeEmptyMood() throws MoodAnalyserException {
		// String actualResult;
		try {
			MoodAnalyser analyser = new MoodAnalyser();
			analyser.analyseMood("");
		} catch (MoodAnalyserException mod) {
			System.out.println("Empty Mood..!!");
			assertEquals("EMPTY MOOD", mod.message);
		}
	}

	@Test
	public void analyseNullMood() throws MoodAnalyserException {
		try {
			MoodAnalyser analyser = new MoodAnalyser();
			analyser.analyseMood(null);
		} catch (NullPointerException mod) {
		System.out.println("NULL Mood..!!");
			assertNotEquals("NULL MOOD", mod.getMessage());
		}
	}
}
