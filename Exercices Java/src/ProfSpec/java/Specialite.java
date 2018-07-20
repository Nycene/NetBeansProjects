
package ProfSpec.java;

/**
 *
 * @author Naycene Boussoffara
 */
public class Specialite {
    //Attributs 
    private Integer id;
    private final String code;
    private final String libelle;
    //Constructeur 

    public Specialite(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    public Integer getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }
  

    @Override
    public String toString() {
        return "Specialité"+ " " +this.libelle;
    }
    
}
