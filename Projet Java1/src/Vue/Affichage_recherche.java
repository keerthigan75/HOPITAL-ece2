/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Thomas
 */
public class Affichage_recherche {
    
public void affichage_recherche(ArrayList recup){
    
         String[] s = new String[recup.size()];
         for(int i =0; i<recup.size(); i++) {
             s[i] = (String) recup.get(i);
         }
         JOptionPane jop = new JOptionPane();
         jop.showMessageDialog(null, s, "Résultat de la Recherche", JOptionPane.INFORMATION_MESSAGE);

    
}

}
