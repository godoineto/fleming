package com.codenation.squad5.flemingapi.api.pacientes.service;

import com.codenation.squad5.flemingapi.api.pacientes.model.Paciente;
import com.codenation.squad5.flemingapi.api.pacientes.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public Paciente save(Paciente novoPaciente) {
        return pacienteRepository.save(novoPaciente);
    }
}
