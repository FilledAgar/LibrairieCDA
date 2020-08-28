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
@Table(name = "COMMENTAIRE")
@NamedQueries({
    @NamedQuery(name = "Commentaire.findAll", query = "SELECT c FROM Commentaire c"),
    @NamedQuery(name = "Commentaire.findByCommId", query = "SELECT c FROM Commentaire c WHERE c.commId = :commId"),
    @NamedQuery(name = "Commentaire.findByLigneCmdeId", query = "SELECT c FROM Commentaire c WHERE c.ligneCmdeId = :ligneCmdeId"),
    @NamedQuery(name = "Commentaire.findByLivreId", query = "SELECT c FROM Commentaire c WHERE c.livreId = :livreId"),
    @NamedQuery(name = "Commentaire.findByLivreIsbn", query = "SELECT c FROM Commentaire c WHERE c.livreIsbn = :livreIsbn"),
    @NamedQuery(name = "Commentaire.findByCommTitre", query = "SELECT c FROM Commentaire c WHERE c.commTitre = :commTitre"),
    @NamedQuery(name = "Commentaire.findByCommNote", query = "SELECT c FROM Commentaire c WHERE c.commNote = :commNote"),
    @NamedQuery(name = "Commentaire.findByCommTxt", query = "SELECT c FROM Commentaire c WHERE c.commTxt = :commTxt"),
    @NamedQuery(name = "Commentaire.findByCommDate", query = "SELECT c FROM Commentaire c WHERE c.commDate = :commDate")})
public class Commentaire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COMM_ID")
    private Long commId;
    @Basic(optional = false)
    @Column(name = "LIGNE_CMDE_ID")
    private long ligneCmdeId;
    @Basic(optional = false)
    @Column(name = "LIVRE_ID")
    private int livreId;
    @Basic(optional = false)
    @Column(name = "LIVRE_ISBN")
    private String livreIsbn;
    @Basic(optional = false)
    @Column(name = "COMM_TITRE")
    private String commTitre;
    @Basic(optional = false)
    @Column(name = "COMM_NOTE")
    private short commNote;
    @Basic(optional = false)
    @Column(name = "COMM_TXT")
    private String commTxt;
    @Basic(optional = false)
    @Column(name = "COMM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date commDate;

    public Commentaire() {
    }

    public Commentaire(Long commId) {
        this.commId = commId;
    }

    public Commentaire(String commTitre, short commNote, String commTxt, Date commDate) {
        this.commId = commId;
        this.ligneCmdeId = ligneCmdeId;
        this.livreId = livreId;
        this.livreIsbn = livreIsbn;
        this.commTitre = commTitre;
        this.commNote = commNote;
        this.commTxt = commTxt;
        this.commDate = commDate;
    }

    public Long getCommId() {
        return commId;
    }

    public void setCommId(Long commId) {
        this.commId = commId;
    }

    public long getLigneCmdeId() {
        return ligneCmdeId;
    }

    public void setLigneCmdeId(long ligneCmdeId) {
        this.ligneCmdeId = ligneCmdeId;
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

    public String getCommTitre() {
        return commTitre;
    }

    public void setCommTitre(String commTitre) {
        this.commTitre = commTitre;
    }

    public short getCommNote() {
        return commNote;
    }

    public void setCommNote(short commNote) {
        this.commNote = commNote;
    }

    public String getCommTxt() {
        return commTxt;
    }

    public void setCommTxt(String commTxt) {
        this.commTxt = commTxt;
    }

    public Date getCommDate() {
        return commDate;
    }

    public void setCommDate(Date commDate) {
        this.commDate = commDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (commId != null ? commId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commentaire)) {
            return false;
        }
        Commentaire other = (Commentaire) object;
        if ((this.commId == null && other.commId != null) || (this.commId != null && !this.commId.equals(other.commId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return commTitre + "\n\t\t\t\n" + commTxt + "\nLa note est : " + commNote + " ";
    }
    
}
