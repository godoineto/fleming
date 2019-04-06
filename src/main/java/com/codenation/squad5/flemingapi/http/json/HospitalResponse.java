package com.codenation.squad5.flemingapi.http.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HospitalResponse {
	
	@JsonProperty("nome")
	private String nome;
	
	@JsonProperty("endereco")
	private EnderecoResponse endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public EnderecoResponse getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoResponse endereco) {
		this.endereco = endereco;
	}
	
		
}
