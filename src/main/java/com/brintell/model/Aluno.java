package com.brintell.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="aluno")
public class Aluno {
		
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aluno_id_seq")
	@SequenceGenerator(name = "aluno_id_seq", sequenceName = "aluno_id_seq",allocationSize=1)
	private Integer id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String cpf;
	
	private String sexo;
	
	@NotNull
	private String email;
	
	private Integer telefone;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	
	
}
