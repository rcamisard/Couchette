package com.example.planq.repository;

import com.example.planq.model.Lieu;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LieuRepository extends MongoRepository<Lieu, String> {

    public List<Lieu> findAll();
}
