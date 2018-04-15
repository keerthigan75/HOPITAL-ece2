/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author Aurélien
 * Classe Docteur qui herite de la classe employe en ajoutant une specialité
 */
public class Docteur extends Employe {
    private String specialite;
    
    public Docteur() {
        super();
        specialite = null;
    }
    
    public Docteur(int numero, String nom, String prenom, int telephone, String adresse, String specialite) {
        super(numero, nom, prenom, telephone, adresse);
        this.specialite = specialite;
    }
    
    
    
}
