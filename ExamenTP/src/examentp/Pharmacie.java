package examentp;

import java.util.List;

public class Pharmacie 
{   
    //Attributs 
    int nb_client;
    int nb_medi;
    List L1;
    List L2;
    //Methodes
    public void lister_medicament(){
    int i;
    for (i=0;i<nb_medi;i++) {
        System.out.println(L1.get(i));
}}
    public void lister_clients(){
        int i;
    for (i=0;i<nb_client;i++) {
        System.out.println(L2.get(i));
}
    }
    public void ajouter_medicament(Medicament M){
        L1.add(M);
    }
    public void ajouter_client(Client_fidele C){
        L2.add(C);
    }
    public void achat(String nom,String nom_med,double quantite,double somme_payee){
       //Medicament M; Client_fidele C;
        M.stock=(int) (M.stock-quantite);
        C.credit=(int) M.prix=somme_payee;
        
        
    }
   
    
}
