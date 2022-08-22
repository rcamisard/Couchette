package com.example.planq.model;

import org.springframework.data.annotation.Id;

public class Enumeration {

    @Id
    private String id;
    private String libelle;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
