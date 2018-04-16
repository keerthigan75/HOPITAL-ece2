/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.SQLException;

/**
 *
 * @author Aurélien Coudert & Thomas Couraud & Keert
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        System.out.println("Hello");
       Connexion connectLocal = new Connexion("hopital", "root", "");
           // On peut maintenant faire des requetes avec l'objet connectLocal
        //Connexion connectExt = new Connexion("ac151888", "********", "ac151888-rw", "bddECE75015");
        // La connexion en ligne ne fonctionne pas en marchant par Gandalf.ece.fr
    }
    
}
