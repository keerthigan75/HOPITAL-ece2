/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author Aurélien
 */
public class Soigne {
    private int numeroDocteur;
    private int numeroMalade;
    
    public Soigne() {
        numeroDocteur = 0;
        numeroMalade = 0;   
    }
    
    public Soigne(int numeroDocteur, int numeroMalade) {
        this.numeroDocteur =numeroDocteur;
        this.numeroMalade = numeroMalade;
    }
}
