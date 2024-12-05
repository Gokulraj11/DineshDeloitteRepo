package com.deloitte.dev;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hello {

	public static void main(String[] args) {
	
		Logger logger = LogManager.getLogger(Hello.class);

		logger.fatal("FATAL message");
		logger.warn("WARN message");
		logger.error("ERROR message");
		logger.info("INFO message");
		logger.debug("DEBUG message");
		logger.trace("TRACE message");
	}

}
