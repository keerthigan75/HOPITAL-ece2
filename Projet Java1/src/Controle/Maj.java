/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Controle;


import java.util.*;

/**
 *
 * @author Aurélien
 */
public class Maj {
    private String[] type;
    private String requete;
    
    public Maj() {
       requete = "";
    }
    
    public void ajouterObjet(ArrayList list) {
        if (list.get(0) == "Service") {
            type = new String[4];
         for (int i =1; i<5; i++) {
             type[i-1] = (String) list.get(i);
         }
         requete = "INSERT INTO service " + type[0] + type[1] + type[2] + type[3];
         System.out.println(requete);
        }
        else if (list.get(0) == "Chambre") {
            
        }
        else if (list.get(0) == "Employe") {
            
        }
    }

    
}
