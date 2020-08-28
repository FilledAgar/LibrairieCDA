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
@Table(name = "STATUT")
@NamedQueries({
    @NamedQuery(name = "Statut.findAll", query = "SELECT s FROM Statut s"),
    @NamedQuery(name = "Statut.findByStatutId", query = "SELECT s FROM Statut s WHERE s.statutId = :statutId"),
    @NamedQuery(name = "Statut.findByStatutNom", query = "SELECT s FROM Statut s WHERE s.statutNom = :statutNom"),
    @NamedQuery(name = "Statut.findByStatutTxt", query = "SELECT s FROM Statut s WHERE s.statutTxt = :statutTxt")})
public class Statut implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STATUT_ID")
    private Long statutId;
    @Basic(optional = false)
    @Column(name = "STATUT_NOM")
    private String statutNom;
    @Basic(optional = false)
    @Column(name = "STATUT_TXT")
    private String statutTxt;

    public Statut() {
    }

    public Statut(Long statutId) {
        this.statutId = statutId;
    }

    public Statut(Long statutId, String statutNom, String statutTxt) {
        this.statutId = statutId;
        this.statutNom = statutNom;
        this.statutTxt = statutTxt;
    }

    public Long getStatutId() {
        return statutId;
    }

    public void setStatutId(Long statutId) {
        this.statutId = statutId;
    }

    public String getStatutNom() {
        return statutNom;
    }

    public void setStatutNom(String statutNom) {
        this.statutNom = statutNom;
    }

    public String getStatutTxt() {
        return statutTxt;
    }

    public void setStatutTxt(String statutTxt) {
        this.statutTxt = statutTxt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (statutId != null ? statutId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Statut)) {
            return false;
        }
        Statut other = (Statut) object;
        if ((this.statutId == null && other.statutId != null) || (this.statutId != null && !this.statutId.equals(other.statutId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "librairie.Statut[ statutId=" + statutId + " ]";
    }
    
}
