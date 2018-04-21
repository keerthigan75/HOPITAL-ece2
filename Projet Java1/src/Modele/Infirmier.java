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
public class Infirmier extends Employe {
    private int codeService;
    private String rotation;
    private int salaire;
    
    public Infirmier() {
        super();
        codeService = 0;
        rotation = "Jour";
        salaire = 0;
    }
    
    public Infirmier(int numero, String nom, String prenom, int telephone, String adresse, int codeService, String rotation, int salaire) {
        super(numero, nom, prenom, telephone, adresse);
        this.rotation = rotation;
        this.codeService = codeService;
        this.salaire = salaire;
    }
    
    
}
