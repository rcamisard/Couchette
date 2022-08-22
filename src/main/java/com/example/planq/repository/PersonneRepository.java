package com.example.planq.repository;

import com.example.planq.model.Personne;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonneRepository extends MongoRepository<Personne, String> {

    Personne findByPrenomAndNom(String prenom, String nom);
    List<Personne> findByIdUtilisateur(String idUtilisateur);
    Optional<Personne> findById(String id);

}
