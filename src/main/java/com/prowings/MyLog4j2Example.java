package com.prowings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLog4j2Example {
	
	private static final Logger logger = LogManager.getLogger(MyLog4j2Example.class);
	
	
	public static void main(String[] args) {
		
        logger.info("This is an INFO message");
        logger.warn("This is a WARN message");
        logger.error("This is an ERROR message");
        logger.fatal("This is a FATAL message");
        logger.debug("This is a DEBUG message");
        logger.trace("This is a TRACE message");
		
	}
	
}
