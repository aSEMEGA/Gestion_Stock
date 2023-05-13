/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Chadowaker
 */
public  abstract class Doa<T>{
    public Connection connect = connectdb.getInstance();
    //Recherche
    public abstract T recherche(int id);
    //Ajout
    public abstract void ajouter(T obj);
    //Modification 
    public abstract void modifier(T obj, int id);
    //Supprimer
    public abstract void supprimer(int id);
    //List
    public abstract List<T>liste();
}
