/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import Controle.Connexion;
import Vue.AfficheReporting;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Aurélien oui oui oui
 */
public class Reporting {
    private AfficheReporting affiche;
    private  Connexion connectLocal;
    
    
    public Reporting() throws ClassNotFoundException, SQLException {
        affiche = new AfficheReporting();
        connectLocal = new Connexion("hopital", "root", "");
    }
    
    public void hopitalise_service(int choixAffiche) throws SQLException {
        //RES
        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();
        String liste[];
        String liste2[];
        
        list = connectLocal.remplirChampsRequete("SELECT code FROM service");
        list2 = connectLocal.remplirChampsRequete("SELECT code_service FROM hospitalisation");
        liste = new String[list.size()];
        liste2 = new String[list2.size()];
        int cpt[] = new int[list.size()];
        
        for(int i =0; i< list.size(); i++) {
            cpt[i] = 0;
            liste[i] = (String) list.get(i);
            for(int j=0; j<list2.size(); j++) {
                liste2[j] = (String) list2.get(j);
                if(liste2[j] == null ? liste[i] == null : liste2[j].equals(liste[i])) {
                    cpt[i] = cpt[i] +1;
                }
            }
        }
        if(choixAffiche == 1) {
            affiche.afficheCamembert("Nombre d'hospitalisés par service", liste, cpt);
        }
        else if(choixAffiche == 2) {
            affiche.afficheBarre("Nombre d'hospitalisation par service", liste, cpt);
        }
        
    }
    
    public void effectif_malade(int choixAffiche) throws SQLException {
        ArrayList recup = new ArrayList();
        
        int nombre[] = new int[3];
        String nom[] = new String[3];
        //On récupère le nombre de docteur dans la table
        recup =  connectLocal.remplirChampsRequete("SELECT * FROM docteur");
        nombre[0] = recup.size();
        nom[0] = "Docteurs";
        //On récupère le nombre d'infirmiers dans la table
        recup =  connectLocal.remplirChampsRequete("SELECT * FROM infirmier");
        nombre[1] =  recup.size();
        nom[1] = "Infirmiers";
        //On recupère le nombre de malades dans la table
        recup =  connectLocal.remplirChampsRequete("SELECT * FROM malade");
        nombre[2] = recup.size();
        nom[2] = "Malades";
        //Affichage en camenbert
        if(choixAffiche == 1) {
            affiche.afficheCamembert("Nombre de Docteurs, Infirmiers et Malades",nom, nombre);
        } //Affichage Barres
        else if(choixAffiche == 2) {
            affiche.afficheBarre("Nombre de Docteurs, Infirmiers et Malades", nom, nombre);
        }

    }
    
    public void specialite_docteur(int choixAffiche) throws SQLException {
        ArrayList recupSpe = new ArrayList();
        ArrayList recupDoc = new ArrayList();
        String recupS[];
        String recupD[];
        int cpt[];
        
        
        recupSpe = connectLocal.remplirChampsRequete("SELECT specialite FROM docteur GROUP BY specialite");
        recupDoc = connectLocal.remplirChampsRequete("SELECT specialite FROM docteur");
        recupS = new String[recupSpe.size()];
        recupD = new String[recupDoc.size()];
        cpt = new int[recupSpe.size()];
        
        for(int i=0; i<recupSpe.size(); i++) {
            recupS[i] = (String) recupSpe.get(i); 
        }
        for(int i =0; i<recupDoc.size();i++) {
            recupD[i]= (String) recupDoc.get(i);
            
            for(int j=0; j<recupS.length; j++) {
                if(recupD[i] == null ? recupS[j] == null : recupD[i].equals(recupS[j])) {
                    cpt[j] = cpt[j]+1;
                    break;
                }
            }
        }
        //Affichage en camenbert
        if(choixAffiche == 1) {
            affiche.afficheCamembert("Nombre de docteurs par spécialités",recupD, cpt);
        } //Affichage Barres
        else if(choixAffiche == 2) {
            affiche.afficheBarre("Nombre de docteurs par spécialités", recupD, cpt);
        }
 
    }
    
    public void infirmier_service(int choixAffiche) throws SQLException {
        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();
        String liste[];
        String liste2[];
        
        list = connectLocal.remplirChampsRequete("SELECT code FROM service");
        list2 = connectLocal.remplirChampsRequete("SELECT code_service FROM infirmier");
        liste = new String[list.size()];
        liste2 = new String[list2.size()];
        int cpt[] = new int[list.size()];
        
        for(int i =0; i< list.size(); i++) {
            cpt[i] = 0;
            liste[i] = (String) list.get(i);
            for(int j=0; j<list2.size(); j++) {
                liste2[j] = (String) list2.get(j);
                if(liste2[j] == null ? liste[i] == null : liste2[j].equals(liste[i])) {
                    cpt[i] = cpt[i] +1;
                }
            }
        }
        //Affichage Camembert
        if(choixAffiche == 1) {
            affiche.afficheCamembert("Nombre d'infirmiers par servoce", liste, cpt);
        } //Affichage barres
        else if(choixAffiche == 2) {
            affiche.afficheBarre("Nombre d'infirmiers par service", liste, cpt);
        }
    }
}

