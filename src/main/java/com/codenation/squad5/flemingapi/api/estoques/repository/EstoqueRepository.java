package com.codenation.squad5.flemingapi.api.estoques.repository;

import com.codenation.squad5.flemingapi.api.estoques.model.Estoque;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EstoqueRepository extends MongoRepository<Estoque, String> {
}
