package com.example.planq.repository;

import com.example.planq.model.Pratique;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PratiqueRepository extends MongoRepository<Pratique, String> {

    List<Pratique> findAll();
}
