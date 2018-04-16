/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Controle;


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
        if (list.get(0) == "service") { // Pour la table Service
            type = new String[4]; //On definit la taille du tableau de String
            for (int i =1; i<5; i++) { // On convertit tout les elements de l'array en string
                type[i-1] = (String) list.get(i);
             }
            //On ecrit ensuite la requete
             requete = "INSERT INTO service (code, nom, batiment, directeur) VALUES (" + type[0] + ", '" + type[1] + "', '" + type[2] + "', " + type[3] + ");";
             connectLocal.executeUpdate(requete);   // puis on l'execute   
        }
        else if (list.get(0) == "chambre") { //De la meme facon avec Chambre
            type = new String[4];
            for (int i =1; i<5; i++) {
                type[i-1] = (String) list.get(i);
             }
             requete = "INSERT INTO chambre (code_service, no_chambre, surveillant, nb_lits) VALUES ('" + type[0] + "', " + type[1] + ", " + type[2] + ", " + type[3] + ");";
             connectLocal.executeUpdate(requete);
            
        }
        else if (list.get(0) == "employe") { //De meme pour employe
            type = new String[5];
            for (int i =1; i<6; i++) {
                type[i-1] = (String) list.get(i);
             }
             requete = "INSERT INTO employe (numero, nom, prenom, adresse, tel) VALUES (" + type[0] + ", '" + type[1] + "', '" + type[2] + "', '" + type[3] + "', " + type[4] + ");";
             connectLocal.executeUpdate(requete);
        }
        else if (list.get(0) == "docteur") { //De meme pour docteur
            type = new String[2];
            for (int i =1; i<3; i++) {
                type[i-1] = (String) list.get(i);
             }
             requete = "INSERT INTO docteur (numero, specialite) VALUES (" + type[0] + ", '" + type[1] + "');";
             connectLocal.executeUpdate(requete);
        }
        else if (list.get(0) == "hospitalisation") { //De meme pour hospitalisation
            type = new String[4];
            for (int i =1; i<5; i++) {
                type[i-1] = (String) list.get(i);
             }
             requete = "INSERT INTO hospitalisation (no_malade, code_service, no_chambre, lit) VALUES (" + type[0] + ", '" + type[1] + "', " + type[2] + ", " + type[3] + ", " + type[4] + ");";
             connectLocal.executeUpdate(requete);
        }
        else if (list.get(0) == "infirmier") { //Infirmier
            type = new String[4];
            for (int i =1; i<5; i++) {
                type[i-1] = (String) list.get(i);
             }
             requete = "INSERT INTO infirmier (numero, code_service, rotation, salaire) VALUES (" + type[0] + ", '" + type[1] + "', '" + type[2] + "', " + type[3] + ");";
             connectLocal.executeUpdate(requete);
        }
        else if (list.get(0) == "malade") { //Malade
            type = new String[6];
            for (int i =1; i<7; i++) {
                type[i-1] = (String) list.get(i);
             }
             requete = "INSERT INTO malade (numero, nom, prenom, adresse, tel, mutuelle) VALUES (" + type[0] + ", '" + type[1] + "', '" + type[2] + "', '" + type[3] + "' +" + type[4] + ", '" + type[5] + "');";
             connectLocal.executeUpdate(requete);
        }
        else if (list.get(0) == "soigne") { //soigne
            type = new String[2];
            for (int i =1; i<3; i++) {
                type[i-1] = (String) list.get(i);
             }
             requete = "INSERT INTO soigne (no_docteur, no_malade) VALUES (" + type[0] + ", " + type[1] + ");";
             connectLocal.executeUpdate(requete);
        }
    }
    
    public void supprimerObjet(ArrayList list) throws SQLException {
       if (list.get(0) == "service") { // Pour la table Service
            type = new String[1]; //On definit la taille du tableau de String
            for (int i =1; i<2; i++) { // On convertit tout les elements de l'array en string
                type[i-1] = (String) list.get(i);
             }
            //On ecrit ensuite la requete
             requete = "DELETE FROM service WHERE code=" + type[0] + ";";
             connectLocal.executeUpdate(requete);   // puis on l'execute   
        }
        else if (list.get(0) == "chambre") { // Pour la table Chambre
            type = new String[2]; //On definit la taille du tableau de String
            for (int i =1; i<3; i++) { // On convertit tout les elements de l'array en string
                type[i-1] = (String) list.get(i);
             }
            //On ecrit ensuite la requete
             requete = "DELETE FROM service WHERE no_chambre=" + type[0] + " AND code_service=" + type[1] + ";";
             connectLocal.executeUpdate(requete);   // puis on l'execute   
        }
        else if (list.get(0) == "docteur") { // Pour la table Docteur
            type = new String[1]; //On definit la taille du tableau de String
            for (int i =1; i<2; i++) { // On convertit tout les elements de l'array en string
                type[i-1] = (String) list.get(i);
             }
            //On ecrit ensuite la requete
             requete = "DELETE FROM service WHERE numero=" + type[0] + ";";
             connectLocal.executeUpdate(requete);   // puis on l'execute   
        }
        else if (list.get(0) == "employe") { // Pour la table Employe
            type = new String[1]; //On definit la taille du tableau de String
            for (int i =1; i<2; i++) { // On convertit tout les elements de l'array en string
                type[i-1] = (String) list.get(i);
             }
            //On ecrit ensuite la requete
             requete = "DELETE FROM service WHERE numero=" + type[0] + ";";
             connectLocal.executeUpdate(requete);   // puis on l'execute   
        }
        else if (list.get(0) == "hospitalisation") { // Pour la table Hospitalisation
            type = new String[1]; //On definit la taille du tableau de String
            for (int i =1; i<2; i++) { // On convertit tout les elements de l'array en string
                type[i-1] = (String) list.get(i);
             }
            //On ecrit ensuite la requete
             requete = "DELETE FROM service WHERE no_malade=" + type[0] + ";";
             connectLocal.executeUpdate(requete);   // puis on l'execute   
        }
        else if (list.get(0) == "infirmier") { // Pour la table Infirmier
            type = new String[1]; //On definit la taille du tableau de String
            for (int i =1; i<2; i++) { // On convertit tout les elements de l'array en string
                type[i-1] = (String) list.get(i);
             }
            //On ecrit ensuite la requete
             requete = "DELETE FROM service WHERE numero=" + type[0] + ";";
             connectLocal.executeUpdate(requete);   // puis on l'execute   
        }
        else if (list.get(0) == "malade") { // Pour la table Malade
            type = new String[1]; //On definit la taille du tableau de String
            for (int i =1; i<2; i++) { // On convertit tout les elements de l'array en string
                type[i-1] = (String) list.get(i);
             }
            //On ecrit ensuite la requete
             requete = "DELETE FROM service WHERE numero=" + type[0] + ";";
             connectLocal.executeUpdate(requete);   // puis on l'execute   
        }
        else if (list.get(0) == "soigne") { //soigne
            type = new String[2];
            for (int i =1; i<3; i++) {
                type[i-1] = (String) list.get(i);
             }
             requete = "DELETE FROM soigne WHERE no_docteur=" + type[0] + "AND no_malade=" + type[1] + ";";
             connectLocal.executeUpdate(requete);
        }
    }    
}
