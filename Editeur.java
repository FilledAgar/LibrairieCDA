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
@Table(name = "EDITEUR")
@NamedQueries({
    @NamedQuery(name = "Editeur.findAll", query = "SELECT e FROM Editeur e"),
    @NamedQuery(name = "Editeur.findByEditeurId", query = "SELECT e FROM Editeur e WHERE e.editeurId = :editeurId"),
    @NamedQuery(name = "Editeur.findByEditeurNom", query = "SELECT e FROM Editeur e WHERE e.editeurNom = :editeurNom"),
    @NamedQuery(name = "Editeur.findByEditeurAdresse", query = "SELECT e FROM Editeur e WHERE e.editeurAdresse = :editeurAdresse")})
public class Editeur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EDITEUR_ID")
    private Long editeurId;
    @Basic(optional = false)
    @Column(name = "EDITEUR_NOM")
    private String editeurNom;
    @Column(name = "EDITEUR_ADRESSE")
    private String editeurAdresse;

   

    public Editeur() {
        this.editeurId = editeurId;
    }

    public Editeur(Long editeurId, String editeurNom) {
        this.editeurId = editeurId;
        this.editeurNom = editeurNom;
    }
    
     public Editeur(Long editeurId, String editeurNom, String editeurAdresse) {
        this.editeurId = editeurId;
        this.editeurNom = editeurNom;
        this.editeurAdresse = editeurAdresse;
    }

    public Long getEditeurId() {
        return editeurId;
    }

    public void setEditeurId(Long editeurId) {
        this.editeurId = editeurId;
    }

    public String getEditeurNom() {
        return editeurNom;
    }

    public void setEditeurNom(String editeurNom) {
        this.editeurNom = editeurNom;
    }

    public String getEditeurAdresse() {
        return editeurAdresse;
    }

    public void setEditeurAdresse(String editeurAdresse) {
        this.editeurAdresse = editeurAdresse;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (editeurId != null ? editeurId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Editeur)) {
            return false;
        }
        Editeur other = (Editeur) object;
        if ((this.editeurId == null && other.editeurId != null) || (this.editeurId != null && !this.editeurId.equals(other.editeurId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String str; 
        
        str = editeurNom + " "; 
        str += (editeurNom != null) ? editeurNom : "";
        return str;
    }
    
}
