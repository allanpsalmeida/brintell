package com.brintell.dao;

import java.util.List;

import com.brintell.model.Aluno;

public interface AlunoDAO {
	
	public void addAluno(Aluno Aluno);
	public void deleteAluno(int id);
	public Aluno getAluno(int id);
	public List<Aluno> getAlunos();

}
