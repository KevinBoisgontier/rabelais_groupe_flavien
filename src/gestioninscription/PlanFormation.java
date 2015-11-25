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
public class PlanFormation {
    private Client client;
    private Formation formation;
    private boolean effectue;

    public PlanFormation(Client client, Formation formation, boolean effectue) {
        this.client = client;
        this.formation = formation;
        this.effectue = effectue;
    }

    public Client getClient() {
        return client;
    }

    public Formation getFormation() {
        return formation;
    }

    public boolean isEffectue() {
        return effectue;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public void setEffectue(boolean effectue) {
        this.effectue = effectue;
    }
}
