package gestioninscription;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flavien
 */
public class Client {
    private String matricule;
    private String nom;
    private Statut typeStatut;
    private String adresse;
    private int codePostal;
    private String ville;
    private int nbHeuresCompta;
    private int nbHeuresBureautique;

    public Client(String matricule, String nom, Statut typeStatut, String adresse, int codePostal, String ville, int nbHeuresCompta, int nbHeuresBureautique) {
        this.matricule = matricule;
        this.nom = nom;
        this.typeStatut = typeStatut;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.nbHeuresCompta = nbHeuresCompta;
        this.nbHeuresBureautique = nbHeuresBureautique;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public Statut getTypeStatut() {
        return typeStatut;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }

    public int getNbHeuresCompta() {
        return nbHeuresCompta;
    }

    public int getNbHeuresBureautique() {
        return nbHeuresBureautique;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTypeStatut(Statut typeStatut) {
        this.typeStatut = typeStatut;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setNbHeuresCompta(int nbHeuresCompta) {
        this.nbHeuresCompta = nbHeuresCompta;
    }

    public void setNbHeuresBureautique(int nbHeuresBureautique) {
        this.nbHeuresBureautique = nbHeuresBureautique;
    }
    
    @Override
    public String toString() {
        return matricule;
    }
}
