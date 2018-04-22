/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import Controle.Connexion;
import Vue.Affichage_recherche;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Aurélien
 */
public class Recherche {
    private Connexion connectLocal;
    private ArrayList recup;
    private Affichage_recherche affiche;
    
    public Recherche() throws SQLException, ClassNotFoundException {
        recup = new ArrayList();
        connectLocal = new Connexion("hopital", "root", "");
        affiche = new Affichage_recherche();
    }
    
    public void rechercheRQ(int numero) throws SQLException {
        switch (numero) {
                case 1 :
                    this.requete1();
                    break;
                case 2 :
                    this.requete2();
                    break;
                case 3 :
                    this.requete3();
                    break;
                case 4 :
                    this.requete4();
                    break;
                case 5 :
                    this.requete5();
                    break;
                case 6 :
                    this.requete6();
                    break;
                case 7 :
                    this.requete7();
                    break;
                case 8 :
                    this.requete8();
                    break;
                case 9 :
                    this.requete9();
                    break;
                case 10 :
                    this.requete10();
                    break;
                    
        }
        
        affiche.affichage_recherche(recup);
        
        
                    
    }
    
    public void requete1() throws SQLException {
        
        recup = connectLocal.remplirChampsRequete("SELECT nom, prenom FROM malade WHERE mutuelle='MAAF';");
         System.out.println(recup);
    }
    
    public void requete2() throws SQLException {
       
        recup = connectLocal.remplirChampsRequete("SELECT nom, prenom FROM employe,infirmier WHERE infirmier.numero = employe.numero AND infirmier.rotation='NUIT'");
        System.out.println(recup);
    }

    public void requete3() throws SQLException {
       
        recup = connectLocal.remplirChampsRequete("SELECT service.nom,service.batiment,employe.prenom,employe.nom,docteur.specialite FROM service,docteur,employe WHERE service.directeur = employe.numero AND docteur.numero=service.directeur;");
        System.out.println(recup);
    }
    
    public void requete4() throws SQLException {
        
        recup = connectLocal.remplirChampsRequete("SELECT code_service, AVG(nb_lits) FROM chambre GROUP BY code_service;");
        System.out.println(recup);
    }
    
    public void requete5() throws SQLException {
     
        recup = connectLocal.remplirChampsRequete("SELECT code_service ,AVG(salaire) FROM infirmier GROUP BY code_service ;");
        System.out.println(recup);
    }
    
    public void requete6() throws SQLException {
     
        recup = connectLocal.remplirChampsRequete("SELECT code_service, AVG(nb_lits),batiment  FROM service,chambre WHERE batiment='A' GROUP BY code_service");
        System.out.println(recup);
    }
    
    public void requete7() throws SQLException {
        
        recup = connectLocal.remplirChampsRequete("");
        System.out.println(recup);
    }
    
    public void requete8() throws SQLException {
    
        recup = connectLocal.remplirChampsRequete("");
        System.out.println(recup);
    }
    
    public void requete9() throws SQLException {
      
        recup = connectLocal.remplirChampsRequete("SELECT employe.prenom,employe.nom\n" +
"FROM employe\n" +
"WHERE employe.numero IN\n" +
"    (     SELECT soigne.no_docteur\n" +
"          FROM soigne,hospitalisation\n" +
"          WHERE soigne.no_malade = hospitalisation.no_malade\n" +
"          GROUP BY soigne.no_docteur\n" +
"          HAVING COUNT(no_docteur) >= 1\n" +
"    )\n" +
"ORDER BY employe.nom");
        System.out.println(recup);
    }
    
    public void requete10() throws SQLException {
       
        recup = connectLocal.remplirChampsRequete("SELECT employe.prenom,employe.nom FROM employe,docteur WHERE employe.numero NOT IN(SELECT soigne.no_docteur FROM soigne,hospitalisation WHERE soigne.no_malade = hospitalisation.no_malade GROUP BY soigne.no_docteur) AND employe.numero = docteur.numero ORDER BY employe.nom");
        System.out.println(recup);
    }
}
