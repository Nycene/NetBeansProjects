public class Livre { 
    //Attributs 
    private String titre,auteur;
    private int nbpages;

    //Constructeur 
    public Livre (String unAuteur, String unTitre) {
        auteur=unAuteur;
        titre=unTitre;
    }
    //Acesseur 
    public String getAuteur (){
        return auteur;
    }
    public String getTitre(){
        return titre;
    }
    public int getNbpage (){ 
        return nbpages;
    }
    //Modificateur 
    void setNbpages (int n){
        if (n>0) nbpages=n;
        else System.out.println("Error message");
    }
    void setTitre (String Title) {
        titre=Title;
    }
    void setAuteur (String Author) {
        auteur=Author;
    }
     public static void main (String[] args){
   Livre A=new Livre("Alphonse Daudet", "Le petit Chose");
   Livre B=new Livre("Stephan Hawking","The Grand Design");
   System.out.println(A.getAuteur());
   System.out.println(B.getAuteur());
   A.setNbpages(20);
   B.setNbpages(29);
   System.out.println(A.getNbpage());
   System.out.println(B.getNbpage());
   System.out.println(A.getNbpage() + B.getNbpage());
    }
}




