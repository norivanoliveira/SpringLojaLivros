
/**
 * ServerletSpring.java
 * 
 * @date 7 de fev de 2017
 * @author <a href="mailto:norivan@gmail.com">Norivan Oliveira</a>
 *
 */

package org.casadocodigo.loja.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author noriv
 *
 */
public class ServerletSpring extends AbstractAnnotationConfigDispatcherServletInitializer  {

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#getRootConfigClasses()
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	
	protected Class<?>[] getServletConfigClasses() {
	    return new Class[] {AppWebConfiguration.class, JPAConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
	    return new String[] {"/"};
	}
	
	 @Override
	    protected Filter[] getServletFilters() {
	        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
	        encodingFilter.setEncoding("UTF-8");
	        return new Filter[] {encodingFilter};
	    }

}
