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
public class EcrirePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "AUTEUR_ID")
    private long auteurId;
    @Basic(optional = false)
    @Column(name = "LIVRE_ID")
    private int livreId;
    @Basic(optional = false)
    @Column(name = "LIVRE_ISBN")
    private String livreIsbn;

    public EcrirePK() {
    }

    public EcrirePK(long auteurId, int livreId, String livreIsbn) {
        this.auteurId = auteurId;
        this.livreId = livreId;
        this.livreIsbn = livreIsbn;
    }

    public long getAuteurId() {
        return auteurId;
    }

    public void setAuteurId(long auteurId) {
        this.auteurId = auteurId;
    }

    public int getLivreId() {
        return livreId;
    }

    public void setLivreId(int livreId) {
        this.livreId = livreId;
    }

    public String getLivreIsbn() {
        return livreIsbn;
    }

    public void setLivreIsbn(String livreIsbn) {
        this.livreIsbn = livreIsbn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) auteurId;
        hash += (int) livreId;
        hash += (livreIsbn != null ? livreIsbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcrirePK)) {
            return false;
        }
        EcrirePK other = (EcrirePK) object;
        if (this.auteurId != other.auteurId) {
            return false;
        }
        if (this.livreId != other.livreId) {
            return false;
        }
        if ((this.livreIsbn == null && other.livreIsbn != null) || (this.livreIsbn != null && !this.livreIsbn.equals(other.livreIsbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "librairie.EcrirePK[ auteurId=" + auteurId + ", livreId=" + livreId + ", livreIsbn=" + livreIsbn + " ]";
    }
    
}
