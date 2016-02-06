package com.java.chain;

public abstract class AbstractLogger {
	public static int ERROR=3;
	public static int DEBUG=2;
	public static int INFO=1;
	
	int level;
	AbstractLogger nextLogger;
	
	public void setNextLogger(AbstractLogger nextLogger){
		this.nextLogger=nextLogger;
	}
	
	public abstract void displayLog(String message);
	
	public void logMessage(int level,String message){
		if(this.level<=level)
			displayLog(message);
		else{
			if(nextLogger!=null)
				nextLogger.logMessage(level,message);
		}
	}
}