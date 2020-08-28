/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librairie;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author cda611
 */
@Entity
@Table(name = "LIVRE")
@NamedQueries({
    @NamedQuery(name = "Livre.findAll", query = "SELECT l FROM Livre l"),
    @NamedQuery(name = "Livre.findByLivreId", query = "SELECT l FROM Livre l WHERE l.livrePK.livreId = :livreId"),
    @NamedQuery(name = "Livre.findByLivreIsbn", query = "SELECT l FROM Livre l WHERE l.livrePK.livreIsbn = :livreIsbn"),
    @NamedQuery(name = "Livre.findByEditeurId", query = "SELECT l FROM Livre l WHERE l.editeurId = :editeurId"),
    @NamedQuery(name = "Livre.findByLivreTitre", query = "SELECT l FROM Livre l WHERE l.livreTitre = :livreTitre"),
    @NamedQuery(name = "Livre.findByLivreSsTitre", query = "SELECT l FROM Livre l WHERE l.livreSsTitre = :livreSsTitre"),
    @NamedQuery(name = "Livre.findByLivrePrixHt", query = "SELECT l FROM Livre l WHERE l.livrePrixHt = :livrePrixHt"),
    @NamedQuery(name = "Livre.findByLivreCouvUrl", query = "SELECT l FROM Livre l WHERE l.livreCouvUrl = :livreCouvUrl"),
    @NamedQuery(name = "Livre.findByLivreResume", query = "SELECT l FROM Livre l WHERE l.livreResume = :livreResume"),
    @NamedQuery(name = "Livre.findByLivreStock", query = "SELECT l FROM Livre l WHERE l.livreStock = :livreStock")})
public class Livre implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LivrePK livrePK;
    @Basic(optional = false)
    @Column(name = "EDITEUR_ID")
    private long editeurId;
    @Basic(optional = false)
    @Column(name = "LIVRE_TITRE")
    private String livreTitre;
    @Column(name = "LIVRE_SS_TITRE")
    private String livreSsTitre;
    @Basic(optional = false)
    @Column(name = "LIVRE_PRIX_HT")
    private double livrePrixHt;
    @Basic(optional = false)
    @Column(name = "LIVRE_COUV_URL")
    private String livreCouvUrl;
    @Column(name = "LIVRE_RESUME")
    private String livreResume;
    @Basic(optional = false)
    @Column(name = "LIVRE_STOCK")
    private int livreStock;
    private Auteur auteur; 

   

    public Livre() {
    }

    public Livre(LivrePK livrePK) {
        this.livrePK = livrePK;
    }

    public Livre(LivrePK livrePK, long editeurId, String livreTitre, double livrePrixHt, String livreCouvUrl, int livreStock) {
        this.livrePK = livrePK;
        this.editeurId = editeurId;
        this.livreTitre = livreTitre;
        this.livrePrixHt = livrePrixHt;
        this.livreCouvUrl = livreCouvUrl;
        this.livreStock = livreStock;
    }

    public Livre(int livreId, String livreIsbn) {
        this.livrePK = new LivrePK(livreId, livreIsbn);
    }

     public Auteur getAuteur() {
        return auteur;
    }//Créer méthode pour récuperer Auteur 
     
    public LivrePK getLivrePK() {
        return livrePK;
    }

    public void setLivrePK(LivrePK livrePK) {
        this.livrePK = livrePK;
    }

    public long getEditeurId() {
        return editeurId;
    }

    public void setEditeurId(long editeurId) {
        this.editeurId = editeurId;
    }

    public String getLivreTitre() {
        return livreTitre;
    }

    public void setLivreTitre(String livreTitre) {
        this.livreTitre = livreTitre;
    }

    public String getLivreSsTitre() {
        return livreSsTitre;
    }

    public void setLivreSsTitre(String livreSsTitre) {
        this.livreSsTitre = livreSsTitre;
    }

    public double getLivrePrixHt() {
        return livrePrixHt;
    }

    public void setLivrePrixHt(double livrePrixHt) {
        this.livrePrixHt = livrePrixHt;
    }

    public String getLivreCouvUrl() {
        return livreCouvUrl;
    }

    public void setLivreCouvUrl(String livreCouvUrl) {
        this.livreCouvUrl = livreCouvUrl;
    }

    public String getLivreResume() {
        return livreResume;
    }

    public void setLivreResume(String livreResume) {
        this.livreResume = livreResume;
    }

    public int getLivreStock() {
        return livreStock;
    }

    public void setLivreStock(int livreStock) {
        this.livreStock = livreStock;
    }
    
    public boolean checkISBN(String isbn){
           
        int n = isbn.length(); 
        if (n != 10) 
            return false; 
  
        int sum = 0; 
        for (int i = 0; i < 9; i++)  
        { 
            int digit = isbn.charAt(i) - '0'; 
            if (0 > digit || 9 < digit) 
                return false; 
            sum += (digit * (10 - i)); 
        } 
  
        
        char last = isbn.charAt(9); 
        if (last != 'X' && (last < '0' ||  
                            last > '9')) 
            return false; 
  
  
        sum += ((last == 'X') ? 10 : (last - '0')); 
  
        
        return (sum % 11 == 0); 
    } 
  

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (livrePK != null ? livrePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livre)) {
            return false;
        }
        Livre other = (Livre) object;
        if ((this.livrePK == null && other.livrePK != null) || (this.livrePK != null && !this.livrePK.equals(other.livrePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "librairie.Livre[ livrePK=" + livrePK + " ]";
    }
    
}
