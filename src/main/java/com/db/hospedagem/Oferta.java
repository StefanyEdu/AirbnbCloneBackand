package com.db.hospedagem;

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
	private Double preco;
	private String disponibilidade;
	private Integer diarias;
	private String cidade;
	private String uf;
	private Integer quantQuartos;
	
	
	public Oferta() {
		
	}
	

	public Oferta(String imovel, Double preco, String disponibilidade, Integer diarias, String cidade, String uf, Integer quantQuartos) {
		super();
		this.imovel = imovel;
		this.preco = preco;
		this.disponibilidade = disponibilidade;
		this.diarias = diarias;
		this.cidade = cidade;
		this.uf = uf;
		this.quantQuartos = quantQuartos;
	}


	@Override
	public String toString() {
		return "Oferta [id=" + id + ", imovel=" + imovel + ", preco=" + preco + ", disponibilidade=" + disponibilidade
				+ ", diarias=" + diarias + ", cidade=" + cidade + ", uf=" + uf + ", quantQuartos=" + quantQuartos + "]";
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
	
	public Double getPreco() {
		return this.preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String getDisponibilidade() {
		return this.disponibilidade;
	}
	
	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	public int getDiarias() {
		return this.diarias;
	}
	
	public void setDiarias(Integer diarias) {
		this.diarias = diarias;
	}
	public String getCidade() {
		return this.cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return this.uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public int getQuantQuartos() {
		return this.quantQuartos;
	}
	
	public void setQuantQuartos(Integer quantQuartos) {
		this.quantQuartos = quantQuartos;
	}
	
	public Double getValorTotal() {
		return this.diarias * this.preco.doubleValue();
	}

}
