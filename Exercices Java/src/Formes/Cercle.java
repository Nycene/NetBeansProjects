package Formes;

/**
 *
 * @author Naycene Boussoffara
 */
public class Cercle extends Forme {
    //Attributs
    private final String nom="Cercle";
    //Constructeur
     public Cercle(int parametre) {
        super(parametre);
    }
    //Methodes
     @Override
    public double getSurface(){
        return this.getParametre()*this.getParametre()*Pi;
    }

    public String getNom() {
        return nom;
    }
    
    @Override
    public String toString(){
        return(this.getNom()+" (Cercle "+this.getParametre()+" cm):");
    }
}
