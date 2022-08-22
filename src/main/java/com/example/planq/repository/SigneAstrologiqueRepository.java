package com.example.planq.repository;

import com.example.planq.model.Personne;
import com.example.planq.model.SigneAstrologique;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SigneAstrologiqueRepository extends MongoRepository<SigneAstrologique, String> {

    List<SigneAstrologique> findAll();

}
