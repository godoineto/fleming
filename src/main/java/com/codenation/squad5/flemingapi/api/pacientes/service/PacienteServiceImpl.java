package com.codenation.squad5.flemingapi.api.pacientes.service;


import com.codenation.squad5.flemingapi.api.pacientes.model.Paciente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.codenation.squad5.flemingapi.api.pacientes.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteRepository PacienteRepository;

    private static final Logger logger = LoggerFactory.getLogger(PacienteServiceImpl.class);

    @Override
    public List<Paciente> listAll() {
        return PacienteRepository.findAll();
    }

    @Override
    public Paciente save(Paciente paciente) {
        PacienteRepository.save(paciente);

        return paciente;
    }

    @Override
    public boolean exists(String name) {
        return false;
    }

}
