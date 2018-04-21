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
public class Hospitalisation {
    private int numeroMalade;
    private int codeService;
    private int numeroChambre;
    private int lit;
    
    public Hospitalisation() {
        numeroMalade =0;
        codeService = 0;
        numeroChambre= 0;
        lit = 0;
    }
    
    public Hospitalisation(int numeroM, int codeS, int numeroC, int lit) {
        this.numeroMalade = numeroM;
        this.codeService = codeS;
        this.numeroChambre = numeroC;
        this.lit = lit;
    }
}
