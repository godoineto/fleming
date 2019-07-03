package com.codenation.squad5.flemingapi.api.pacientes.repository;

import com.codenation.squad5.flemingapi.api.pacientes.model.Paciente;
import org.springframework.data.mongodb.repository.MongoRepository;

<<<<<<< HEAD
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PacienteRepository extends MongoRepository<Paciente, String> {
    List<Paciente> findAll();
=======
public interface PacienteRepository extends MongoRepository<Paciente, String> {
>>>>>>> 957ef08d967bb0881e4e5c0f701e3de9b19472a1
}
