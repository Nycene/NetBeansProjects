package CollectionExercice;

/**
 *
 * @author Naycene Boussoffara
 */
public class Stagiaire {
    //Attributs 
    private final String nom;
    private final String prenom;
    //Constructeur 

    public Stagiaire(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    @Override
    public String toString(){
        return("Le stagiaire : "+this.nom+" "+this.prenom);
        
    }
}
