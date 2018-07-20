package EtudFiliere.java;
/**
 *
 * @author Naycene Boussoffara
 */
public class Filiere {
    //Attributs 
    private Integer id;
    private final String code;
    private final String libelle;
    //Constructeur 
    
    public Filiere(String code, String libelle) {
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
        return "Filiere"+ " " +this.libelle;
    }
    
}