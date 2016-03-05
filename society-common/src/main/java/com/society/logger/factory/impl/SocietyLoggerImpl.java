package com.society.logger.factory.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

import com.society.logger.factory.SocietyLogger;

public class SocietyLoggerImpl implements SocietyLogger {

	Logger LOGGER;
	
	public SocietyLoggerImpl(Class<?> clazz) {
		this.LOGGER = LoggerFactory.getLogger(clazz);
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return LOGGER.getName();
	}

	@Override
	public void error(Marker marker, String format, Object... arguments) {
		LOGGER.error(marker,format,arguments);
	}

	@Override
	public void error(Marker marker, String msg, Throwable t) {
		LOGGER.error(marker,msg,t);
	}

	@Override
	public void info(String message) {
		LOGGER.info(message);
		
	}

	@Override
	public void error(Marker marker, String format, boolean isPersist, Object... arguments) {
		
		LOGGER.error(marker,format,arguments);
		
	}
	
	public int persistException(Throwable t){
		return 0;
	}


}
