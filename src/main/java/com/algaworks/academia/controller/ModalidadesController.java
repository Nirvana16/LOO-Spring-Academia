package com.algaworks.academia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.academia.model.Modalidade;
import com.algaworks.academia.repository.Modalidades;


@Controller


public class ModalidadesController {
	
	@Autowired
	private Modalidades modalidades;
	

	@GetMapping("/modalidades")
	public ModelAndView listar() {		
//		
//		Modalidade m = new Modalidade();
//		m.setNomeModalidade("teste");
//		m.setPreco(15.12f);
//		modalidades.save(m);
		
		ModelAndView mv = new ModelAndView("ListaModalidades");
		mv.addObject("modalidades", modalidades.findAll());
		
		return mv;
		
	 }
	}