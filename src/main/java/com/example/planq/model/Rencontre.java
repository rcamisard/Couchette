package com.example.planq.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document("Rencontre")
public class Rencontre {

    @Id
    private String id;
    private String idUtilisateur;
    private String note;
    private String commentaire;
    private Date date;
    private String ville;
    private String lieu;
    private List<Pratique> pratiques;
    private List<String> idPersonnes;
    private String idLieu;
    private String idTypeRencontre;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(String idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public List<Pratique> getPratiques() {
        return pratiques;
    }

    public void setPratiques(List<Pratique> pratiques) {
        this.pratiques = pratiques;
    }

    public List<String> getIdPersonnes() {
        return idPersonnes;
    }

    public void setIdPersonnes(List<String> idPersonnes) {
        this.idPersonnes = idPersonnes;
    }

    public String getIdLieu() {
        return idLieu;
    }

    public void setIdLieu(String idLieu) {
        this.idLieu = idLieu;
    }

    public String getIdTypeRencontre() {
        return idTypeRencontre;
    }

    public void setIdTypeRencontre(String idTypeRencontre) {
        this.idTypeRencontre = idTypeRencontre;
    }
}
