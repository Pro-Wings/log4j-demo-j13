package com.prowings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MyLog4j2Example {
	
//	private static final Logger log = LogManager.getLogger(MyLog4j2Example.class);
	
	
	public static void main(String[] args) {
		
		Integer x = 5;
		Integer y = 10;
		String message = "Hello, World!";
		Student student = new Student("John", 25, "New York");
		
		
		log.info("Received Student : {} is like this.", student);
        log.info("This is an INFO message: {}, number1:{} and number2:{}", message, x, y);
        log.warn("This is a WARN message");
        log.error("This is an ERROR message");
        
        log.fatal("This is a FATAL message");
        log.debug("This is a DEBUG message");
        log.trace("This is a TRACE message");		

        while (true) {
            log.info("This is a test log message at: " + System.currentTimeMillis());
            try {
                Thread.sleep(1000);  // Log every 1 second
            } catch (InterruptedException e) {
                log.error("Thread interrupted", e);
            }
        }
        
	}
	
}
