package com.java.chain;

public class ChainPatternApp {

	public static AbstractLogger getLogger(){
		AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger=new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger=new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}
	public static void main(String[] args) {
		AbstractLogger logger=getLogger();
		logger.logMessage(AbstractLogger.INFO,new String("This is an info message"));
		logger.logMessage(AbstractLogger.DEBUG,new String("This is a debug message"));
		logger.logMessage(AbstractLogger.ERROR,new String("This is an error message"));
	}
}