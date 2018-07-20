/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formes;

/**
 *
 * @author Naycene Boussoffara
 */
public class Forme {
    //Attributs 
    protected static double Pi=3.14;
    private final double parametre;
    //Constructeur 
    public Forme(double parametre) {
        this.parametre = parametre;
    }
    //Methodes
    public double getSurface(){
        return this.getParametre()*this.getParametre();
    }
    
    public double getParametre() {
        return parametre;
    }
    
}
