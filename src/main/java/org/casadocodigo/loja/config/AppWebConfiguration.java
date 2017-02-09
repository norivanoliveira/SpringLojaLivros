
/**
 * AppWebConfiguration.java
 * 
 * @date 7 de fev de 2017
 * @author <a href="mailto:norivan@gmail.com">Norivan Oliveira</a>
 *
 */

package org.casadocodigo.loja.config;

import org.casadocodigo.loja.controllers.HomeController;
import org.casadocodigo.loja.controllers.ProdutoController;
import org.casadocodigo.loja.daos.ProdutoDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author noriv
 *
 */
@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class,ProdutoController.class, ProdutoDAO.class})	
public class AppWebConfiguration {
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
	    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	    resolver.setPrefix("/WEB-INF/views/");
	    resolver.setSuffix(".jsp");
	    return resolver;
	}

}