
package com.client.action;

import com.biblio.UtilisateurResponse;
import com.opensymphony.xwork2.ActionSupport;


public class GestionEmployeAction extends ActionSupport{
    
    
    private String pseudo;
    private String motPasse;
    private String email;
    private String nom;
    private String prenom;    


    
    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    
   //=========Méthodes============
                      
    /*
   Action permettant la connexion d'un utilisateur
   @return input / success
  */
    
    public String verifEmploye() {
    
                      String vResult = ActionSupport.INPUT;
                                               
                       try {
                           
                      if(pseudo.equals("Martine59") && motPasse.equals("admin"))  {
                      vResult = ActionSupport.SUCCESS;
                                      
                       }
                      
                      
                       } catch (Exception pe){
                           
                       this.addActionError("Identifiant ou mot motPasse invalide !");
                      System.out.println("Prise en compte de la methode !!");
                                                                  
                      }
                                                            
                      return vResult;
                         
                      }
    
           }