/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librairie;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author cda611
 */
@Entity
@Table(name = "EVENEMENT")
@NamedQueries({
    @NamedQuery(name = "Evenement.findAll", query = "SELECT e FROM Evenement e"),
    @NamedQuery(name = "Evenement.findByEveId", query = "SELECT e FROM Evenement e WHERE e.eveId = :eveId"),
    @NamedQuery(name = "Evenement.findByEveNom", query = "SELECT e FROM Evenement e WHERE e.eveNom = :eveNom"),
    @NamedQuery(name = "Evenement.findByEveDateDeb", query = "SELECT e FROM Evenement e WHERE e.eveDateDeb = :eveDateDeb"),
    @NamedQuery(name = "Evenement.findByEveDateFin", query = "SELECT e FROM Evenement e WHERE e.eveDateFin = :eveDateFin"),
    @NamedQuery(name = "Evenement.findByEveRemise", query = "SELECT e FROM Evenement e WHERE e.eveRemise = :eveRemise")})
public class Evenement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EVE_ID")
    private Long eveId;
    @Basic(optional = false)
    @Column(name = "EVE_NOM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eveNom;
    @Basic(optional = false)
    @Column(name = "EVE_DATE_DEB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eveDateDeb;
    @Basic(optional = false)
    @Column(name = "EVE_DATE_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eveDateFin;
    @Basic(optional = false)
    @Column(name = "EVE_REMISE")
    private double eveRemise;

    public Evenement() {
        this.eveId = eveId;
    }

    public Evenement(Date eveNom, Date eveDateDeb, Date eveDateFin, double eveRemise) {
        this.eveId = eveId;
        this.eveNom = eveNom;
        this.eveDateDeb = eveDateDeb;
        this.eveDateFin = eveDateFin;
        this.eveRemise = eveRemise;
    }

    public Long getEveId() {
        return eveId;
    }

    public void setEveId(Long eveId) {
        this.eveId = eveId;
    }

    public Date getEveNom() {
        return eveNom;
    }

    public void setEveNom(Date eveNom) {
        this.eveNom = eveNom;
    }

    public Date getEveDateDeb() {
        return eveDateDeb;
    }

    public void setEveDateDeb(Date eveDateDeb) {
        this.eveDateDeb = eveDateDeb;
    }

    public Date getEveDateFin() {
        return eveDateFin;
    }

    public void setEveDateFin(Date eveDateFin) {
        this.eveDateFin = eveDateFin;
    }

    public double getEveRemise() {
        return eveRemise;
    }

    public void setEveRemise(double eveRemise) {
        this.eveRemise = eveRemise;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eveId != null ? eveId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evenement)) {
            return false;
        }
        Evenement other = (Evenement) object;
        if ((this.eveId == null && other.eveId != null) || (this.eveId != null && !this.eveId.equals(other.eveId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return eveNom + " " + eveDateDeb + " " + eveDateFin + " " + eveRemise;
    }
    
}
