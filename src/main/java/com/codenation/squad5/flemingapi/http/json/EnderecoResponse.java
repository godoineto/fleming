package com.codenation.squad5.flemingapi.http.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EnderecoResponse {
	
	@JsonProperty("rua")
	private String rua;	
	
	@JsonProperty("numero")
	private String numero;
	
	@JsonProperty("complemento")
	private String complemento;
	
	@JsonProperty("bairro")
	private String bairro;
	
	@JsonProperty("cep")
	private String cep;
	
	@JsonProperty("longitude")
	private String longitude;
	
	@JsonProperty("latitude")
	private String latitude;
	
	@JsonProperty("cidade")
	private String cidade;
	
	@JsonProperty("estado")
	private String estado;
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
