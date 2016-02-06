package com.java.chain;

public class ErrorLogger extends AbstractLogger {
	
	ErrorLogger(int level){
		this.level=level;
	}
	@Override
	public void displayLog(String message) {
		System.out.println("Error Logger: "+message);
	}
}