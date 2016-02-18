package com.cgtech.societyapp.container.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.cgtech.societyapp.spring.config.SpringRootConfiguration;
import com.cgtech.societyapp.spring.config.SpringWebConfiguration;

public class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// This regsiters spring Context configuration 
		return new Class[]{SpringRootConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO This registers Spring MVC configuration
		return new Class[]{SpringWebConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO This registers following URL pattern for DispatcherServlet
		return new String[]{"/"};
	}

}
