/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librairie;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author cda611
 */
@Entity
@Table(name = "CLIENT")
@NamedQueries({
    @NamedQuery(name = "Client.findAll", query = "SELECT c FROM Client c"),
    @NamedQuery(name = "Client.findByClientId", query = "SELECT c FROM Client c WHERE c.clientId = :clientId"),
    @NamedQuery(name = "Client.findByClientNom", query = "SELECT c FROM Client c WHERE c.clientNom = :clientNom"),
    @NamedQuery(name = "Client.findByClientPrenom", query = "SELECT c FROM Client c WHERE c.clientPrenom = :clientPrenom"),
    @NamedQuery(name = "Client.findByClientEmail", query = "SELECT c FROM Client c WHERE c.clientEmail = :clientEmail"),
    @NamedQuery(name = "Client.findByClientPseudo", query = "SELECT c FROM Client c WHERE c.clientPseudo = :clientPseudo"),
    @NamedQuery(name = "Client.findByClientPassword", query = "SELECT c FROM Client c WHERE c.clientPassword = :clientPassword")})

public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CLIENT_ID")
    private Long clientId;
    @Basic(optional = false)
    @Column(name = "CLIENT_NOM")
    private String clientNom;
    @Basic(optional = false)
    @Column(name = "CLIENT_PRENOM")
    private String clientPrenom;
    @Basic(optional = false)
    @Column(name = "CLIENT_EMAIL")
    private String clientEmail;
    @Column(name = "CLIENT_PSEUDO")
    private String clientPseudo;
    @Basic(optional = false)
    @Column(name = "CLIENT_PASSWORD")
    private String clientPassword;

    public Client() {
    }

    public Client(Long clientId) {
        this.clientId = clientId;
    }

    public Client( String clientNom, String clientPrenom, String clientEmail, String clientPassword) {
        this.clientId = clientId;
        this.clientNom = clientNom;
        this.clientPrenom = clientPrenom;
        this.clientEmail = clientEmail;
        this.clientPassword = clientPassword;
    }

     public Client( String clientNom, String clientPrenom, String clientEmail, String clientPseudo, String clientPassword) {
        this.clientId = clientId;
        this.clientNom = clientNom;
        this.clientPrenom = clientPrenom;
        this.clientEmail = clientEmail;
        this.clientPseudo = clientPseudo;
        this.clientPassword = clientPassword;
    }
     
    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getClientNom() {
        return clientNom;
    }

    public void setClientNom(String clientNom) {
        this.clientNom = clientNom;
    }

    public String getClientPrenom() {
        return clientPrenom;
    }

    public void setClientPrenom(String clientPrenom) {
        this.clientPrenom = clientPrenom;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientPseudo() {
        return clientPseudo;
    }

    public void setClientPseudo(String clientPseudo) {
        this.clientPseudo = clientPseudo;
    }

    public String getClientPassword() {
        return clientPassword;
    }

    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientId != null ? clientId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.clientId == null && other.clientId != null) || (this.clientId != null && !this.clientId.equals(other.clientId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String str;
        str = clientNom + " " + clientPrenom + " " + clientEmail; 
        str += (clientPseudo != null) ? clientPseudo : "";
        str += " " + clientPassword;
    return str;
    
}
}
