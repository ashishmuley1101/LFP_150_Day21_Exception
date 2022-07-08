package com.bridgelab.moodanalyserexception;

public class MoodAnalyser {

	public String analyseMood(String msg) throws MoodAnalyserException {
		try {
			if (msg.length() == 0) {
				throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.EMPTY, "EMPTY MOOD");

			}
			if (msg == null) {
				throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NULL, "NULL MOOD");
			}
			if (msg.toLowerCase().contains("sad") || msg.toLowerCase().contains("exhausted")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException exception) {
			throw new NullPointerException(exception.getMessage());
		}
	}
}
