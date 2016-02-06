package com.java.chain;

public class FileLogger extends AbstractLogger {
	
	FileLogger(int level){
		this.level=level;
	}
	@Override
	public void displayLog(String message) {
		System.out.println("File Logger: "+message);
	}
}