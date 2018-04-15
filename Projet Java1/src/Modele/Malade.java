/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author Aurélien
 * Classe malade qu'on fait hériter d'employe car meme attributs
 */
public class Malade extends Employe {
    private String mutuelle;
    
    public Malade() {
        super();
        mutuelle = null;
    }
    
    public Malade(int numero, String nom, String prenom, int telephone, String adresse, String mutuelle) {
        super(numero, nom, prenom, telephone, adresse);
        this.mutuelle = mutuelle;
        
    }
    
    
    
}
