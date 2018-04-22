/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Modele;


import Controle.Connexion;
import java.sql.SQLException;
import java.util.*;

/**
 *
 * @author Aurélien
 */
public class Maj {
    private String[] type;
    private String requete;
    private Connexion connectLocal;
    
    public Maj() throws SQLException, ClassNotFoundException {
       requete = "";
       connectLocal = new Connexion("hopital", "root", "");
    }
    
    //Methode pour ajouter une nouvelle ligne dans la table correspondante
    public void ajouterObjet(ArrayList list) throws SQLException {
        if (list.get(0) == "Service") { // Pour la table Service
            type = new String[4]; //On definit la taille du tableau de String
            for (int i =1; i<5; i++) { // On convertit tout les elements de l'array en string
                type[i-1] = (String) list.get(i);
             }
            //On ecrit ensuite la requete
             requete = "INSERT INTO service (code, nom, batiment, directeur) VALUES ('" + type[0] + "', '" + type[1] + "', '" + type[2] + "', " + type[3] + ");";
             connectLocal.executeUpdate(requete);   // puis on l'execute   
        }
        else if (list.get(0) == "Chambre") { //De la meme facon avec Chambre
            type = new String[4];
            for (int i =1; i<5; i++) {
                type[i-1] = (String) list.get(i);
             }
             requete = "INSERT INTO chambre (code_service, no_chambre, surveillant, nb_lits) VALUES ('" + type[0] + "', " + type[1] + ", " + type[2] + ", " + type[3] + ");";
             connectLocal.executeUpdate(requete);
            
        }
        else if (list.get(0) == "Employe") { //De meme pour employe
            type = new String[5];
            for (int i =1; i<6; i++) {
                type[i-1] = (String) list.get(i);
             }
             requete = "INSERT INTO employe (numero, nom, prenom, adresse, tel) VALUES (" + type[0] + ", '" + type[1] + "', '" + type[2] + "', '" + type[3] + "', " + type[4] + ");";
             connectLocal.executeUpdate(requete);
        }
        else if (list.get(0) == "Docteur") { //De meme pour docteur
            type = new String[2];
            for (int i =1; i<3; i++) {
                type[i-1] = (String) list.get(i);
             }
             requete = "INSERT INTO docteur (numero, specialite) VALUES (" + type[0] + ", '" + type[1] + "');";
             connectLocal.executeUpdate(requete);
        }
        else if (list.get(0) == "Hospitalisation") { //De meme pour hospitalisation
            type = new String[4];
            for (int i =1; i<5; i++) {
                type[i-1] = (String) list.get(i);
             }
             requete = "INSERT INTO hospitalisation (no_malade, code_service, no_chambre, lit) VALUES (" + type[0] + ", '" + type[1] + "', " + type[2] + ", " + type[3] + ", " + type[4] + ");";
             connectLocal.executeUpdate(requete);
        }
        else if (list.get(0) == "Infirmier") { //Infirmier
            type = new String[4];
            for (int i =1; i<5; i++) {
                type[i-1] = (String) list.get(i);
             }
             requete = "INSERT INTO infirmier (numero, code_service, rotation, salaire) VALUES (" + type[0] + ", '" + type[1] + "', '" + type[2] + "', " + type[3] + ");";
             connectLocal.executeUpdate(requete);
        }
        else if (list.get(0) == "Malade") { //Malade
            type = new String[6];
            for (int i =1; i<7; i++) {
                type[i-1] = (String) list.get(i);
             }
             requete = "INSERT INTO malade (numero, nom, prenom, adresse, tel, mutuelle) VALUES (" + type[0] + ", '" + type[1] + "', '" + type[2] + "', '" + type[3] + "' ,'" + type[4] + "', '" + type[5] + "');";
             System.out.println(requete);
             connectLocal.executeUpdate(requete);
        }
        else if (list.get(0) == "Soigne") { //soigne
            type = new String[2];
            for (int i =1; i<3; i++) {
                type[i-1] = (String) list.get(i);
             }
             requete = "INSERT INTO soigne (no_docteur, no_malade) VALUES (" + type[0] + ", " + type[1] + ");";
             connectLocal.executeUpdate(requete);
        }
    }
    
