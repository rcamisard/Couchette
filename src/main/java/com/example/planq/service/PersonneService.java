package com.example.planq.service;

import com.example.planq.model.LienPersonneRencontre;
import com.example.planq.model.Personne;
import com.example.planq.repository.LienPersonneRencontreRepository;
import com.example.planq.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonneService {

    @Autowired
    private PersonneRepository personneRepository;

    @Autowired
    private RencontreService rencontreService;

    @Autowired
    private LienPersonneRencontreRepository lienPersonneRencontreRepository;

    public List<Personne> getAllPersonnes(String idUtilisateur) {
        return personneRepository.findByIdUtilisateur(idUtilisateur);
    }

    public Personne ajoutPersonne(Personne personne) {
        personne.setId(null);
        Personne personneBdd = personneRepository.findByPrenomAndNom(personne.getPrenom(), personne.getNom());
        if(personneBdd == null){
        personneRepository.save(personne);
        }
        return personne;
    }

    public Personne getPersonne(String id) {
        Optional<Personne> personne =  personneRepository.findById(id);
        if (personne.isPresent()){
            return personne.get();
        }
        return null;
    }

    public void deletePersonne(String id) {
        rencontreService.deleteLienByIdPersonne(id);
        personneRepository.deleteById(id);
    }

    public List<Personne> getPersonnesByIdRencontre(String idRencontre){
        List<Personne> personnes = new ArrayList<>();
        List<LienPersonneRencontre> liens = lienPersonneRencontreRepository.findAllByIdRencontre(idRencontre);
        liens.forEach(lien -> {
            personnes.add(personneRepository.findById(lien.getIdPersonne()).orElse(null));
        });
        return personnes;
    }
}
