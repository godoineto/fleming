package com.codenation.squad5.flemingapi.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.codenation.squad5.flemingapi.model.Hospital;


@Component
public interface HospitalService {

	List<Hospital> listAll();
	
	Hospital save(Hospital hospital);

	boolean exists(String name);
}
