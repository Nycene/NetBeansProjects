package EtudFiliere.java;

import java.util.Date;

/**
 *
 * @author Naycene Boussoffara
 */
public class Etudiant {
    //Attributs 
    private final Integer id;
    private final String nom;
    private final String prenom;
    private final String datedenaissance;
    private Filiere Filiere;
    private static Integer count=0;
    //Constructeur

    public Etudiant( String nom, String prenom, String datedenaissance,Filiere Filiere) {
        this.id = ++count;
        this.nom = nom;
        this.prenom = prenom;
        this.datedenaissance = datedenaissance;
        this.Filiere=Filiere;
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

    public String getDatedenaissance() {
        return datedenaissance;
    }

    public Filiere getFiliere() {
        return Filiere;
    }
    
    
    @Override
    public String toString() {
       return (this.nom+ " " +this.prenom+ " "+this.datedenaissance); 
    }
    
}
