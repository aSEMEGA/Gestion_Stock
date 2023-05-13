/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classe.Caisse;
import classe.Recouvrement;
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
public class RecouvrementDao {
    
     public Connection connect = connectdb.getInstance();
     public List<Recouvrement> liste() {
        List<Recouvrement> Recouvrement_list = new ArrayList<>();
       Recouvrement r = new Recouvrement();
         try {
            ResultSet rs = connect.createStatement().executeQuery("select designation,sum(maitre) as metre  from vente group by code_produit");
            while(rs.next()){
                r.setDesignation(rs.getString("designation"));
                 r.setMetre(rs.getInt("metre"));
               
                Recouvrement_list.add(r);
                r = new Recouvrement();
            }
        } catch (SQLException ex) {
            Logger.getLogger(VenteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Recouvrement_list;
}
}
