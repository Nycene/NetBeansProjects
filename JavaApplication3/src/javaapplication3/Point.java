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
public class Point {
    //Attributs
    protected int x;
    protected int y;
    //Constructeur parametré 
    public Point(int abscisse, int ordonnee){
        x=abscisse;
        y=ordonnee;
    }
    //Constructeur par défaut 
    public Point () {
        x=0;
        y=0;
    }
    //Accesseur 
    public int getX (){
        return x;
    }
    public int getY (){
        return y;
    }
    //Mutateur
    public void setX (int X){
        x=X;
    }
    public void setY (int Y){
        y=Y;
    }
    //Méthode distance
    double distance (Point P) {
    return(java.lang.Math.sqrt((this.x-P.x)*(this.x-P.x)-(this.y-P.y)*(this.y-P.y)));
    }
    //Méthode deplacer 
    int deplacer (int x,int y){
        return (x=+y);
    }
    //Méthode translater 
    int translater (int dx,int dy){
        return 0;
    }
    //Méthode affiche 
    void affiche (){
        System.out.println ("Labscisse est :" + x + " Lordonnee est :" + y );
    }
    //Main 
    public static void main (String[] args) {}
    }
   
