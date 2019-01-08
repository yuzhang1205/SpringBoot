package com.demo.until;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogCommon {
	
	private final static Logger logger=LoggerFactory.getLogger(LogCommon.class);
	
	public static Logger LogCommon() {
		return logger;
	}
}
