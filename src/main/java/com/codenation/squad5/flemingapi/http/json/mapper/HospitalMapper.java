package com.codenation.squad5.flemingapi.http.json.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.codenation.squad5.flemingapi.http.json.HospitalResponse;
import com.codenation.squad5.flemingapi.model.Hospital;


@Component("hospitalMapper")
public class HospitalMapper {

	@Autowired	
	private @Qualifier("enderecoMapper") EnderecoMapper mapperEndereco;
		
	public HospitalResponse mapToResponse(Hospital hospital) {
		HospitalResponse response = new HospitalResponse();
		response.setNome(hospital.getNome());
		response.setEndereco(mapperEndereco.mapToResponse(hospital.getEndereco()));
		return response;
	}
}
