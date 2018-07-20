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
public class Segment extends Point {
    //Attributs 
    Point extr1= new Point ();
    Point extr2= new Point ();
    //Constructeur 
    public Segment (Point A,Point B){
    }
    //Methode ordonne 
    void ordonne (){
        int c;
        if (this.extr1.x > this.extr2.x) 
           { c=extr1.x;
            extr1.x=c;
            c=extr2.x;}
    }
    //Methode longueur du segment
    double longueur (){
        return (this.extr2.x-this.extr1.x);
    }
    //Methode appartenance 
    boolean appartient (Point x){
        if (x.x<this.extr2.x && x.x>this.extr1.x && x.y<this.extr2.y && x.y>this.extr1.y)
                return true;
        else 
           return false;
    }
    //Methode affiche 
    @Override
    void affiche (){
        System.out.println("Les extremités du segment (" + this.extr1.x + "," +this.extr1.y+ ")" + "(" + this.extr2.x + "," +this.extr2.y+ ")");
    }
}

