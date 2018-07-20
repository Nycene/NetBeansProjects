package Heritage;

/**
 *
 * @author Naycene Boussoffara
 */
public class Professeur extends Employe {
    private String specialite;

    public Professeur(String nom, String prenom, double salaire,String specialite) {
        super(nom, prenom, salaire);
        this.specialite=specialite;
    }
    @Override
    public String toString(){
        return ("Le Professeur "+ " "+this.nom+" "+this.prenom+" "+" a pour salaire"+this.salaire+" et pour specialite:"+this.specialite);
    }
}
