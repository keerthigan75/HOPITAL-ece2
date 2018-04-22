/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;


import Modele.Recherche;
import Vue.*;
import java.sql.SQLException;
/**
 *
 * @author Aurélien Coudert & Thomas Couraud & Keert
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
//        SignIn test = new SignIn();
//        test.setVisible(true);
           Recherche rech = new Recherche();
           rech.rechercheRQ(1);
    }
    
}
