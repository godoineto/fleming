package com.codenation.squad5.flemingapi.api.pacientes.service;


import com.codenation.squad5.flemingapi.api.pacientes.model.Paciente;

import java.util.List;


public interface PacienteService {

    List<Paciente> listAll();

   Paciente save(Paciente paciente);

    boolean exists(String name);

}
