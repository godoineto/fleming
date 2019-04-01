package com.codenation.squad5.flemingapi.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codenation.squad5.flemingapi.model.Hospital;
import com.codenation.squad5.flemingapi.service.HospitalService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("hospitais")
@Api(value = "hospitais", produces = MediaType.APPLICATION_JSON_VALUE)
public class HospitalController{
	
	@Autowired
	private HospitalService hospitalService;

	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@ApiOperation(value = "busca hospitais")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "retornar uma lista de hospitais"),
			@ApiResponse(code = 408, message = "Request timeout"),
			@ApiResponse(code = 422, message = "Validation error"),
			@ApiResponse(code = 500, message = "Internal Server Error")})
	@RequestMapping(method = RequestMethod.GET)
	public List<Hospital> listarHospitais(){
		return hospitalService.listAll();
	}
	
	@ApiOperation(value = "cadastra hospital")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Cadastro efetuado com sucesso"),
			@ApiResponse(code = 408, message = "Request timeout"),
			@ApiResponse(code = 422, message = "Validation error"),
			@ApiResponse(code = 500, message = "Internal Server Error")})
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Hospital> salvarHospital(@RequestBody Hospital client) {
		Hospital saved = hospitalService.save(client);
		return  ResponseEntity.ok().body(saved);
	}
	

}
