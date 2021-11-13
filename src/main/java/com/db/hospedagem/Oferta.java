package com.db.hospedagem;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
/*
 * *
 * @author Danieli Tessaro
 * @author Stefany Eduarda
 */

// Iniciando a Entidade
@Entity
public class Oferta {
	 private ArrayList<String> list = new ArrayList<>();
	 

	// Criação dos atributos
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String imovel;
	private String preco;
	private String disponibilidade;
	private String diarias;
	private String cidade;
	private String uf;
	private String quantQuartos;

	// metodo vazio
	public Oferta() {
	}

   // metodo toString
	@Override
	public String toString() {
		return "Oferta [id=" + id + ", imovel=" + imovel + ", preco=" + preco + ", disponibilidade=" + disponibilidade
				+ ", diarias=" + diarias + ", cidade=" + cidade + ", uf=" + uf + ", quantQuartos=" + quantQuartos + "]";
	}
    
	//Constrtutor 
	public Oferta(String imovel, String preco, String disponibilidade, String diarias, String cidade, String uf,
			String quantQuartos) {
		super();
		this.imovel = imovel;
		this.preco = preco;
		this.disponibilidade = disponibilidade;
		this.diarias = diarias;
		this.cidade = cidade;
		this.uf = uf;
		this.quantQuartos = quantQuartos;
	}
	
	//Iniciando set e get

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImovel() {
		return imovel;
	}

	public void setImovel(String imovel) {
		this.imovel = imovel;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public String getDiarias() {
		return diarias;
	}

	public void setDiarias(String diarias) {
		this.diarias = diarias;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getQuantQuartos() {
		return quantQuartos;
	}

	public void setQuantQuartos(String quantQuartos) {
		this.quantQuartos = quantQuartos;
	}
	
    
 
}
