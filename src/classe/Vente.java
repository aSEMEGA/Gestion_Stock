/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author Chadowaker
 */
public class Vente {
    private int id;
    private String code_produit;
    private String designation;
    private String prix_vente;
    private String stock_sortie;
    private String maitre;
    
    
    public Vente(){
        
    }
    
    
     public Vente(int id, String code_produit, String designation, String prix_vente, String stock_sortie,String maitre){
         this.code_produit = code_produit;
         this.designation = designation;
         this.prix_vente = prix_vente;
         this.stock_sortie = stock_sortie;
        this.maitre =  maitre;
    }
     
     public Vente(String code_produit,String designation, String prix_vente, String stock_sortie,String maitre){
         this.code_produit = code_produit;
         this.designation = designation;
         this.prix_vente = prix_vente;
         this.stock_sortie = stock_sortie;
        this.maitre =  maitre;
    }

    public String getMaitre() {
        return maitre;
    }

    public void setMaitre(String maitre) {
        this.maitre = maitre;
    }

    public String getCode_produit() {
        return code_produit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public void setCode_produit(String code_produit) {
        this.code_produit = code_produit;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPrix_vente() {
        return prix_vente;
    }

    public void setPrix_vente(String prix_vente) {
        this.prix_vente = prix_vente;
    }

    public String getStock_sortie() {
        return stock_sortie;
    }

    public void setStock_sortie(String stock_sortie) {
        this.stock_sortie = stock_sortie;
    }
     
     
    
    
}
