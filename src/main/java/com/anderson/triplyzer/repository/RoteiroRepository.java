package com.anderson.triplyzer.repository;

import com.anderson.triplyzer.domain.Roteiro;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoteiroRepository extends MongoRepository<Roteiro, String> {

}
