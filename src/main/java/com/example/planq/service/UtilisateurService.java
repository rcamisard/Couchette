package com.example.planq.service;

import com.example.planq.model.Utilisateur;
import com.example.planq.repository.UtilisateurRepository;
import com.example.planq.service.util.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {

    @Autowired
    private PasswordUtil passwordUtil;

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public Utilisateur login(String username, String password){
        String passwordHash = passwordUtil.encrypt(password);
        Utilisateur utilisateur =  utilisateurRepository.findUtilisateurByUsernameAndPassword(username, passwordHash);
        return utilisateur;
    }

    public Utilisateur creerCompte(String username, String password) {
        Utilisateur utilisateur = utilisateurRepository.findUtilisateurByUsername(username);
        if (utilisateur != null){
            return null;
        }
        utilisateur = new Utilisateur();
        utilisateur.setUsername(username);
        utilisateur.setPassword(passwordUtil.encrypt(password));
        utilisateurRepository.save(utilisateur);
        return utilisateur;
    }
}
