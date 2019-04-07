package com.codenation.squad5.flemingapi.api.hospitais.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

import static com.codenation.squad5.flemingapi.api.common.Predicates.not;


@Document(collection = "hospital")
public class Hospital {
	
	@Id
	private String id;
	
	private String nome;
	
//	private Endereco endereco;

	private List<Leito> leitos;

	public Hospital(){
		leitos = new ArrayList<>();
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

//	public Endereco getEndereco() {
//		return endereco;
//	}
//
//	public void setEndereco(Endereco endereco) {
//		this.endereco = endereco;
//	}

	public List<Leito> getLeitos() {
		return leitos;
	}

	public void setLeitos(List<Leito> leitos) {
		this.leitos = leitos;
	}

	public long totalDeLeitos() {
		return leitos.size();
	}

	public long leitosDisponiveis() {
		return leitos.stream().filter(not(Leito::isOcupado)).count();
	}


}
