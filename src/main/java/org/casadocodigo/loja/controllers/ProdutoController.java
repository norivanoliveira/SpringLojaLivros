
/**
 * ProdutoController.java
 * 
 * @date 7 de fev de 2017
 * @author <a href="mailto:norivan@gmail.com">Norivan Oliveira</a>
 *
 */

package org.casadocodigo.loja.controllers;

import org.casadocodigo.loja.daos.ProdutoDAO;
import org.casadocodigo.loja.models.Produto;
import org.casadocodigo.loja.models.TipoPreco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author noriv
 *
 */
@Controller
public class ProdutoController {

	@Autowired
    private ProdutoDAO produtoDao;

	@RequestMapping("/produtos/form")
    public ModelAndView form(){

        ModelAndView modelAndView = new ModelAndView("produtos/form");
        modelAndView.addObject("tipos", TipoPreco.values());

        return modelAndView;
    }
	

	@RequestMapping("/produtos")
	public String gravar(Produto produto){
		produtoDao.gravar(produto);
	    System.out.println(produto);
	    return "/produtos/ok";
	}
}
