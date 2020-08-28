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
@Table(name = "TRANSPORTEUR")
@NamedQueries({
    @NamedQuery(name = "Transporteur.findAll", query = "SELECT t FROM Transporteur t"),
    @NamedQuery(name = "Transporteur.findByTranspId", query = "SELECT t FROM Transporteur t WHERE t.transpId = :transpId"),
    @NamedQuery(name = "Transporteur.findByTranspRaisonSociale", query = "SELECT t FROM Transporteur t WHERE t.transpRaisonSociale = :transpRaisonSociale"),
    @NamedQuery(name = "Transporteur.findByTranspEmail", query = "SELECT t FROM Transporteur t WHERE t.transpEmail = :transpEmail")})
public class Transporteur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TRANSP_ID")
    private Long transpId;
    @Basic(optional = false)
    @Column(name = "TRANSP_RAISON_SOCIALE")
    private String transpRaisonSociale;
    @Basic(optional = false)
    @Column(name = "TRANSP_EMAIL")
    private String transpEmail;

    public Transporteur() {
    
        this.transpId = transpId;
    }

    public Transporteur(String transpRaisonSociale, String transpEmail) {
        this.transpId = transpId;
        this.transpRaisonSociale = transpRaisonSociale;
        this.transpEmail = transpEmail;
    }

    public Long getTranspId() {
        return transpId;
    }

    public void setTranspId(Long transpId) {
        this.transpId = transpId;
    }

    public String getTranspRaisonSociale() {
        return transpRaisonSociale;
    }

    public void setTranspRaisonSociale(String transpRaisonSociale) {
        this.transpRaisonSociale = transpRaisonSociale;
    }

    public String getTranspEmail() {
        return transpEmail;
    }

    public void setTranspEmail(String transpEmail) {
        this.transpEmail = transpEmail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transpId != null ? transpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transporteur)) {
            return false;
        }
        Transporteur other = (Transporteur) object;
        if ((this.transpId == null && other.transpId != null) || (this.transpId != null && !this.transpId.equals(other.transpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return transpRaisonSociale + " " + transpEmail;
    }
    
}
