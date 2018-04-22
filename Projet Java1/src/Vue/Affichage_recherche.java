/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.TableModel;


/**
 *
 * @author Thomas
 */
public class Affichage_recherche extends JFrame {
    
    private JTable tableau;
    
    public Affichage_recherche() {
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Recherche");
        this.setSize(600, 140);

    }
public void affichage_recherche(ArrayList list){
    
    this.tableau = new JTable((TableModel) list);
    this.getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
    
    for(int i=0; i<list.size();i++)
    {
        System.out.println(list.get(i));
    }
    

}

}
