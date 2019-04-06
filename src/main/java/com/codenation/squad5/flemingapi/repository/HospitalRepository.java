package com.codenation.squad5.flemingapi.repository;


import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.codenation.squad5.flemingapi.model.Hospital;

@Repository
public interface HospitalRepository extends MongoRepository<Hospital, String> { 
		
	List<Hospital> findAll();
}
