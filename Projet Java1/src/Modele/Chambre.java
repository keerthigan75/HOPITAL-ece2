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
public class Chambre {
    private int numero;
    private int codeService;
    private int surveillant; // Numero d'un infirmier
    private int nb_lits;
    
    public Chambre() {
        numero =0;
        codeService = 0;
        surveillant = 0;
        nb_lits = 0;
    }
    
    public Chambre(int numero, int codeService, int surveillant, int nb_lits) {
        this.numero = numero;
        this.codeService = codeService;
        this.surveillant = surveillant;
        this.nb_lits = nb_lits;
    }
    
}
