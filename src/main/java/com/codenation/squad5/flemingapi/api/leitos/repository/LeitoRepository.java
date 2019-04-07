package com.codenation.squad5.flemingapi.api.leitos.repository;

import com.codenation.squad5.flemingapi.api.leitos.model.Leito;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LeitoRepository extends MongoRepository<Leito, String> {
}
