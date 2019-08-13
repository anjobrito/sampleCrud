package com.sample.org.app.model;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sample.org.app.setting.RegState;

@Entity
@Table(name="people", schema = "PUBLIC")
public class People {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idpeople",unique=true,nullable=false)
	private int idpeople;	
	private String nome;	
	private String cpf;	
	private Date nascimento;	
	private String endereco;
	private RegState status;
	
	public People() {
		
	}
	
	
	private People(int idpeople, String nome,String cpf,Date nascimento,String endereco, RegState status) {
		super();
		isNotSetted(nome);
		isNotSetted(cpf);
		isNotSetted(nascimento);
		isNotSetted(endereco);
		isNotSetted(status);		
		this.idpeople = idpeople;
		this.nome=nome;
		this.cpf=cpf;
		this.nascimento=nascimento;
		this.endereco=endereco;		
	}

	
	public static class PeopleBuilder{
		private int idpeople;
		private String nome;
		private String cpf;
		private java.sql.Date nascimento;
		private String endereco;
		private RegState status;
		
		
		public PeopleBuilder idPeople(int idpeople) {
			this.idpeople = idpeople;
			return this;
		}
		
		
		public PeopleBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public PeopleBuilder cpf(String cpf) {
			this.cpf = cpf;
			return this;
		}
		
		public PeopleBuilder nascimento(Date nascimento) {
			this.nascimento = nascimento;
			return this;
		}
		
		public PeopleBuilder endereco(String endereco) {
			this.endereco = endereco;
			return this;
		}
		
		public PeopleBuilder status(RegState status) {
			this.status = status;
			return this;
		}
		
		
		
		public People builder() {
			return new People(this.idpeople,this.nome,this.cpf,this.nascimento,this.endereco,this.status);			
		}	
		
		
	}
	
	


	public int getIdpeople() {
		return idpeople;
	}


	public void setIdpeople(int idpeople) {
		this.idpeople = idpeople;
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


	private static void isNotSetted(Object obj) {	  	
		boolean isValid=false;
		if(obj instanceof Integer) {
			isValid=true;			
		}else
			if(obj instanceof String) {
				isValid=true;	
			}else
				if(obj instanceof java.sql.Date) {
				isValid=true;
			}	
				else
					if(obj instanceof RegState) {
					isValid=true;
				}
		if(!isValid) {
			throw new IllegalArgumentException("Exists one or more fields was empty");			
		}
			
	}
	

	
	
}
