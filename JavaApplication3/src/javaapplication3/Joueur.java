/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Naycene Boussoffara
 */
public class Joueur {
    //Attributs 
    private String nom;
    private String prenom;
    private String sexe;  
    private int npj;
    private String niveau;
    //Constructeur 
    public Joueur () {
        nom=" ";
        prenom=" ";
        sexe=" ";
        niveau=" ";
    };
    //Constructeur parametré
    public Joueur (String gender, String level) {
        sexe=gender;
        niveau=level;
    }
    
    
    //Methode d'affichage 
    void affiche (){    
    }
    // Methode niveau 
    void setniveau (){
        if (npj>=100) this.niveau="professionel";
        else this.niveau="amateur";
    }
    //Methode autoriser 
    static void Autoriser(Joueur J1,Joueur J2){
        
        if ((J1.niveau==J2.niveau) && (J1.sexe==J2.sexe) )
            System.out.println("Autorisés");
        if (J1.niveau!=J2.niveau) 
            System.out.println("Non autorisés: joueurs de niveaux différents");
        if (J1.sexe!=J2.sexe) 
            System.out.println("Non autorisés: joueurs de sexes différents");
        
    }
    public static void main (String[] args) {
    Joueur Jx=new Joueur ("homme","professionnel");
    Joueur Jy=new Joueur ("femme","amateur");
    Autoriser(Jx,Jy);
    } 
}
