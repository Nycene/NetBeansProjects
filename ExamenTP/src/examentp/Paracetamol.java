package examentp;
public class Paracetamol extends Medicament {
    //Attributs 
    private String voie_admin;
    //Constructeur 
    public Paracetamol(String voie_admin,String nom,double prix,int stock){
        this.voie_admin=voie_admin;
        this.nom=nom;
       this.prix=prix;
       this.stock=stock;
    }
    //Methodes 
    public void afficher (){
        System.out.println("Les caracteristiques du medicament sont");
        System.out.println(this.nom);
        System.out.println(this.prix);
        System.out.println(this.stock);
        System.out.println(this.voie_admin);
    }

    @Override
    public void getprix() {
       System.out.println("Le prix du medicament est:");
        System.out.println(this.prix);
        
    }
    
}
