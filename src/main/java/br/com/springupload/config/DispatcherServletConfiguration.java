package br.com.springupload.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {WebSpringConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
	
	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement("");
		registration.setMultipartConfig(multipartConfigElement);
	}
	
	//private static final String LOCATION = "/arquivos/livros"; // Temporary location where files will be stored
	//private static final long MAX_FILE_SIZE = 5242880; // 5MB : Max file size.
	//private static final long MAX_REQUEST_SIZE = 20971520; // 20MB : Total request size containing Multi part.
	//private static final int FILE_SIZE_THRESHOLD = 0; // Size threshold after which files will be written to disk
	
}
 