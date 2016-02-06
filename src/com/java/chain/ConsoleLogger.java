package com.java.chain;

public class ConsoleLogger extends AbstractLogger {
	
	ConsoleLogger(int level){
		this.level=level;
	}
	
	@Override
	public void displayLog(String message) {
		System.out.println("Console Logger: "+message);
	}
}