package com.example.planq.repository;

import com.example.planq.model.Utilisateur;
import jdk.jshell.execution.Util;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends MongoRepository<Utilisateur, String> {

     Utilisateur findUtilisateurByUsernameAndPassword(String username, String password);

     Utilisateur findUtilisateurByUsername(String username);
}
