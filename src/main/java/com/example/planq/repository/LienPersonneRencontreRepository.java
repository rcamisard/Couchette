package com.example.planq.repository;

import com.example.planq.model.LienPersonneRencontre;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LienPersonneRencontreRepository extends MongoRepository<LienPersonneRencontre, String> {

    List<LienPersonneRencontre> findAllByIdPersonne(String idPersonne);

    List<LienPersonneRencontre> findAllByIdRencontre(String idRencontre);

    void deleteAllByIdPersonne(String idPersonne);

    void deleteAllByIdRencontre(String idRencontre);

}
