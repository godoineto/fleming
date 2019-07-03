package com.codenation.squad5.flemingapi.api.hospitais.service;

import com.codenation.squad5.flemingapi.api.hospitais.model.Hospital;

import java.util.List;


public interface HospitalService {

	List<Hospital> listAll();
	
	Hospital save(Hospital hospital);

	boolean exists(String name);
}
