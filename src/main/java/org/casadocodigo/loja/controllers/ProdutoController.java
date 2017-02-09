
/**
 * ProdutoController.java
 * 
 * @date 7 de fev de 2017
 * @author <a href="mailto:norivan@gmail.com">Norivan Oliveira</a>
 *
 */

package org.casadocodigo.loja.controllers;

import java.util.List;

import javax.validation.Valid;

import org.casadocodigo.loja.daos.ProdutoDAO;
import org.casadocodigo.loja.models.Produto;
import org.casadocodigo.loja.models.TipoPreco;
import org.casadocodigo.loja.validation.ProdutoValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


/**
 * @author noriv
 *
 */
@Controller
@RequestMapping("produtos")
public class ProdutoController {

	@Autowired
    private ProdutoDAO produtoDao;

	@RequestMapping("/form")
    public ModelAndView form(){

        ModelAndView modelAndView = new ModelAndView("produtos/form");
        modelAndView.addObject("tipos", TipoPreco.values());

        return modelAndView;
    }
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listar(){
	    List<Produto> produtos = produtoDao.listar();
	    ModelAndView modelAndView = new ModelAndView("/produtos/lista");
	    modelAndView.addObject("produtos", produtos);
	    return modelAndView;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView gravar(@Valid Produto produto, BindingResult result,  RedirectAttributes redirectAttributes){
	    if(result.hasErrors()){
	        return form();
	    }
		produtoDao.gravar(produto);
		redirectAttributes.addFlashAttribute("sucesso","Produto cadastrado com sucesso!");
	    return new ModelAndView("redirect:produtos");
	}
	
	@InitBinder
	public void InitBinder(WebDataBinder binder){
	    binder.addValidators(new ProdutoValidation());
	}
}
