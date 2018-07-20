package examentp;
public class ProduitEsthetique extends Medicament {
    //Attributs 
    private double cout;
    //Constructeur
    public ProduitEsthetique(String nom,int stock,double prix){
       this.nom=nom;
       this.stock=stock;
       this.cout=prix-prix*0.1;   
    }

    @Override
    public void afficher() {
        System.out.println("Les caracteristiques du medicament sont");
        System.out.println(this.nom);
        System.out.println(this.prix);
        System.out.println(this.stock);
        System.out.println(this.cout);
    }

    @Override
    public void getprix() {
       System.out.println("Le prix du medicament est:");
        System.out.println(this.cout);
    }
}
