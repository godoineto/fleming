package com.codenation.squad5.flemingapi.api.hospitais.service;

import com.codenation.squad5.flemingapi.api.hospitais.model.Hospital;
import com.codenation.squad5.flemingapi.api.hospitais.repository.HospitalRepository;
import com.codenation.squad5.flemingapi.api.leitos.repository.LeitoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	private HospitalRepository hospitalRepository;

	@Autowired
	private LeitoRepository leitoRepository;

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
