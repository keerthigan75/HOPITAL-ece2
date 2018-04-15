/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author Aurélien
 * Classe Employe qui donne naissance aux classe Docteur et Infirmier + Malade car meme attributs
 * Peut etre créer une classe Personne avec tous ces attributs pour séparer Employe de Malade (à voir)
 */
public class Employe {
    protected int numero;
    protected String nom;
    protected String prenom;
    protected int telephone;
    protected String adresse;
    
    //Constructeur par defaut
    public Employe() {
        numero = 0;
        nom = null;
        prenom = null;
        telephone = 0;
        adresse = null;
    }
    
    //Constructeur surchargée
    public Employe(int numero, String nom, String prenom, int telephone, String adresse) {
        this.numero = numero;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.adresse = adresse;
    }
    
}
