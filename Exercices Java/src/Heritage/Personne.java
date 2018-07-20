package Heritage;
/**
 *
 * @author Naycene Boussoffara
 */
public class Personne {
    //Attributs
    protected int id;
    protected String nom;
    protected String prenom;
    //Constructeur 

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    @Override
    public String toString(){
        return ("Je suis"+ " "+this.nom+" "+this.prenom);
    }
    
}
