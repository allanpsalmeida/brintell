package com.brintell.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.brintell.model.Aluno;

@Repository
public class AlunoDAOImpl implements AlunoDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addAluno(Aluno aluno) {
		getCurrentSession().save(aluno);
	}


	public Aluno getAluno(int id) {
		Aluno uni = (Aluno) getCurrentSession().get(Aluno.class, id);
		return uni;
	}

	public void deleteAluno(int id) {
		Aluno uni = getAluno(id);
		if (uni != null)
			getCurrentSession().delete(uni);
	}

	@SuppressWarnings("unchecked")
	public List<Aluno> getAlunos() {
		return getCurrentSession().createQuery("from Aluno").list();
	}

}
