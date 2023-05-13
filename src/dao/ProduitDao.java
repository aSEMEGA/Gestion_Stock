/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classe.Produit;
import java.sql.PreparedStatement;
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
public class ProduitDao extends Doa<Produit>{

    @Override
    public Produit recherche(int id) {
         Produit p = new Produit();
        try {
          
            ResultSet rs = this.connect.createStatement().executeQuery("select* from article where id = "+id);
            if(rs.next()){
                p.setId(rs.getInt("id"));
                p.setCode_produit(rs.getString("code_produit"));
                p.setDesignation(rs.getString("designation"));
                p.setPrix(rs.getString("prix"));
                p.setStock(rs.getString("stock"));
               
           
         }
           
        } catch (SQLException ex) {
            Logger.getLogger(ProduitDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         return p;
    }

    @Override
    public void ajouter(Produit obj) {
        try {
            PreparedStatement pst = this.connect.prepareStatement("insert into article(code_produit,designation,prix,stock) values (?,?,?,?)");
            pst.setString(1, obj.getCode_produit());
            pst.setString(2, obj.getDesignation());
            pst.setString(3, obj.getPrix());
            pst.setString(4, obj.getStock());
           
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProduitDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Produit obj, int id) {
        try {
            PreparedStatement pst = this.connect.prepareStatement("update article set code_produit = ? ,designation = ?,prix = ?,stock = ? where id = "+id);
            pst.setString(1, obj.getCode_produit());
            pst.setString(2, obj.getDesignation());
            pst.setString(3, obj.getPrix());
            pst.setString(4, obj.getStock());
           
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProduitDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
       try {
            PreparedStatement pst = this.connect.prepareStatement("delete from article where id="+id);
           
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProduitDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Produit> liste() {
        List<Produit> Produit_list = new ArrayList<>();
        Produit p = new Produit();
         try {
            ResultSet rs = connect.createStatement().executeQuery("select * from article");
            while(rs.next()){
                p.setId(rs.getInt("id"));
                p.setCode_produit(rs.getString("code_produit"));
                p.setDesignation(rs.getString("designation"));
                p.setPrix(rs.getString("prix"));
                p.setStock(rs.getString("stock"));
               
                Produit_list.add(p);
                p = new Produit();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProduitDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Produit_list;
    }
    
    
}
