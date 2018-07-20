package Heritage;
/**
 *
 * @author Naycene Boussoffara
 */
public class Employe extends Personne {
    protected double salaire;

    public Employe(String nom, String prenom,double salaire) {
        super(nom, prenom);
        this.salaire=salaire;
    }
    @Override
    public String toString(){
        return ("L'Employe "+" "+this.nom+" "+this.prenom+" "+ "a pour salaire"+ " "+ this.salaire);
    }
}
