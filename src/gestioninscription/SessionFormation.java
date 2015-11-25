/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioninscription;
import java.util.*;

/**
 *
 * @author Flavien
 */
public class SessionFormation {
    private int num;
    private Formation formation;
    private Date dateDebut;
    private int nbPlaces;
    private int nbInscrits;
    private boolean close;

    public SessionFormation(int num, Formation formation, Date dateDebut, int nbPlaces, int nbInscrits, boolean close) {
        this.num = num;
        this.formation = formation;
        this.dateDebut = dateDebut;
        this.nbPlaces = nbPlaces;
        this.nbInscrits = nbInscrits;
        this.close = close;
    }

    public int getNum() {
        return num;
    }

    public Formation getFormation() {
        return formation;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public int getNbInscrits() {
        return nbInscrits;
    }

    public boolean isClose() {
        return close;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public void setNbInscrits(int nbInscrits) {
        this.nbInscrits = nbInscrits;
    }

    public void setClose(boolean close) {
        this.close = close;
    }
}
