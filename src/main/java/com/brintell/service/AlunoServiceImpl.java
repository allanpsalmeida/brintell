package com.brintell.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brintell.dao.AlunoDAO;
import com.brintell.model.Aluno;

@Service
@Transactional
public class AlunoServiceImpl implements AlunoService {
	
	@Autowired
	private AlunoDAO alunoDAO;

	public void addAluno(Aluno aluno) {
		alunoDAO.addAluno(aluno);		
	}

	public Aluno getAluno(int cpf) {
		return alunoDAO.getAluno(cpf);
	}

	public void deleteAluno(int cpf) {
		alunoDAO.deleteAluno(cpf);
	}

	public List<Aluno> getAlunos() {
		return alunoDAO.getAlunos();
	}


}
