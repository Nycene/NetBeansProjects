package Heritage;

/**
 *
 * @author Naycene Boussoffara
 */
public class Etudiant extends Personne {
    private final int cne;

    public Etudiant(String nom, String prenom,int cne) {
        super(nom, prenom);
        this.cne=cne;
    }
    @Override
    public String toString(){
        return ("L'etudiant"+this.nom+ " "+this.prenom);
    }
}
