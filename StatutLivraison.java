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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "STATUT_LIVRAISON")
@NamedQueries({
    @NamedQuery(name = "StatutLivraison.findAll", query = "SELECT s FROM StatutLivraison s"),
    @NamedQuery(name = "StatutLivraison.findByCmdeId", query = "SELECT s FROM StatutLivraison s WHERE s.statutLivraisonPK.cmdeId = :cmdeId"),
    @NamedQuery(name = "StatutLivraison.findByLivrId", query = "SELECT s FROM StatutLivraison s WHERE s.statutLivraisonPK.livrId = :livrId"),
    @NamedQuery(name = "StatutLivraison.findByStatLivrDate", query = "SELECT s FROM StatutLivraison s WHERE s.statLivrDate = :statLivrDate"),
    @NamedQuery(name = "StatutLivraison.findByStatLivrDelai", query = "SELECT s FROM StatutLivraison s WHERE s.statLivrDelai = :statLivrDelai"),
    @NamedQuery(name = "StatutLivraison.findByStatLivrStat", query = "SELECT s FROM StatutLivraison s WHERE s.statLivrStat = :statLivrStat")})
public class StatutLivraison implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StatutLivraisonPK statutLivraisonPK;
    @Basic(optional = false)
    @Column(name = "STAT_LIVR_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statLivrDate;
    @Basic(optional = false)
    @Column(name = "STAT_LIVR_DELAI")
    private String statLivrDelai;
    @Basic(optional = false)
    @Column(name = "STAT_LIVR_STAT")
    private String statLivrStat;

    public StatutLivraison() {
    }

    public StatutLivraison(StatutLivraisonPK statutLivraisonPK) {
        this.statutLivraisonPK = statutLivraisonPK;
    }

    public StatutLivraison(StatutLivraisonPK statutLivraisonPK, Date statLivrDate, String statLivrDelai, String statLivrStat) {
        this.statutLivraisonPK = statutLivraisonPK;
        this.statLivrDate = statLivrDate;
        this.statLivrDelai = statLivrDelai;
        this.statLivrStat = statLivrStat;
    }

    public StatutLivraison(long cmdeId, long livrId) {
        this.statutLivraisonPK = new StatutLivraisonPK(cmdeId, livrId);
    }

    public StatutLivraisonPK getStatutLivraisonPK() {
        return statutLivraisonPK;
    }

    public void setStatutLivraisonPK(StatutLivraisonPK statutLivraisonPK) {
        this.statutLivraisonPK = statutLivraisonPK;
    }

    public Date getStatLivrDate() {
        return statLivrDate;
    }

    public void setStatLivrDate(Date statLivrDate) {
        this.statLivrDate = statLivrDate;
    }

    public String getStatLivrDelai() {
        return statLivrDelai;
    }

    public void setStatLivrDelai(String statLivrDelai) {
        this.statLivrDelai = statLivrDelai;
    }

    public String getStatLivrStat() {
        return statLivrStat;
    }

    public void setStatLivrStat(String statLivrStat) {
        this.statLivrStat = statLivrStat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (statutLivraisonPK != null ? statutLivraisonPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StatutLivraison)) {
            return false;
        }
        StatutLivraison other = (StatutLivraison) object;
        if ((this.statutLivraisonPK == null && other.statutLivraisonPK != null) || (this.statutLivraisonPK != null && !this.statutLivraisonPK.equals(other.statutLivraisonPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "librairie.StatutLivraison[ statutLivraisonPK=" + statutLivraisonPK + " ]";
    }
    
}
