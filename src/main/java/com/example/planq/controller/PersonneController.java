package com.example.planq.controller;

import com.example.planq.model.Personne;
import com.example.planq.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("personne")
public class PersonneController {

    @Autowired
    private PersonneService personneService;

    @GetMapping("/")
    public @ResponseBody List<Personne> getAllPersonnes(@RequestParam String id){
        return personneService.getAllPersonnes(id);
    }

    @PostMapping("/ajout")
    public ResponseEntity<Personne> ajoutPersonne(@RequestBody Personne personne){
        return new ResponseEntity<>(personneService.ajoutPersonne(personne), HttpStatus.OK);
    }

    @GetMapping(path = "/rencontre")
    public ResponseEntity<List<Personne>> getPersonnesByIdRencontre(@RequestParam String id) {
        return new ResponseEntity<>(personneService.getPersonnesByIdRencontre(id), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public @ResponseBody Personne getPersonne(@RequestParam String id){
        return personneService.getPersonne(id);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody void deletePersonne(@RequestParam String id){
        personneService.deletePersonne(id);
    }

}
