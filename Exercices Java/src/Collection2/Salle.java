package Collection2;

import java.util.Scanner;

/**
 *
 * @author Naycene Boussoffara
 */
public class Salle {
    //Attributs 
private final int id;
private int code;
private String libelle;
private static int count;
    //Constructeur

    public Salle(){
       System.out.println("Donner le code de la salle\n");
       Scanner sc1=new Scanner(System.in);
       this.code=sc1.nextInt();
       System.out.println("Donner le libelle de la salle\n");
       Scanner sc2=new Scanner(System.in);
       this.libelle=sc2.nextLine();
       this.id=++count;
    }

    public int getId() {
        return id;
    }

    public int getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }
    public void setId(int code){
        this.code=code;
    }
    public void setLibelle(String libelle){
        this.libelle=libelle;
    }
    
@Override
  public String toString(){
      return("Le code de la salle " +this.libelle+ " est: " +this.code);

  }
}
