package com.codenation.squad5.flemingapi.http.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PacienteResponse {
	
	@JsonProperty("nome")
	private String nome;	
	
	@JsonProperty("sobrenome")
	private String sobrenome;
	
	@JsonProperty("idade")
	private int idade;
	
	@JsonProperty("cpf")
	private String cpf;
	
	@JsonProperty("telefone")
	private String telefone;	

	@JsonProperty("endereco")
	private EnderecoResponse endereco;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
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

	public EnderecoResponse getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoResponse endereco) {
		this.endereco = endereco;
	}
	
		
}