    public void supprimerObjet(ArrayList list) throws SQLException {
       if (list.get(0) == "Service") { // Pour la table Service
            type = new String[1]; //On definit la taille du tableau de String
            for (int i =1; i<2; i++) { // On convertit tout les elements de l'array en string
                type[i-1] = (String) list.get(i);
             }
            //On ecrit ensuite la requete
             requete = "DELETE FROM service WHERE service.code ='" + type[0] + "';";
             System.out.print(requete);
             connectLocal.executeUpdate(requete);   // puis on l'execute  
        }
        else if (list.get(0) == "Chambre") { // Pour la table Chambre
            type = new String[2]; //On definit la taille du tableau de String
            for (int i =1; i<3; i++) { // On convertit tout les elements de l'array en string
                type[i-1] = (String) list.get(i);
             }
            //On ecrit ensuite la requete
             requete = "DELETE FROM chambre WHERE chambre.code_service='" + type[0] + "' AND chambre.no_chambre='" + type[1] + "';";
             connectLocal.executeUpdate(requete);   // puis on l'execute   
        }
        else if (list.get(0) == "Docteur") { // Pour la table Docteur
            type = new String[1]; //On definit la taille du tableau de String
            for (int i =1; i<2; i++) { // On convertit tout les elements de l'array en string
                type[i-1] = (String) list.get(i);
             }
            //On ecrit ensuite la requete
             requete = "DELETE FROM docteur WHERE docteur.numero='" + type[0] + "';";
             connectLocal.executeUpdate(requete);   // puis on l'execute   
        }
        else if (list.get(0) == "Employe") { // Pour la table Employe
            type = new String[1]; //On definit la taille du tableau de String
            for (int i =1; i<2; i++) { // On convertit tout les elements de l'array en string
                type[i-1] = (String) list.get(i);
             }
            //On ecrit ensuite la requete
             requete = "DELETE FROM employe WHERE employe.numero='" + type[0] + "';";
             connectLocal.executeUpdate(requete);   // puis on l'execute   
        }
        else if (list.get(0) == "Hospitalisation") { // Pour la table Hospitalisation
            type = new String[1]; //On definit la taille du tableau de String
            for (int i =1; i<2; i++) { // On convertit tout les elements de l'array en string
                type[i-1] = (String) list.get(i);
             }
            //On ecrit ensuite la requete
             requete = "DELETE FROM hospitalisation WHERE hospitalisation.no_malade='" + type[0] + "';";
             connectLocal.executeUpdate(requete);   // puis on l'execute   
        }
        else if (list.get(0) == "Infirmier") { // Pour la table Infirmier
            type = new String[1]; //On definit la taille du tableau de String
            for (int i =1; i<2; i++) { // On convertit tout les elements de l'array en string
                type[i-1] = (String) list.get(i);
             }
            //On ecrit ensuite la requete
             requete = "DELETE FROM infirmier WHERE infirmier.numero='" + type[0] + "';";
             connectLocal.executeUpdate(requete);   // puis on l'execute   
        }
        else if (list.get(0) == "Malade") { // Pour la table Malade
            type = new String[1]; //On definit la taille du tableau de String
            for (int i =1; i<2; i++) { // On convertit tout les elements de l'array en string
                type[i-1] = (String) list.get(i);
             }
            //On ecrit ensuite la requete
             requete = "DELETE FROM malade WHERE malade.numero='" + type[0] + "';";
             connectLocal.executeUpdate(requete);   // puis on l'execute   
        }
        else if (list.get(0) == "Soigne") { //soigne
            type = new String[2];
            for (int i =1; i<3; i++) {
                type[i-1] = (String) list.get(i);
             }
             requete = "DELETE FROM soigne WHERE soigne.no_docteur='" + type[0] + "' AND soigne.no_malade='" + type[1] + "';";
             connectLocal.executeUpdate(requete);
        }
    }

