package com.codenation.squad5.flemingapi.service.impl;

import java.util.Base64;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codenation.squad5.flemingapi.model.Hospital;
import com.codenation.squad5.flemingapi.repository.HospitalRepository;
import com.codenation.squad5.flemingapi.service.HospitalService;


@Service
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	private HospitalRepository hospitalRepository;

	private static final Logger logger = LoggerFactory.getLogger(HospitalServiceImpl.class);

	@Override
	public List<Hospital> listAll() {
		return hospitalRepository.findAll();
	}
	
	@Override
	public Hospital save(Hospital hospital) {
		hospitalRepository.save(hospital);
		return hospital;
	}


	@Override
	public boolean exists(String name) {
		return false;
	}


}
