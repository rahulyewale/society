package com.society.logger.factory;

import com.society.logger.factory.impl.SocietyLoggerImpl;

public class SocietyLoggerFactory {

	public static SocietyLogger getLogger(Class<?> clazz) {
		// TODO Auto-generated method stub
		return new SocietyLoggerImpl(clazz);
	}

}
