package examentp;
public class Client_fidele {
    //Attributs 
    private String nom;
    private String prenom;
    private double cin;
    int credit;
    //Constructeur 
    public Client_fidele (String nom,String prenom,double cin){
        this.nom=nom;
        this.prenom=prenom;
        this.cin=cin;
        this.credit=0;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getCin() {
        return cin;
    }

    public int getCredit() {
        return credit;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCin(double cin) {
        this.cin = cin;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
    //Redefinition de la methode toString()
    @Override
    public String toString() {
        String s;
        int s1;
        s=this.getNom();
        s1=this.getCredit();
        System.out.println("Le client a comme credit");
        return "a";
    }
    
}
