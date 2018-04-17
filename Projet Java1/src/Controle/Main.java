/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.SQLException;
import java.util.ArrayList;

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
        
       ArrayList al = new ArrayList();
       al.add("malade");
       al.add("1");
       al.add("prenom");
       al.add("Samuel");
       al.add("");
       al.add("");
       al.add("");
       al.add("");
//       al.add("01 30 32 32 32");
//       al.add("MMa");
       Maj rq = new Maj();
       rq.modifierObjet(al);
       
       //System.out.print(connectLocal.remplirChampsRequete("SELECT * FROM service"));
           // On peut maintenant faire des requetes avec l'objet connectLocal
        //Connexion connectExt = new Connexion("ac151888", "********", "ac151888-rw", "bddECE75015");
        // La connexion en ligne ne fonctionne pas en marchant par Gandalf.ece.fr
    }
    
}
