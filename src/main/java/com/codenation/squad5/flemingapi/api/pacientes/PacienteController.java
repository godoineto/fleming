package com.codenation.squad5.flemingapi.api.pacientes;

import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hospitais/{id}/pacientes")
@Api(value = "pacientes", produces = MediaType.APPLICATION_JSON_VALUE)
public class PacienteController {
}
