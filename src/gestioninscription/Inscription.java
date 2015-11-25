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
public class Inscription {
    private Client client;
    private SessionFormation session;
    private Date dateInscription;

    public Inscription(Client client, SessionFormation session, Date dateInscription) {
        this.client = client;
        this.session = session;
        this.dateInscription = dateInscription;
    }

    public Client getClient() {
        return client;
    }

    public SessionFormation getSession() {
        return session;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setSession(SessionFormation session) {
        this.session = session;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }
}
