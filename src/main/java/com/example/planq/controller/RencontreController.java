package com.example.planq.controller;

import com.example.planq.model.Personne;
import com.example.planq.model.Rencontre;
import com.example.planq.service.RencontreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Configuration
@RequestMapping("rencontre")
public class RencontreController {

    @Autowired
    RencontreService rencontreService;

    @GetMapping
    public ResponseEntity<List<Rencontre>> getAllRencontres(@RequestParam String id){
        return new ResponseEntity<>(rencontreService.getAllRencontres(id), HttpStatus.OK);
    }
    @PostMapping("/ajout")
    public ResponseEntity<Rencontre> ajoutRencontre(@RequestBody Rencontre rencontre){
        return new ResponseEntity<>(rencontreService.ajoutRencontre(rencontre), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody void deleteRencontre(@RequestParam String id){
        rencontreService.deleteRencontre(id);
    }

    @GetMapping("{id}")
    public ResponseEntity<Rencontre> getRencontre(@RequestParam String id) {return new ResponseEntity<>(rencontreService.getRencontre(id), HttpStatus.OK); }
}
