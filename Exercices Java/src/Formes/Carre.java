package Formes;
/**
 *
 * @author Naycene Boussoffara
 */
public class Carre extends Forme {
    
    //Attributs 
    private String nom="Carré";
    //Constructeur
    public Carre(double parametre) {
        super(parametre);
    }
    //Methodes
   public String getNom() {
        return nom;
    }
    
    @Override
    public String toString(){
        return(this.getNom()+" ( Coté "+this.getParametre()+" cm):");
    }
}
