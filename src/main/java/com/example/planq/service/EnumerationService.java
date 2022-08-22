package com.example.planq.service;

import com.example.planq.model.*;
import com.example.planq.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnumerationService {

    @Autowired
    SigneAstrologiqueRepository signeAstrologiqueRepository;

    @Autowired
    LieuRepository lieuRepository;

    @Autowired
    TypeRencontreRepository typeRencontreRepository;

    @Autowired
    PratiqueRepository pratiqueRepository;

    @Autowired
    GenreRepository genreRepository;

    public List<SigneAstrologique> getAllSignesAstrologiques(){
        return signeAstrologiqueRepository.findAll();
    }

    public List<Lieu> getAllLieux() {return lieuRepository.findAll();}

    public List<TypeRencontre> getAllTypesRencontre() { return typeRencontreRepository.findAll(); }

    public List<Pratique> getAllPratiques() { return pratiqueRepository.findAll(); }

    public List<Genre> getAllGenres() { return genreRepository.findAll(); }
}
