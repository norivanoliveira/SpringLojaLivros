
/**
 * HomeController.java
 * 
 * @date 7 de fev de 2017
 * @author <a href="mailto:norivan@gmail.com">Norivan Oliveira</a>
 *
 */

package org.casadocodigo.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author noriv
 *
 */
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(){
	    System.out.println("Entrando na home da CDC");
	    return "home";
	}
	


}
