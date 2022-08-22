package com.example.planq.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("LienPersonneRencontre")
public class LienPersonneRencontre {

    @Id
    private String id;
    private String idPersonne;
    private String idRencontre;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(String idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getIdRencontre() {
        return idRencontre;
    }

    public void setIdRencontre(String idRencontre) {
        this.idRencontre = idRencontre;
    }

    public LienPersonneRencontre(String idPersonne, String idRencontre) {
        this.idPersonne = idPersonne;
        this.idRencontre = idRencontre;
    }
}
