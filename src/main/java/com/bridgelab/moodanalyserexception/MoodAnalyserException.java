package com.bridgelab.moodanalyserexception;



public class MoodAnalyserException extends Throwable{
	
	public ExceptionType exceptionType;
	public String message;

	public enum ExceptionType {
		EMPTY, NULL;
	}

	public MoodAnalyserException(ExceptionType exceptionType, String message) {
		this.exceptionType = exceptionType;
		this.message = message;
	}

	@Override
	public String toString() {
		return "MoodAnalyzerException [exceptionType=" + exceptionType + ", message=" + message + "]";
	}

}
