package com.db.hospedagem.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
	
@Entity(name="oferta")
public class Oferta {
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String imovel;
	private String preco;
	private String disponibilidade;
	
public Oferta() {
		
	}
	

	public Oferta(String imovel, String preco, String disponibilidade) {
	super();
	this.imovel = imovel;
	this.preco = preco;
	this.disponibilidade = disponibilidade;
}


	@Override
public String toString() {
	return "Oferta [id=" + id + ", imovel=" + imovel + ", preco=" + preco + ", disponibilidade=" + disponibilidade
			+ "]";
}


	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getImovel() {
		return this.imovel;
	}
	
	public void setImovel(String imovel) {
		this.imovel = imovel;
	}
	
	public String getPreco() {
		return this.preco;
	}
	
	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	public String getDisponibilidade() {
		return this.disponibilidade;
	}
	
	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

}
