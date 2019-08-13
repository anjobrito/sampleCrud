package com.sample.org.app.setting;

import java.sql.Date;

public class PeopleDto {

	private String nome;	
	private String cpf;	
	private Date nascimento;	
	private String endereco;	
	private RegState status;
	
	public PeopleDto() {
				
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

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public RegState getStatus() {
		return status;
	}

	public void setStatus(RegState status) {
		this.status = status;
	}
	
	

	
	

}
