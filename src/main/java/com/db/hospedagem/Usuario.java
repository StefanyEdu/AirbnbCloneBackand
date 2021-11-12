package com.db.hospedagem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	private String email;
	private String cpf;
	private String telefone;
	
	public Usuario() {
		
	}
	
	
	
	
	
	



	public Usuario(String nome, String email, String cpf, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
	}









	public Long getId() {
		return id;
	}







	public void setId(Long id) {
		this.id = id;
	}







	public String getNome() {
		return nome;
	}







	public void setNome(String nome) {
		this.nome = nome;
	}







	public String getEmail() {
		return email;
	}







	public void setEmail(String email) {
		this.email = email;
	}







	public String getCpf() {
		return cpf;
	}







	public void setCpf(String cpf) {
		this.cpf = cpf;
	}







	public String getTelefone() {
		return telefone;
	}







	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}







	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", telefone=" + telefone
				+ "]";
	}







	public Object orElseThrow(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

}
