package com.codenation.squad5.flemingapi.api.hospitais;

import com.codenation.squad5.flemingapi.api.hospitais.dto.HospitalDTO;
import com.codenation.squad5.flemingapi.api.hospitais.model.Hospital;
import com.codenation.squad5.flemingapi.api.hospitais.service.HospitalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Type;
import java.util.List;

@RestController
@RequestMapping("hospitais")
@Api(value = "hospitais", produces = MediaType.APPLICATION_JSON_VALUE)
public class HospitalController {

	private final Logger log = LoggerFactory.getLogger(getClass());

	private ModelMapper mapper;
	private HospitalService hospitalService;
	
	@Autowired
	public HospitalController(HospitalService hospitalService) {
		this.hospitalService = hospitalService;
		this.mapper = new ModelMapper();
	}
	
	@ApiOperation(value = "busca hospitais")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "retornar uma lista de hospitais"),
			@ApiResponse(code = 408, message = "Request timeout"),
			@ApiResponse(code = 422, message = "Validation error"),
			@ApiResponse(code = 500, message = "Internal Server Error")})
	@RequestMapping(method = RequestMethod.GET)
	public List<HospitalDTO> listarHospitais(){
		Type listType = new TypeToken<List<HospitalDTO>>(){}.getType();
		return mapper.map(hospitalService.listAll(), listType);
	}
	
	@ApiOperation(value = "cadastra hospital")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Cadastro efetuado com sucesso"),
			@ApiResponse(code = 408, message = "Request timeout"),
			@ApiResponse(code = 422, message = "Validation error"),
			@ApiResponse(code = 500, message = "Internal Server Error")})
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<HospitalDTO> salvarHospital(@RequestBody HospitalDTO hospital) {
		Hospital saved = hospitalService.save(mapper.map(hospital, Hospital.class));
		return  ResponseEntity.ok().body(mapper.map(saved, HospitalDTO.class));
	}
}
