/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author Chadowaker
 */
public class Caisse {
    
    String designation;
    int metre_vendu;
    int prix_total;
    int prix;
    
    public Caisse(){
        
    }
    public Caisse( String designation,int metre_vendu,int prix,int prix_total){
        this.designation = designation;
        this.metre_vendu = metre_vendu;
        this.prix_total = prix_total;
        this.prix =  prix;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getMetre_vendu() {
        return metre_vendu;
    }

    public void setMetre_vendu(int metre_vendu) {
        this.metre_vendu = metre_vendu;
    }

    public int getPrix_total() {
        return prix_total;
    }

    public void setPrix_total(int prix_total) {
        this.prix_total = prix_total;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
    
    
}
