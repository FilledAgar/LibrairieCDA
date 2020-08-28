/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librairie;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author cda611
 */
@Embeddable
public class StatutLivraisonPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CMDE_ID")
    private long cmdeId;
    @Basic(optional = false)
    @Column(name = "LIVR_ID")
    private long livrId;

    public StatutLivraisonPK() {
    }

    public StatutLivraisonPK(long cmdeId, long livrId) {
        this.cmdeId = cmdeId;
        this.livrId = livrId;
    }

    public long getCmdeId() {
        return cmdeId;
    }

    public void setCmdeId(long cmdeId) {
        this.cmdeId = cmdeId;
    }

    public long getLivrId() {
        return livrId;
    }

    public void setLivrId(long livrId) {
        this.livrId = livrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cmdeId;
        hash += (int) livrId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StatutLivraisonPK)) {
            return false;
        }
        StatutLivraisonPK other = (StatutLivraisonPK) object;
        if (this.cmdeId != other.cmdeId) {
            return false;
        }
        if (this.livrId != other.livrId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "librairie.StatutLivraisonPK[ cmdeId=" + cmdeId + ", livrId=" + livrId + " ]";
    }
    
}
