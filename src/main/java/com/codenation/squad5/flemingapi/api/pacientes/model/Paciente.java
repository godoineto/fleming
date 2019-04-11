package com.codenation.squad5.flemingapi.api.pacientes.model;
<<<<<<< HEAD:src/main/java/com/codenation/squad5/flemingapi/api/pacientes/model/Paciente.java

import com.codenation.squad5.flemingapi.api.common.model.Endereco;
import org.springframework.data.mongodb.core.mapping.Document;
=======
>>>>>>> 957ef08d967bb0881e4e5c0f701e3de9b19472a1:src/main/java/com/codenation/squad5/flemingapi/api/pacientes/model/Paciente.java

import com.codenation.squad5.flemingapi.api.common.model.Endereco;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "paciente")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Paciente {
	
	private String idPaciente;	

	private String nome;
	
	private String sobrenome;
	
	private int idade;
	
	private String cpf;
	
	private String telefone;
	
	private Endereco endereco;

	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}
	
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
