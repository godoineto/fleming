package com.codenation.squad5.flemingapi.service;

import java.util.List;


import com.codenation.squad5.flemingapi.model.Hospital;


public interface HospitalService {

	List<Hospital> listAll();
	
	Hospital save(Hospital hospital);

	boolean exists(String name);
}
