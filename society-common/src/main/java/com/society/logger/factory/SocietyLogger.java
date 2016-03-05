package com.society.logger.factory;

import org.slf4j.Marker;

public interface SocietyLogger {
	
	
	public String getName();
	
	public void info(String message);
	
	public void error(Marker marker, String format, Object... arguments);
	
	public void error(Marker marker, String format,boolean isPersist,Object... arguments);
	
	public void error(Marker marker, String msg, Throwable t);

}
