package com.brintell.service;

import java.util.List;

import com.brintell.model.Aluno;

public interface AlunoService {
	
	public void addAluno(Aluno aluno);
	public void deleteAluno(int id);
	public Aluno getAluno(int cpf);
	public List<Aluno> getAlunos();
	
}
