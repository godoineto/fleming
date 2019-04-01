package com.codenation.squad5.flemingapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="TB_HOSPITAL")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Hospital {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hospital_Sequence")
	@SequenceGenerator(name = "hospital_Sequence", sequenceName = "HOSPITAL_SEQ")
	private long idHospital;
	
	@Column(name = "name")
	@NotNull(message = "Name cannot be null!")
	@Size(min = 3, max = 80, message = "Name Me must be between 3 and 80 characters")
	private String nome;
	
	@Column(name = "endereco")
	private String endereco;
	
	public long getIdHospital() {
		return idHospital;
	}

	public void setIdHospital(long idHospital) {
		this.idHospital = idHospital;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


}
