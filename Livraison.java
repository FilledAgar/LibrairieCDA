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
@Table(name = "LIVRAISON")
@NamedQueries({
    @NamedQuery(name = "Livraison.findAll", query = "SELECT l FROM Livraison l"),
    @NamedQuery(name = "Livraison.findByLivrId", query = "SELECT l FROM Livraison l WHERE l.livrId = :livrId"),
    @NamedQuery(name = "Livraison.findByTranspId", query = "SELECT l FROM Livraison l WHERE l.transpId = :transpId"),
    @NamedQuery(name = "Livraison.findByLivrSuivi", query = "SELECT l FROM Livraison l WHERE l.livrSuivi = :livrSuivi")})
public class Livraison implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LIVR_ID")
    private Long livrId;
    @Basic(optional = false)
    @Column(name = "TRANSP_ID")
    private long transpId;
    @Basic(optional = false)
    @Column(name = "LIVR_SUIVI")
    private String livrSuivi;

    public Livraison() {
    }

    public Livraison(Long livrId) {
        this.livrId = livrId;
    }

    public Livraison(Long livrId, long transpId, String livrSuivi) {
        this.livrId = livrId;
        this.transpId = transpId;
        this.livrSuivi = livrSuivi;
    }

    public Long getLivrId() {
        return livrId;
    }

    public void setLivrId(Long livrId) {
        this.livrId = livrId;
    }

    public long getTranspId() {
        return transpId;
    }

    public void setTranspId(long transpId) {
        this.transpId = transpId;
    }

    public String getLivrSuivi() {
        return livrSuivi;
    }

    public void setLivrSuivi(String livrSuivi) {
        this.livrSuivi = livrSuivi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (livrId != null ? livrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livraison)) {
            return false;
        }
        Livraison other = (Livraison) object;
        if ((this.livrId == null && other.livrId != null) || (this.livrId != null && !this.livrId.equals(other.livrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "librairie.Livraison[ livrId=" + livrId + " ]";
    }
    
}
