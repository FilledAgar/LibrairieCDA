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
@Table(name = "COMMANDE")
@NamedQueries({
    @NamedQuery(name = "Commande.findAll", query = "SELECT c FROM Commande c"),
    @NamedQuery(name = "Commande.findByCmdeId", query = "SELECT c FROM Commande c WHERE c.cmdeId = :cmdeId"),
    @NamedQuery(name = "Commande.findByClientId", query = "SELECT c FROM Commande c WHERE c.clientId = :clientId"),
    @NamedQuery(name = "Commande.findByAdrId", query = "SELECT c FROM Commande c WHERE c.adrId = :adrId"),
    @NamedQuery(name = "Commande.findByAdrAdrId", query = "SELECT c FROM Commande c WHERE c.adrAdrId = :adrAdrId"),
    @NamedQuery(name = "Commande.findByOffrTranspId", query = "SELECT c FROM Commande c WHERE c.offrTranspId = :offrTranspId"),
    @NamedQuery(name = "Commande.findByStatutId", query = "SELECT c FROM Commande c WHERE c.statutId = :statutId"),
    @NamedQuery(name = "Commande.findByTypeCarteId", query = "SELECT c FROM Commande c WHERE c.typeCarteId = :typeCarteId"),
    @NamedQuery(name = "Commande.findByCmdeDate", query = "SELECT c FROM Commande c WHERE c.cmdeDate = :cmdeDate"),
    @NamedQuery(name = "Commande.findByCmdeDelai", query = "SELECT c FROM Commande c WHERE c.cmdeDelai = :cmdeDelai"),
    @NamedQuery(name = "Commande.findByCmdeCdtsLivr", query = "SELECT c FROM Commande c WHERE c.cmdeCdtsLivr = :cmdeCdtsLivr"),
    @NamedQuery(name = "Commande.findByCmdeIp", query = "SELECT c FROM Commande c WHERE c.cmdeIp = :cmdeIp"),
    @NamedQuery(name = "Commande.findByIdTransaction", query = "SELECT c FROM Commande c WHERE c.idTransaction = :idTransaction"),
    @NamedQuery(name = "Commande.findByPayerDate", query = "SELECT c FROM Commande c WHERE c.payerDate = :payerDate")})
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CMDE_ID")
    private Long cmdeId;
    @Basic(optional = false)
    @Column(name = "CLIENT_ID")
    private long clientId;
    @Basic(optional = false)
    @Column(name = "ADR_ID")
    private long adrId;
    @Basic(optional = false)
    @Column(name = "ADR_ADR_ID")
    private long adrAdrId;
    @Basic(optional = false)
    @Column(name = "OFFR_TRANSP_ID")
    private long offrTranspId;
    @Basic(optional = false)
    @Column(name = "STATUT_ID")
    private long statutId;
    @Basic(optional = false)
    @Column(name = "TYPE_CARTE_ID")
    private long typeCarteId;
    @Basic(optional = false)
    @Column(name = "CMDE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmdeDate;
    @Basic(optional = false)
    @Column(name = "CMDE_DELAI")
    private String cmdeDelai;
    @Basic(optional = false)
    @Column(name = "CMDE_CDTS_LIVR")
    private String cmdeCdtsLivr;
    @Basic(optional = false)
    @Column(name = "CMDE_IP")
    private String cmdeIp;
    @Basic(optional = false)
    @Column(name = "ID_TRANSACTION")
    private String idTransaction;
    @Basic(optional = false)
    @Column(name = "PAYER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date payerDate;

    public Commande() {
    }

    public Commande(Long cmdeId) {
        this.cmdeId = cmdeId;
    }

    public Commande(Long cmdeId, long clientId, long adrId, long adrAdrId, long offrTranspId, long statutId, long typeCarteId, Date cmdeDate, String cmdeDelai, String cmdeCdtsLivr, String cmdeIp, String idTransaction, Date payerDate) {
        this.cmdeId = cmdeId;
        this.clientId = clientId;
        this.adrId = adrId;
        this.adrAdrId = adrAdrId;
        this.offrTranspId = offrTranspId;
        this.statutId = statutId;
        this.typeCarteId = typeCarteId;
        this.cmdeDate = cmdeDate;
        this.cmdeDelai = cmdeDelai;
        this.cmdeCdtsLivr = cmdeCdtsLivr;
        this.cmdeIp = cmdeIp;
        this.idTransaction = idTransaction;
        this.payerDate = payerDate;
    }

    public Long getCmdeId() {
        return cmdeId;
    }

    public void setCmdeId(Long cmdeId) {
        this.cmdeId = cmdeId;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public long getAdrId() {
        return adrId;
    }

    public void setAdrId(long adrId) {
        this.adrId = adrId;
    }

    public long getAdrAdrId() {
        return adrAdrId;
    }

    public void setAdrAdrId(long adrAdrId) {
        this.adrAdrId = adrAdrId;
    }

    public long getOffrTranspId() {
        return offrTranspId;
    }

    public void setOffrTranspId(long offrTranspId) {
        this.offrTranspId = offrTranspId;
    }

    public long getStatutId() {
        return statutId;
    }

    public void setStatutId(long statutId) {
        this.statutId = statutId;
    }

    public long getTypeCarteId() {
        return typeCarteId;
    }

    public void setTypeCarteId(long typeCarteId) {
        this.typeCarteId = typeCarteId;
    }

    public Date getCmdeDate() {
        return cmdeDate;
    }

    public void setCmdeDate(Date cmdeDate) {
        this.cmdeDate = cmdeDate;
    }

    public String getCmdeDelai() {
        return cmdeDelai;
    }

    public void setCmdeDelai(String cmdeDelai) {
        this.cmdeDelai = cmdeDelai;
    }

    public String getCmdeCdtsLivr() {
        return cmdeCdtsLivr;
    }

    public void setCmdeCdtsLivr(String cmdeCdtsLivr) {
        this.cmdeCdtsLivr = cmdeCdtsLivr;
    }

    public String getCmdeIp() {
        return cmdeIp;
    }

    public void setCmdeIp(String cmdeIp) {
        this.cmdeIp = cmdeIp;
    }

    public String getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(String idTransaction) {
        this.idTransaction = idTransaction;
    }

    public Date getPayerDate() {
        return payerDate;
    }

    public void setPayerDate(Date payerDate) {
        this.payerDate = payerDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cmdeId != null ? cmdeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.cmdeId == null && other.cmdeId != null) || (this.cmdeId != null && !this.cmdeId.equals(other.cmdeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "librairie.Commande[ cmdeId=" + cmdeId + " ]";
    }
    
}
