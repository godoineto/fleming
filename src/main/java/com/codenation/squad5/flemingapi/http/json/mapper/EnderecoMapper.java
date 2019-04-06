package com.codenation.squad5.flemingapi.http.json.mapper;

import org.springframework.stereotype.Component;

import com.codenation.squad5.flemingapi.http.json.EnderecoResponse;
import com.codenation.squad5.flemingapi.model.Endereco;

@Component("enderecoMapper")
public class EnderecoMapper {
	
	public EnderecoResponse mapToResponse(Endereco endereco) {
		EnderecoResponse response = new EnderecoResponse();
		response.setBairro(endereco.getBairro());
		response.setCep(endereco.getCep());
		response.setCidade(endereco.getCidade());
		response.setComplemento(endereco.getComplemento());
		response.setEstado(endereco.getEstado());
		response.setLatitude(endereco.getLatitude());
		response.setLongitude(endereco.getLongitude());
		response.setNumero(endereco.getNumero());
		response.setRua(endereco.getRua());
		return response;
	}

}
