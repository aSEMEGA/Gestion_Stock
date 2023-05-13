/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classe.Produit;
import classe.Vente;
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
public class VenteDao extends Doa<Vente>{
    


    @Override
    public Vente recherche(int id) {
          Vente v = new Vente();
        try {
          
            ResultSet rs = this.connect.createStatement().executeQuery("select* from vente where id = "+id);
            if(rs.next()){
                 v.setId(rs.getInt("id"));
                v.setCode_produit(rs.getString("code_produit"));
                v.setDesignation(rs.getString("designation"));
                v.setPrix_vente(rs.getString("prix_vente"));
                v.setStock_sortie(rs.getString("stock_sortie"));
                v.setMaitre(rs.getString("maitre"));
               
           
         }
    } catch (SQLException ex) {
            Logger.getLogger(VenteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         return v;
    }

    @Override
    public void ajouter(Vente obj) {
        try {
            PreparedStatement pst = this.connect.prepareStatement("insert into vente(code_produit,designation,prix_vente,stock_sortie,maitre) values (?,?,?,?,?)");
            pst.setString(1, obj.getCode_produit());
            pst.setString(2, obj.getDesignation());
            pst.setString(3, obj.getPrix_vente());
            pst.setString(4, obj.getStock_sortie());
           pst.setString(5, obj.getMaitre());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(VenteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Vente obj, int id) {
         try {
            PreparedStatement pst = this.connect.prepareStatement("update article set code_produit = ?, designation = ?,prix_vente = ?,stock_sortie = ?, maitre = ? where id = "+id);
            pst.setString(1, obj.getCode_produit());
            pst.setString(2, obj.getDesignation());
            pst.setString(3, obj.getPrix_vente());
            pst.setString(4, obj.getStock_sortie());
            pst.setString(5, obj.getMaitre());
           
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(VenteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
        try {
            PreparedStatement pst = this.connect.prepareStatement("delete from vente where id="+id);
           
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProduitDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Vente> liste() {
        List<Vente> Vente_list = new ArrayList<>();
        Vente v = new Vente();
         try {
            ResultSet rs = connect.createStatement().executeQuery("select * from vente");
            while(rs.next()){
                 v.setId(rs.getInt("id"));
                v.setCode_produit(rs.getString("code_produit"));
                v.setDesignation(rs.getString("designation"));
                v.setPrix_vente(rs.getString("prix_vente"));
                v.setStock_sortie(rs.getString("stock_sortie"));
                v.setMaitre(rs.getString("maitre"));
                Vente_list.add(v);
                v = new Vente();
            }
        } catch (SQLException ex) {
            Logger.getLogger(VenteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Vente_list;
    }
}