    @SuppressWarnings("empty-statement")
    public void modifierObjet(ArrayList list) throws SQLException {
        int taille = list.size();
        if (list.get(0) == "Service") { // Pour la table Service
            type = new String[taille]; //On definit la taille du tableau de String
            for (int i =0; i<taille; i++) { // On convertit tout les elements de l'array en string
                type[i] = (String) list.get(i);
             }
            requete="UPDATE service SET";
            for(int i =2; i<taille; i=i+2) {
                if((type[i] != "") && (type[i+1] != "")) {
                    
                    requete += " " + type[i] + "='" + type[i+1] + "',";
                }
            }
            //On ecrit ensuite la requete
            requete = requete.substring(0, requete.length() - 1);
            requete += "WHERE service.code ='" + type[1] + "';";
             System.out.print(requete);
             connectLocal.executeUpdate(requete);   // puis on l'execute  
        }
        else if (list.get(0) == "Chambre") { // Pour la table Chambre
            type = new String[taille]; //On definit la taille du tableau de String
            for (int i =0; i<taille; i++) { // On convertit tout les elements de l'array en string
                type[i] = (String) list.get(i);
             }
            requete="UPDATE chambre SET"; //Debut de la requete
            for(int i =3; i<taille; i=i+2) {
                if((type[i] != "") && (type[i+1] != "")) {
                    
                    requete += " " + type[i] + "='" + type[i+1] + "',";
                }
            }
            //On ecrit ensuite la requete
            requete = requete.substring(0, requete.length() - 1);
            requete += "WHERE chambre.code_service='" + type[1] + "' AND chambre.no_chambre='" + type[2] + "';";
             System.out.print(requete);
             connectLocal.executeUpdate(requete);   // puis on l'execute  
        }
        else if (list.get(0) == "Docteur") { // Pour la table Docteur
            type = new String[taille]; //On definit la taille du tableau de String
            for (int i =0; i<taille; i++) { // On convertit tout les elements de l'array en string
                type[i] = (String) list.get(i);
             }
            requete="UPDATE docteur SET"; //Debut de la requete
            for(int i =2; i<taille; i=i+2) {
                if((type[i] != "") && (type[i+1] != "")) {
                    
                    requete += " " + type[i] + "='" + type[i+1] + "',";
                }
            }
            //On ecrit ensuite la requete
            requete = requete.substring(0, requete.length() - 1);
            requete += "WHERE docteur.numero='" + type[1] + "';";
             System.out.print(requete);
             connectLocal.executeUpdate(requete);   // puis on l'execute  
        }
        else if (list.get(0) == "Employe") { // Pour la table Employe
            type = new String[taille]; //On definit la taille du tableau de String
            for (int i =0; i<taille; i++) { // On convertit tout les elements de l'array en string
                type[i] = (String) list.get(i);
             }
            requete="UPDATE employe SET"; //Debut de la requete
            for(int i =2; i<taille; i=i+2) {
                if((type[i] != "") && (type[i+1] != "")) {
                    
                    requete += " " + type[i] + "='" + type[i+1] + "',";
                }
            }
            //On ecrit ensuite la requete
            requete = requete.substring(0, requete.length() - 1);
            requete += "WHERE employe.numero='" + type[1] + "';";
             System.out.print(requete);
             connectLocal.executeUpdate(requete);   // puis on l'execute  
        }
        else if (list.get(0) == "Hospitalisation") { // Pour la table Employe
            type = new String[taille]; //On definit la taille du tableau de String
            for (int i =0; i<taille; i++) { // On convertit tout les elements de l'array en string
                type[i] = (String) list.get(i);
             }
            requete="UPDATE hospitalisation SET"; //Debut de la requete
            for(int i =2; i<taille; i=i+2) {
                if((type[i] != "") && (type[i+1] != "")) {
                    
                    requete += " " + type[i] + "='" + type[i+1] + "',";
                }
            }
            //On ecrit ensuite la requete
            requete = requete.substring(0, requete.length() - 1);
            requete += "WHERE hospitalisation.no_malade='" + type[1] + "';";
             System.out.print(requete);
             connectLocal.executeUpdate(requete);   // puis on l'execute  
        }
        else if (list.get(0) == "Infirmier") { // Pour la table Infirmier
            type = new String[taille]; //On definit la taille du tableau de String
            for (int i =0; i<taille; i++) { // On convertit tout les elements de l'array en string
                type[i] = (String) list.get(i);
             }
            requete="UPDATE infirmier SET"; //Debut de la requete
            for(int i =2; i<taille; i=i+2) {
                if((type[i] != "") && (type[i+1] != "")) {
                    
                    requete += " " + type[i] + "='" + type[i+1] + "',";
                }
            }
            //On ecrit ensuite la requete
            requete = requete.substring(0, requete.length() - 1);
            requete += "WHERE infirmier.numero='" + type[1] + "';";
             System.out.print(requete);
             connectLocal.executeUpdate(requete);   // puis on l'execute  
        }
        else if (list.get(0) == "Malade") { // Pour la table Employe
            type = new String[taille]; //On definit la taille du tableau de String
            for (int i =0; i<taille; i++) { // On convertit tout les elements de l'array en string
                type[i] = (String) list.get(i);
             }
            requete="UPDATE malade SET"; //Debut de la requete
            for(int i =2; i<taille; i=i+2) {
                if((type[i] != "") && (type[i+1] != "")) {
                    
                    requete += " " + type[i] + "='" + type[i+1] + "',";
                }
            }
            //On ecrit ensuite la requete
            requete = requete.substring(0, requete.length() - 1);
            requete += "WHERE malade.numero='" + type[1] + "';";
             System.out.print(requete);
             connectLocal.executeUpdate(requete);   // puis on l'execute  
        }
        else if (list.get(0) == "Soigne") { // Pour la table soigne
            type = new String[taille]; //On definit la taille du tableau de String
            for (int i =0; i<taille; i++) { // On convertit tout les elements de l'array en string
                type[i] = (String) list.get(i);
             }
            requete="UPDATE soigne SET"; //Debut de la requete
            for(int i =3; i<taille; i=i+2) {
                if((type[i] != "") && (type[i+1] != "")) {
                    
                    requete += " " + type[i] + "='" + type[i+1] + "',";
                }
            }
            //On ecrit ensuite la requete
            requete = requete.substring(0, requete.length() - 1);
            requete += "WHERE soigne.no_docteur='" + type[1] + "' AND soigne.no_malade='" + type[2] + "';";
             System.out.print(requete);
             connectLocal.executeUpdate(requete);   // puis on l'execute  
        }
    }
}
