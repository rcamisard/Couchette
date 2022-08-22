package com.example.planq.controller;

import com.example.planq.model.Utilisateur;
import com.example.planq.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/utilisateur")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping("/login")
    public @ResponseBody Utilisateur login( Utilisateur utilisateur) {
        return utilisateurService.login(utilisateur.getUsername(), utilisateur.getPassword());
    }

    @PostMapping("/creerCompte")
    public @ResponseBody Utilisateur creerCompte(@RequestBody Utilisateur user) {
        return utilisateurService.creerCompte(user.getUsername(), user.getPassword());
    }
}
