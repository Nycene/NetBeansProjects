package examentp;
public class Antibiotique extends Medicament {
   //Attributs 
    private int age_min;
   //Constructeur 
   public Antibiotique (int age_min){
       this.nom=nom;
       this.prix=prix;
       this.stock=stock;
       this.age_min=age_min;
   } 
   
    @Override
    public void afficher() {
        System.out.println("Les caracteristiques du medicament sont");
        System.out.println(this.nom);
        System.out.println(this.prix);
        System.out.println(this.stock);
        System.out.println(this.age_min);
        
    }

    @Override
    public void getprix() {
        System.out.println("Le prix du medicament est:");
        System.out.println(this.prix);
    }
}
