/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author Chadowaker
 */
public class Produit {
    private String code_produit;
    private String designation;
    private String prix;
    private String stock;
    int id;
    
    
    public Produit(){
        
    }
    
    
     public Produit(int id,String code_produit, String designation, String prix, String stock){
         this.id = id;
         this.code_produit = code_produit;
         this.designation = designation;
         this.prix = prix;
         this.stock = stock;
        
    }
     
     public Produit(String code_produit,String designation, String prix, String stock){
         this.code_produit = code_produit;
         this.designation = designation;
         this.prix = prix;
         this.stock = stock;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

     
    public String getCode_produit() {
        return code_produit;
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

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
     
     
}
