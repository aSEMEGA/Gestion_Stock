/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classe.Vente;
//import form.Caisse;
import classe.Caisse;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chadowaker
 */
public class CaisseDao {
    public Connection connect = connectdb.getInstance();
     public List<Caisse> liste() {
        List<Caisse> Caisse_list = new ArrayList<>();
        Caisse c = new Caisse();
         try {
            ResultSet rs = connect.createStatement().executeQuery("select designation,sum(maitre) as metre,prix_vente,prix_vente*maitre as total  from vente group by code_produit");
            while(rs.next()){
                c.setDesignation(rs.getString("designation"));
                 c.setMetre_vendu(rs.getInt("metre"));
                 c.setPrix(rs.getInt("prix_vente"));
                c. setPrix_total(rs.getInt("total"));
                Caisse_list.add(c);
                c = new Caisse();
            }
        } catch (SQLException ex) {
            Logger.getLogger(VenteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Caisse_list;
    }
    
}
