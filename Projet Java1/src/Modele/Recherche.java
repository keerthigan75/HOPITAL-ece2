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
    
    public void rechercheTable(int numero) throws SQLException {
        switch(numero) {
            case 1 :
                    this.aService();
                    break;
                case 2 :
                    this.aChambre();
                    break;
                case 3 :
                    this.aEmploye();
                    break;
                case 4 :
                    this.aDocteur();
                    break;
                case 5 :
                    this.aInfirmier();
                    break;
                case 6 :
                    this.aMalade();
                    break;
                case 7 :
                    this.aHospitalisation();
                    break;
                case 8 :
                    this.aSoigne();
                    break;
        }
        affiche.affichage_recherche(recup);
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
        
        recup = connectLocal.remplirChampsRequete("SELECT DISTINCT malade.nom,malade.prenom, COUNT(DISTINCT soigne.no_docteur),COUNT(DISTINCT docteur.specialite)\n" +
"FROM soigne,malade,docteur\n" +
"WHERE no_malade IN\n" +
"    (     SELECT no_malade\n" +
"          FROM soigne\n" +
"          GROUP BY no_malade\n" +
"          HAVING COUNT(no_docteur) > 3\n" +
"    )\n" +
"AND malade.numero = soigne.no_malade\n" +
"AND soigne.no_docteur = docteur.numero\n" +
"GROUP BY malade.nom\n" +
"ORDER BY malade.nom");
        System.out.println(recup);
    }
    
    public void requete8() throws SQLException {
    
        recup = connectLocal.remplirChampsRequete("SELECT service.nom, COUNT(DISTINCT infirmier.numero)/COUNT(DISTINCT hospitalisation.no_malade)\n" +
"FROM service,hospitalisation,infirmier\n" +
"WHERE service.code = hospitalisation.code_service \n" +
"AND service.code = infirmier.code_service \n" +
"GROUP BY service.nom\n" +
"ORDER BY service.nom");
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

    public void aService() throws SQLException {
        recup = connectLocal.remplirChampsRequete("SELECT * FROM service;");
         System.out.println(recup);
        
    }
    public void aChambre() throws SQLException {
        recup = connectLocal.remplirChampsRequete("SELECT * FROM chambre;");
         System.out.println(recup);
        
    }
    public void aEmploye() throws SQLException {
        recup = connectLocal.remplirChampsRequete("SELECT * FROM employe;");
         System.out.println(recup);
        
    }
    public void aDocteur() throws SQLException {
        recup = connectLocal.remplirChampsRequete("SELECT * FROM docteur;");
         System.out.println(recup);
        
    }
    public void aInfirmier() throws SQLException {
        recup = connectLocal.remplirChampsRequete("SELECT * FROM infirmier;");
         System.out.println(recup);
        
    }
    public void aMalade() throws SQLException {
        recup = connectLocal.remplirChampsRequete("SELECT * FROM malade;");
         System.out.println(recup);
        
    }
    public void aHospitalisation() throws SQLException {
        recup = connectLocal.remplirChampsRequete("SELECT * FROM hospitalisation;");
         System.out.println(recup);
        
    } 
    public void aSoigne() throws SQLException {
        recup = connectLocal.remplirChampsRequete("SELECT * FROM soigne;");
         System.out.println(recup);
        
    }
    
}