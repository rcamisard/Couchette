package com.example.planq.service;

import com.example.planq.model.LienPersonneRencontre;
import com.example.planq.model.Rencontre;
import com.example.planq.repository.LienPersonneRencontreRepository;
import com.example.planq.repository.RencontreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RencontreService {

    @Autowired
    RencontreRepository rencontreRepository;

    @Autowired
    LienPersonneRencontreRepository lienPersonneRencontreRepository;

    protected void deleteLienByIdPersonne(String idPersonne){
        List<LienPersonneRencontre> liens = lienPersonneRencontreRepository.findAllByIdPersonne(idPersonne);
        List<String> idsRencontres = new ArrayList<>();
        liens.forEach( lien -> {
            //On supprime tous les liens qui concernent cette personne
            lienPersonneRencontreRepository.delete(lien);
            idsRencontres.add(lien.getIdRencontre());
        });
        //On itère sur toutes les rencontres qui ont été affectées par la suppression
        idsRencontres.forEach( idRencontre -> {
            Rencontre rencontre = rencontreRepository.findById(idRencontre).orElse(null);
            if(rencontre != null){
                //Pour chaque rencontre qui a été traitée, on vérifie qu'il reste des personnes dans la rencontre
                List<LienPersonneRencontre> lienRencontre = lienPersonneRencontreRepository.findAllByIdRencontre(rencontre.getId());
                if(lienRencontre.isEmpty()){
                    //S'il n'y a plus personne dans la rencontre, on la supprime
                    rencontreRepository.delete(rencontre);
                }
            }
        });
    }

    public Rencontre ajoutRencontre(Rencontre rencontre){
        //On créé la rencontre
        final Rencontre rencontreDb = rencontreRepository.save(rencontre);

        //On créé les liens
        List<String> idpersonnes = rencontre.getIdPersonnes();
        if(!idpersonnes.isEmpty()){
            idpersonnes.forEach(idPersonne -> {
                LienPersonneRencontre lien = new LienPersonneRencontre(idPersonne, rencontreDb.getId() );
                lienPersonneRencontreRepository.save(lien);
            });
        }
    return rencontre;
    }

    public List<Rencontre> getAllRencontres(String id){
        return rencontreRepository.findAllByIdUtilisateur(id);
    }

    public void deleteRencontre(String id){
        rencontreRepository.deleteById(id);
    }

    public Rencontre getRencontre(String id) {
        return rencontreRepository.findById(id).orElse(null);
    }
}
