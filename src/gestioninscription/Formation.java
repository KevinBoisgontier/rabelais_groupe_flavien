/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioninscription;

/**
 *
 * @author Flavien
 */
public class Formation {
    private String libelle;
    private String niveau;
    private String type;
    private String description;
    private boolean diplomante;
    private int duree;
    private int coutRevient;

    public Formation(String libelle, String niveau, String type, String description, boolean diplomante, int duree, int coutRevient) {
        this.libelle = libelle;
        this.niveau = niveau;
        this.type = type;
        this.description = description;
        this.diplomante = diplomante;
        this.duree = duree;
        this.coutRevient = coutRevient;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getNiveau() {
        return niveau;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDiplomante() {
        return diplomante;
    }

    public int getDuree() {
        return duree;
    }

    public int getCoutRevient() {
        return coutRevient;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDiplomante(boolean diplomante) {
        this.diplomante = diplomante;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setCoutRevient(int coutRevient) {
        this.coutRevient = coutRevient;
    }
}
