/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chadowaker
 */
public class connectdb {
    
     private static String url = "jdbc:mysql://localhost/stock";
    private static String user = "root";
    private static String password = "";
    private static Connection con;
    //Connexion a la base donnée
     public static Connection  getInstance(){
         if(con == null){
             try {
                 con = (Connection)DriverManager.getConnection(url,user,password);
                 
             } catch (SQLException ex) {
                 Logger.getLogger(connectdb.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
          return  con;
   
    }
}
