package com.brintell.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.brintell.model.Aluno;
import com.brintell.service.AlunoService;

@Controller
@RequestMapping(value="/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	
	@RequestMapping(value="/listar")
	public ModelAndView listOfAlunos() {
		ModelAndView modelAndView = new ModelAndView("list-of-alunos");
		
		List<Aluno> alunos = alunoService.getAlunos();
		modelAndView.addObject("alunos", alunos);
		
		return modelAndView;
	}
	
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deleteAluno(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("home");
		alunoService.deleteAluno(id);
		String message = "O aluno foi excluído";
		modelAndView.addObject("message", message);
		return modelAndView;
	}

}
