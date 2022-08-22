package com.example.planq.repository;

import com.example.planq.model.TypeRencontre;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeRencontreRepository extends MongoRepository<TypeRencontre, String> {

    List<TypeRencontre> findAll();
}
