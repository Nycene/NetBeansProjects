
package ProfSpec.java;

/**
 *
 * @author Naycene Boussoffara
 */
public class Professeur {
    //Attributs 
    private Integer id;
    private final String nom;
    private final String prenom;
    private final Integer telephone;
    private final String email;
    private final Specialite specialité;
    //Constructeur 
    public Professeur(String nom, String prenom, Integer telephone, String email,Specialite specialité) {
        this.id++;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.specialité=specialité;
    }

    public Specialite getSpecialité() {
        return specialité;
    }

    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return this.nom+ " " +this.prenom+ " " +this.email;
    }
    
}
