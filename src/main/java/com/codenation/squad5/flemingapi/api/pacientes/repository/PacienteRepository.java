package com.codenation.squad5.flemingapi.api.pacientes.repository;

import com.codenation.squad5.flemingapi.api.pacientes.model.Paciente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PacienteRepository extends MongoRepository<Paciente, String> {
}
