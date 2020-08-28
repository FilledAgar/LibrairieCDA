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
@Table(name = "AUTEUR")
@NamedQueries({
    @NamedQuery(name = "Auteur.findAll", query = "SELECT a FROM Auteur a"),
    @NamedQuery(name = "Auteur.findByAuteurId", query = "SELECT a FROM Auteur a WHERE a.auteurId = :auteurId"),
    @NamedQuery(name = "Auteur.findByAuteurNom", query = "SELECT a FROM Auteur a WHERE a.auteurNom = :auteurNom"),
    @NamedQuery(name = "Auteur.findByAuteurPrenom", query = "SELECT a FROM Auteur a WHERE a.auteurPrenom = :auteurPrenom"),
    @NamedQuery(name = "Auteur.findByAuteurNationalite", query = "SELECT a FROM Auteur a WHERE a.auteurNationalite = :auteurNationalite"),
    @NamedQuery(name = "Auteur.findByAuteurComment", query = "SELECT a FROM Auteur a WHERE a.auteurComment = :auteurComment")})
public class Auteur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AUTEUR_ID")
    private Long auteurId;
    @Basic(optional = false)
    @Column(name = "AUTEUR_NOM")
    private String auteurNom;
    @Column(name = "AUTEUR_PRENOM")
    private String auteurPrenom;
    @Column(name = "AUTEUR_NATIONALITE")
    private String auteurNationalite;
    @Column(name = "AUTEUR_COMMENT")
    private String auteurComment;

    public Auteur() {
    }

    public Auteur(Long auteurId) {
        this.auteurId = auteurId;
    }

    public Auteur(Long auteurId, String auteurNom, String auteurPrenom) {
        this.auteurId = auteurId;
        this.auteurNom = auteurNom;
        this.auteurPrenom = auteurPrenom;
    }

    public Auteur(Long auteurId, String auteurNom, String auteurPrenom, String auteurNationalite) {
        this.auteurId = auteurId;
        this.auteurNom = auteurNom;
        this.auteurPrenom = auteurPrenom;
        this.auteurNationalite = auteurNationalite;
    }
     
    public Auteur(Long auteurId, String auteurNom, String auteurPrenom, String auteurNationalite, String auteurComment) {
        this.auteurId = auteurId;
        this.auteurNom = auteurNom;
        this.auteurPrenom = auteurPrenom;
        this.auteurNationalite = auteurNationalite;
        this.auteurComment = auteurComment;
    }
    
    public Long getAuteurId() {
        return auteurId;
    }//Faire méthode récup Id


    public String getAuteurNom() {
        return auteurNom;
    }

    public void setAuteurNom(String auteurNom) {
        this.auteurNom = auteurNom;
    }

    public String getAuteurPrenom() {
        return auteurPrenom;
    }

    public void setAuteurPrenom(String auteurPrenom) {
        this.auteurPrenom = auteurPrenom;
    }

    public String getAuteurNationalite() {
        return auteurNationalite;
    }

    public void setAuteurNationalite(String auteurNationalite) {
        this.auteurNationalite = auteurNationalite;
    }

    public String getAuteurComment() {
        return auteurComment;
    }

    public void setAuteurComment(String auteurComment) {
        this.auteurComment = auteurComment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (auteurId != null ? auteurId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auteur)) {
            return false;
        }
        Auteur other = (Auteur) object;
        if ((this.auteurId == null && other.auteurId != null) || (this.auteurId != null && !this.auteurId.equals(other.auteurId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        
        String str; 
        str = auteurNom + " " + auteurPrenom; 
        str += (auteurNationalite != null) ? auteurNationalite : " "; 
        str += (auteurComment != null) ? auteurComment : " "; 
        
        return str;
    }
    
}
