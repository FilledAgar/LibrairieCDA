/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librairie;

import java.io.Serializable;
import java.util.ArrayList;
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
@Table(name = "CATEGORIE")
@NamedQueries({
    @NamedQuery(name = "Categorie.findAll", query = "SELECT c FROM Categorie c"),
    @NamedQuery(name = "Categorie.findByCategId", query = "SELECT c FROM Categorie c WHERE c.categId = :categId"),
    @NamedQuery(name = "Categorie.findByCategNom", query = "SELECT c FROM Categorie c WHERE c.categNom = :categNom")})


public class Categorie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CATEG_ID")
    private Long categId;
    @Basic(optional = false)
    @Column(name = "CATEG_NOM")
    private String categNom;
    private ArrayList<Categorie> desCategories;



    public Categorie( String categNom) {
        this.categId = categId;
        this.categNom = categNom;
    }

    public Long getCategId() {
        return categId;
    }//A Définir

    public String listeCat(){
    String cat = ""; 
    
        for (Categorie one : desCategories){
          cat += one.toString() + "\n"; 
       
    }return cat; 
    }
    
    public void ajoutCat(Categorie name){
        desCategories = new ArrayList<>(); 
        desCategories.add(name);
    }
    
    public String getCategNom() {
        return categNom;
    }

    public void setCategNom(String categNom) {
        this.categNom = categNom;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categId != null ? categId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorie)) {
            return false;
        }
        Categorie other = (Categorie) object;
        if ((this.categId == null && other.categId != null) || (this.categId != null && !this.categId.equals(other.categId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return categNom;
    }
    
}
