package com.codenation.squad5.flemingapi.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.codenation.squad5.flemingapi.model.Hospital;

@Repository
@Transactional
public interface HospitalRepository extends JpaRepository<Hospital, Long> { 
		
	List<Hospital> findAll();
}
