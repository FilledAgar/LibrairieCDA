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
@Table(name = "ADRESSE")
@NamedQueries({
    @NamedQuery(name = "Adresse.findAll", query = "SELECT a FROM Adresse a"),
    @NamedQuery(name = "Adresse.findByAdrId", query = "SELECT a FROM Adresse a WHERE a.adrId = :adrId"),
    @NamedQuery(name = "Adresse.findByAdrNom", query = "SELECT a FROM Adresse a WHERE a.adrNom = :adrNom"),
    @NamedQuery(name = "Adresse.findByAdrPrenom", query = "SELECT a FROM Adresse a WHERE a.adrPrenom = :adrPrenom"),
    @NamedQuery(name = "Adresse.findByAdrVoie1", query = "SELECT a FROM Adresse a WHERE a.adrVoie1 = :adrVoie1"),
    @NamedQuery(name = "Adresse.findByAdrVoie2", query = "SELECT a FROM Adresse a WHERE a.adrVoie2 = :adrVoie2"),
    @NamedQuery(name = "Adresse.findByAdrCp", query = "SELECT a FROM Adresse a WHERE a.adrCp = :adrCp"),
    @NamedQuery(name = "Adresse.findByAdrVille", query = "SELECT a FROM Adresse a WHERE a.adrVille = :adrVille"),
    @NamedQuery(name = "Adresse.findByAdrTel", query = "SELECT a FROM Adresse a WHERE a.adrTel = :adrTel"),
    @NamedQuery(name = "Adresse.findByAdrMob", query = "SELECT a FROM Adresse a WHERE a.adrMob = :adrMob")})
public class Adresse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ADR_ID")
    private Long adrId;
    @Column(name = "ADR_NOM")
    private String adrNom;
    @Column(name = "ADR_PRENOM")
    private String adrPrenom;
    @Basic(optional = false)
    @Column(name = "ADR_VOIE1")
    private String adrVoie1;
    @Column(name = "ADR_VOIE2")
    private String adrVoie2;
    @Basic(optional = false)
    @Column(name = "ADR_CP")
    private int adrCp;
    @Basic(optional = false)
    @Column(name = "ADR_VILLE")
    private String adrVille;
    @Column(name = "ADR_TEL")
    private Long adrTel;
    @Column(name = "ADR_MOB")
    private Long adrMob;

    public Adresse() {
    }

    public Adresse(Long adrId) {
        this.adrId = adrId;
    }

    public Adresse(String adrNom, String adrPrenom, String adrVoie1, int adrCp, String adrVille) {
        this.adrId = adrId;
        this.adrNom = adrNom;
        this.adrPrenom = adrPrenom;
        this.adrVoie1 = adrVoie1;
        this.adrCp = adrCp;
        this.adrVille = adrVille;
    }
    
    public Adresse(String adrNom, String adrPrenom, String adrVoie1, String adrVoie2, int adrCp, String adrVille) {
        this.adrId = adrId;
        this.adrNom = adrNom;
        this.adrPrenom = adrPrenom;
        this.adrVoie1 = adrVoie1;
        this.adrVoie2 = adrVoie2;
        this.adrCp = adrCp;
        this.adrVille = adrVille;
    }
    
    public Adresse(String adrNom, String adrPrenom, String adrVoie1, String adrVoie2, int adrCp, String adrVille, Long adrTel, Long adrMob) {
        this.adrNom = adrNom;
        this.adrPrenom = adrPrenom;
        this.adrVoie1 = adrVoie1;
        this.adrVoie2 = adrVoie2;
        this.adrCp = adrCp;
        this.adrVille = adrVille;
        this.adrTel = adrTel;
    }
    
     public Adresse(String adrNom, String adrPrenom, String adrVoie1, String adrVoie2, int adrCp, String adrVille, Long adrTel) {
        this.adrNom = adrNom;
        this.adrPrenom = adrPrenom;
        this.adrVoie1 = adrVoie1;
        this.adrVoie2 = adrVoie2;
        this.adrCp = adrCp;
        this.adrVille = adrVille;
        this.adrTel = adrTel;
        this.adrMob = adrMob;
    }

    
    
    public int getAdrCp() {
        return adrCp;
    }

    public void setAdrCp(int adrCp) {
        this.adrCp = adrCp;
    }

    public Long getAdrId() {
        return adrId;
    }//Faire une méthode connexion BDD pour récuperer l'ID

    public String getAdrNom() {
        return adrNom;
    }

    public void setAdrNom(String adrNom) {
        this.adrNom = adrNom;
    }

    public String getAdrPrenom() {
        return adrPrenom;
    }

    public void setAdrPrenom(String adrPrenom) {
        this.adrPrenom = adrPrenom;
    }

    public String getAdrVoie1() {
        return adrVoie1;
    }

    public void setAdrVoie1(String adrVoie1) {
        this.adrVoie1 = adrVoie1;
    }

    public String getAdrVoie2() {
        return adrVoie2;
    }

    public void setAdrVoie2(String adrVoie2) {
        this.adrVoie2 = adrVoie2;
    }

   
    public String getAdrVille() {
        return adrVille;
    }

    public void setAdrVille(String adrVille) {
        this.adrVille = adrVille;
    }

    public Long getAdrTel() {
        return adrTel;
    }

    public void setAdrTel(Long adrTel) {
        this.adrTel = adrTel;
    }

    public Long getAdrMob() {
        return adrMob;
    }

    public void setAdrMob(Long adrMob) {
        this.adrMob = adrMob;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adrId != null ? adrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adresse)) {
            return false;
        }
        Adresse other = (Adresse) object;
        if ((this.adrId == null && other.adrId != null) || (this.adrId != null && !this.adrId.equals(other.adrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String str; 
        str = adrNom + " " + adrPrenom +" " + adrVoie1; 
        str+=  (adrVoie2 != null) ? adrVoie2 : " ";
        str +=  " " + adrVille + " "; 
        str+=  (adrTel != null) ? adrTel : " ";
        str+=  (adrMob != null) ? adrMob : " ";
        
        return str;
    }
    
}
