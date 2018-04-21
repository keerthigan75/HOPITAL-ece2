/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;



/**
 *
 * @author Aurélien
 * 
 * Classe Service qui se trouve dans la BDD
 * 
 */
public class Service {
    private int code; //Clé primaire
    private String nom; //Nom du service
    private String batiment; //Nom du batiment, un seul batiment pour un service
    private int directeur; //Correspond au numéro d'un docteur
    
    
    //Constructeur surchargée 
    public Service(int code, String nom, String batiment, int directeur) {
        this.code = code;
        this.nom = nom;
        this.batiment = batiment;
        this.directeur = directeur;
        
    }
    
    //Methodes
    public void ajouterObjet() {
        
    }
   
    
}
