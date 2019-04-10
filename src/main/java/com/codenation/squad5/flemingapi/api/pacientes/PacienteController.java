package com.codenation.squad5.flemingapi.api.pacientes;

import com.codenation.squad5.flemingapi.api.pacientes.dto.PacienteDTO;
import com.codenation.squad5.flemingapi.api.pacientes.model.Paciente;
import com.codenation.squad5.flemingapi.api.pacientes.service.PacienteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hospitais/{idHospital}/pacientes")
@Api(value = "pacientes", produces = MediaType.APPLICATION_JSON_VALUE)
public class PacienteController {

    private ModelMapper mapper;
    private PacienteService pacienteService;

    @Autowired
    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
        this.mapper = new ModelMapper();
    }


    @ApiOperation(value = "cadastra paciente")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Cadastro efetuado com sucesso"),
            @ApiResponse(code = 408, message = "Request timeout"),
            @ApiResponse(code = 422, message = "Validation error"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    @PostMapping
    public PacienteDTO cadastrarPaciente(@RequestBody PacienteDTO novoPaciente, @PathVariable("idHospital") String idHospital) {
        return mapper.map(pacienteService.save(mapper.map(novoPaciente, Paciente.class)), PacienteDTO.class);
    }

    @PutMapping("{id}")
    public void atualizarPaciente() {

    }

    @DeleteMapping("{id}")
    public void deletarPaciente() {

    }

    @GetMapping("{id}")
    public void obterPaciente() {

    }

    @GetMapping
    public void listaDePacientes() {

    }
}
