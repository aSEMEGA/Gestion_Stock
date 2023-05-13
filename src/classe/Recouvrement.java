/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author Chadowaker
 */
public class Recouvrement {
    
    String Designation;
    int metre;
    
    public Recouvrement(){
        
    }
    
    public Recouvrement(String Designation,int metre){
        this.Designation = Designation;
        this.metre = metre;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public int getMetre() {
        return metre;
    }

    public void setMetre(int metre) {
        this.metre = metre;
    }
    
    
}
