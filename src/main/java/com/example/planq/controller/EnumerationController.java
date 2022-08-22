package com.example.planq.controller;

import com.example.planq.model.*;
import com.example.planq.service.EnumerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/enumeration")
public class EnumerationController {

    @Autowired
    EnumerationService enumerationService;

    @GetMapping("/signesAstrologiques")
    public @ResponseBody List<SigneAstrologique> getAllSignesAstrologiques(){
        return enumerationService.getAllSignesAstrologiques();
    }

    @GetMapping("/lieux")
    public ResponseEntity<List<Lieu>> getAllLieux() {
        return new ResponseEntity(enumerationService.getAllLieux(), HttpStatus.OK);
    }

    @GetMapping("/typesRencontre")
    public ResponseEntity<List<TypeRencontre>> getAllTypesRencontre(){
        return new ResponseEntity<List<TypeRencontre>>(enumerationService.getAllTypesRencontre(), HttpStatus.OK);
    }

    @GetMapping("/pratiques")
    public ResponseEntity<List<Pratique>> getAllPratiques(){
        return new ResponseEntity<List<Pratique>>(enumerationService.getAllPratiques(), HttpStatus.OK);
    }

    @GetMapping("/genres")
    public ResponseEntity<List<Genre>> getAllGenres(){
        return new ResponseEntity<List<Genre>>(enumerationService.getAllGenres(), HttpStatus.OK);
    }
}
