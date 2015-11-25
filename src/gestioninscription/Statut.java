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
public class Statut {
    private String type;
    private float tauxHoraire;

    public Statut(String type, float tauxHoraire) {
        this.type = type;
        this.tauxHoraire = tauxHoraire;
    }

    public String getType() {
        return type;
    }

    public float getTauxHoraire() {
        return tauxHoraire;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTauxHoraire(float tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }
}
