package com.example.planq.repository;

import com.example.planq.model.Rencontre;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RencontreRepository extends MongoRepository<Rencontre, String> {

    public List<Rencontre> findAllByIdUtilisateur(String idUtilisateur);
}
